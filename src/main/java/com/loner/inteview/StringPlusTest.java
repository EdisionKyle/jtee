package com.loner.inteview;

import java.lang.reflect.Field;

/**
 * 见【面试/Tech/金典题目】
 * @author pengcheng.tian
 *
 */
public class StringPlusTest {

	int i = 10;

	public static void main(String[] args) throws Exception {
		String str = new String("jf");
		str += new StringPlusTest();
		str += null;
		System.out.println(str);
		System.out.println("---通过反射是可以修改所谓的不可变对象---");
		testReflection();
	}

	public String toString() {
		return " a.i =" + i + "\t";
	}

	/**
	 * 通过反射是可以修改所谓的"不可变"对象
	 * 
	 * @throws Exception
	 */
	public static void testReflection() throws Exception {

		// 创建字符串"Hello World"， 并赋给引用s
		String s = "Hello World";

		System.out.println("s = " + s); // Hello World

		// 获取String类中的value字段
		Field valueFieldOfString = String.class.getDeclaredField("value");

		// 改变value属性的访问权限
		valueFieldOfString.setAccessible(true);

		// 获取s对象上的value属性的值
		char[] value = (char[]) valueFieldOfString.get(s);

		// 改变value所引用的数组中的第5个字符
		value[5] = '_';

		System.out.println("s = " + s); // Hello_World
	}

}
