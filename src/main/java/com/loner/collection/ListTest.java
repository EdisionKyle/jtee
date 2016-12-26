/**
 *  工程名：jtee
 *  文件名：ListTest.java
 *  包名：com.loner.collection
 *  创建时间：2016年12月26日 下午5:33:51
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 */
package com.loner.collection;

import java.util.ArrayList;
import java.util.List;

/**
 *  类名：ListTest
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年12月26日 下午5:33:51
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
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
	}

}
