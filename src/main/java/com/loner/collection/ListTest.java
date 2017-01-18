/**
 *  工程名：jtee
 *  文件名：ListTest.java
 *  包名：com.loner.collection
 *  创建时间：2016年12月26日 下午5:33:51
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 */
package com.loner.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 类名：ListTest 修改记录：// 修改历史记录，包括修改日期、修改者及修改内容 创建时间：2016年12月26日 下午5:33:51
 * Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 * @version V1.0
 * @author pengcheng.tian
 */
public class ListTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			list.add(i);
		}
		for (int i = 0; i < list.size(); i++) {
			if (i % 2 == 0) {
				list.remove(i);
			}
		}
		System.out.println("list.size()==" + list.size());
		for (Integer integer : list) {
			System.out.println(integer);
		}

		/*List<Long> list1 = new ArrayList<Long>();
		List<Long> list2 = new ArrayList<Long>();
		for (long l = 1; l < 100000; l++) {
			list1.add(l);
		}
		for (long j = 1; j < 500000; j++) {
			list2.add(j);
		}*/
		Set<Long> set1 = new HashSet<Long>();
		Set<Long> set2 = new HashSet<Long>();
		for (long l = 1; l < 2000000; l++) {
			set1.add(l);
		}
		for (long j = 1; j < 5000000; j++) {
			set2.add(j);
		}
		Set<Long> result = new HashSet<Long>();
		long aa = System.currentTimeMillis();
		result.clear();
		result.addAll(set1);
		result.retainAll(set2);
		long bb = System.currentTimeMillis();
		System.out.print("总数：" + result.size() + "；总共花费：" + (bb - aa) / 1000 + "秒");
	}

}
