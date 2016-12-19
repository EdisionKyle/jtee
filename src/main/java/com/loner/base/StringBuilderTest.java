/**
 *  工程名：jtee
 *  文件名：StringBuilderTest.java
 *  包名：com.loner.base
 *  创建时间：2016年12月19日 下午3:11:49
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 */
package com.loner.base;
/**
 *  类名：StringBuilderTest
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年12月19日 下午3:11:49
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 */
public class StringBuilderTest {

	static String a;
	static long time;

	public static void main(String[] args) throws Exception {

		StringBuilder sb = new StringBuilder();
		StringBuilder sb3 = new StringBuilder();

		time = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			StringBuilder sb2 = new StringBuilder();
			sb2.append("someStr6ing");
			sb2.append("someS5tring2");
			sb2.append("some3Strin4g");
			sb2.append("so3meStr5ing");
			sb2.append("so2meSt7ring");
			a = sb2.toString();
		}
		System.out.println("Way2=" + (System.currentTimeMillis() - time));

		time = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			sb.delete(0, sb.length());
			sb.append("someString");
			sb.append("someString2");
			sb.append("someStrin4g");
			sb.append("someStr5ing");
			sb.append("someSt7ring");
			a = sb.toString();
		}
		System.out.println("Way1=" + (System.currentTimeMillis() - time));

		time = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {

			sb3.setLength(0);
			sb3.append("someStr55ing");
			sb3.append("some44String2");
			sb3.append("som55eStrin4g");
			sb3.append("some66Str5ing");
			sb3.append("so33meSt7ring");
			a = sb3.toString();
		}
		System.out.println("Way3=" + (System.currentTimeMillis() - time));
	}

}
