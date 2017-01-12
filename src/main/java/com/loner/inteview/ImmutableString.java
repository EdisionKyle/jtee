package com.loner.inteview;

import java.awt.Point;

/**
 * 不可变对象
 * 
 * @author pengcheng.tian
 *
 */
public class ImmutableString {

	public static void main(String[] args) {
		// String,immutable
		String str = new String("new book");
		System.out.println(str);
		str.replaceAll("new", "old");
		System.out.println(str);
		System.out.println("返回新值：" + str.replaceAll("new", "old"));
		// Point,mutable
		Point point = new Point(0, 0);
		System.out.println(point);
		point.setLocation(1, 0);
		System.out.println(point);
		
		String str1 = new String("xyz");
		change(str1);
		System.out.println(str1);
	}

	public static void change(String s) {
		s = "xml";
	}

}
