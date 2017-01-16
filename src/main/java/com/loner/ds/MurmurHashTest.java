package com.loner.ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import redis.clients.util.MurmurHash;

/**
 * 基于MurmurHash一致性哈希算法生成可以稳定到分片的key
 * 
 * @author milesloner
 * @创建时间 2017-01-14
 */
public class MurmurHashTest {

	// jedis中使用的murmur hash
	MurmurHash murmur = new MurmurHash();

	// 每个value都相当于是一个分片编号，虚拟节点
	TreeMap<Long, Integer> tm = new TreeMap<Long, Integer>();

	// 计数器
	static Map<String, Integer> countMap = new HashMap<String, Integer>();

	// 可认为是实际的server分片，真实机器节点
	List<Shard> shards = null;

	// 实际server端分片数量，根据实际情况而定，这里以server为16个分片为例
	int serverShards = 16;

	// key=shard编号 value 第一个放入shard的key
	static Map<Integer, String> keyShardMap = new HashMap<Integer, String>();

	void init() {
		shards = new ArrayList<Shard>();
		Shard sd = null;
		for (int i = 0; i < serverShards; i++) {
			sd = new Shard();
			/**
			 * 默认权重是1，如果修改，即使将全部的shard都修改为10 那么key映射到的shard也会随之改变
			 */
			sd.setWeiht(1);
			// 默认情况下没有名字，name也会影响hash分片的结果
			// sd.setName("shard"+i);
			shards.add(sd);
		}
	}

	void start() {// 初始化一致性hash环
		int i = 0;
		// 遍历分片
		for (Shard sd : shards) {
			if (sd.getName() == null) {
				// 将每个分片，分散的映射到treeMap空间,即在红黑树上生成了大量的虚拟分片
				for (int n = 0; n < 160 * sd.getWeiht(); n++) {
					tm.put(murmur.hash("SHARD-" + i + "-NODE-" + n), i);
				}
			} else {
				for (int n = 0; n < 160 * sd.getWeiht(); n++) {
					tm.put(murmur.hash(sd.getName() + "*" + sd.getWeiht() + n),
							i);
				}
			}
			i++;
		}
	}

	void test() {
		String key;
		// 随机生成一万个key
		for (int i = 0; i < 10000; i++) {
			key = "key" + i;
			// 沿环的顺时针找到一个虚拟节点
			SortedMap<Long, Integer> sm = tm.tailMap(murmur.hash(key));
			int d;
			if (sm.isEmpty()) {
				// 找到了她的shard
				d = tm.get(tm.firstKey());
				System.out.println(String.format("%s = shard%s", key, d));
				count(d);
				if (!keyShardMap.containsKey(d)) {
					keyShardMap.put(d, key);
				}
				continue;
			}
			// 返回该虚拟节点对应的真实机器节点的信息
			d = tm.get(sm.firstKey());
			System.out.println(String.format("%s = shard%s", key, d));
			count(d);
			if (!keyShardMap.containsKey(d)) {
				keyShardMap.put(d, key);
			}
		}
	}

	static void count(int d) {
		if (countMap.containsKey("shard" + d)) {
			int c = countMap.get("shard" + d);
			countMap.put("shard" + d, ++c);
		} else {
			countMap.put("shard" + d, 1);
		}
	}

	static void print() {
		System.out.println(String.format(
				"----------%d个分片中key的数量统计-------------", countMap.size()));
		for (String mkey : countMap.keySet()) {
			System.out.println(String.format("分片%s中key的数量%s个", mkey,
					countMap.get(mkey)));
		}
		System.out.println(String.format(
				"-----------%d个分片中稳定的key统计-------------", keyShardMap.size()));
		for (int i : keyShardMap.keySet()) {
			System.out.println(String.format("第一个稳定到分片%s的key是%s", i,
					keyShardMap.get(i)));
		}
	}

	public static void main(String[] args) {
		MurmurHashTest m = new MurmurHashTest();
		m.init();
		m.start();
		m.test();
		print();
	}

}
