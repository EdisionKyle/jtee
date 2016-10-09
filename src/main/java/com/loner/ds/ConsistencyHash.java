package com.loner.ds;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * 一致性哈希算法
 * 
 * @author Administrator
 *
 */
public class ConsistencyHash {
	// 虚拟节点
	private TreeMap<Long, Object> nodes = null;
	// 真实服务器节点信息
	private List<Object> shards = new ArrayList<Object>();
	// 每台机器节点关联的虚拟节点个数
	private static int VIRTUAL_NUM = 4;

	/**
	 * 初始化一致环
	 */
	public void init() {
		shards.add("192.168.0.0-服务器0");
		shards.add("192.168.0.1-服务器1");
		shards.add("192.168.0.2-服务器2");
		shards.add("192.168.0.3-服务器3");
		shards.add("192.168.0.4-服务器4");

		nodes = new TreeMap<Long, Object>();
		for (int i = 0; i < shards.size(); i++) {// 每个真实机器节点需要关联虚拟节点
			Object shardInfo = shards.get(i);
			for (int j = 0; j < VIRTUAL_NUM; j++) {// 关联VIRTUAL_NUM个虚拟节点
				nodes.put(hash("SHARD-" + i + "-NODE-" + j), shardInfo);
			}
		}
	}

	/**
	 * 根据key的hash值取得服务器节点信息
	 * 
	 * @param hash
	 * @return
	 */
	public Object getShardInfo(long hash) {
		Long key = hash;
		// 沿环的顺时针找到一个虚拟节
		SortedMap<Long, Object> tailMap = nodes.tailMap(key);
		if (tailMap.isEmpty()) {
			key = nodes.firstKey();
		} else {
			key = tailMap.firstKey();
		}
		// 返回该虚拟节点对应的真实机器节点的信息
		return nodes.get(key);
	}

	/**
	 * 打印圆环节点数据
	 */
	public void printMap() {
		System.out.println(nodes);
	}

	/**
	 * MurMurHash算法，是非加密HASH算法，性能很高， http://murmurhash.googlepages.com/
	 */
	private Long hash(String key) {
		ByteBuffer buf = ByteBuffer.wrap(key.getBytes());
		int seed = 0x1234ABCD;

		ByteOrder byteOrder = buf.order();
		buf.order(ByteOrder.LITTLE_ENDIAN);

		long m = 0xc6a4a7935bd1e995L;
		int r = 47;

		long h = seed ^ (buf.remaining() * m);
		long k;
		while (buf.remaining() >= 8) {
			k = buf.getLong();

			k *= m;
			k ^= k >>> r;
			k *= m;

			h ^= k;
			h *= m;
		}
		if (buf.remaining() > 0) {
			ByteBuffer finish = ByteBuffer.allocate(8).order(
					ByteOrder.LITTLE_ENDIAN);
			// for big-endian version, do this first:
			// finish.position(8-buf.remaining());
			finish.put(buf).rewind();
			h ^= finish.getLong();
			h *= m;
		}

		h ^= h >>> r;
		h *= m;
		h ^= h >>> r;

		buf.order(byteOrder);
		return h;
	}

	public static void main(String[] args) {
		Random ran = new Random();
		ConsistencyHash hash = new ConsistencyHash();
		hash.init();
		hash.printMap();
		// 循环50次，是为了取50个数来测试效果
		for (int i = 0; i < 50; i++) {
			System.out.println(hash.getShardInfo(hash.hash("SHARD-" + i
					+ "-NODE-" + ran.nextInt(ConsistencyHash.VIRTUAL_NUM))));
		}
	}

}