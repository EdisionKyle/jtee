/**
 *  工程名：jtee
 *  文件名：StringTest.java
 *  包名：com.loner.base
 *  创建时间：2016年12月19日 下午3:53:20
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 */
package com.loner.base;
/**
 *  类名：StringTest
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年12月19日 下午3:53:20
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 */
public class StringTest {

	final static int time = 50000; // 循环次数

	public StringTest() {

	}

	public void test(String s) {
		long begin = System.currentTimeMillis();
		for (int i = 0; i < time; i++) {
			s += "add";
		}
		long over = System.currentTimeMillis();
		System.out.println("操作" + s.getClass().getName() + "类型使用的时间为：" + (over - begin) + "毫秒");
	}

	public void test(StringBuffer s) {
		long begin = System.currentTimeMillis();
		for (int i = 0; i < time; i++) {
			s.append("add");
		}
		long over = System.currentTimeMillis();
		System.out.println("操作" + s.getClass().getCanonicalName() + "类型使用的时间为：" + (over - begin) + "毫秒");
	}

	public void test(StringBuilder s) {
		long begin = System.currentTimeMillis();
		for (int i = 0; i < time; i++) {
			s.append("add");
		}
		long over = System.currentTimeMillis();
		System.out.println("操作" + s.getClass().getName() + "类型使用的时间为：" + (over - begin) + "毫秒");
	}

	/* 对 String 直接进行字符串拼接的测试 */
	public void test2() {
		String s2 = "abcd";
		long begin = System.currentTimeMillis();
		for (int i = 0; i < time; i++) {
			@SuppressWarnings("unused")
			String s = s2 + s2 + s2;
		}
		long over = System.currentTimeMillis();
		System.out.println("操作字符串对象引用相加类型使用的时间为：" + (over - begin) + "毫秒");
	}

	public void test3() {
		long begin = System.currentTimeMillis();
		for (int i = 0; i < time; i++) {
			@SuppressWarnings("unused")
			String s = "abcd" + "abcd" + "abcd";
		}
		long over = System.currentTimeMillis();
		System.out.println("操作字符串相加使用的时间为：" + (over - begin) + "毫秒");
	}

	public static void main(String[] args) {
		String s1 = "abcd";
		StringBuffer st1 = new StringBuffer("abcd");
		StringBuilder st2 = new StringBuilder("abcd");
		StringTest tc = new StringTest();
		tc.test(s1);
		tc.test(st1);
		tc.test(st2);
		tc.test2();
		tc.test3();
	}

}
