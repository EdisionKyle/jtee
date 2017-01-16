package com.loner.common;

import java.math.BigInteger;

/**
 * Java类加载机制
 * 
 * @author Administrator
 *
 */
public class ClassLoaderTest {

	public static void main(String[] args) {
		System.out.println(System.getProperty("java.version"));
		System.out.println(Runtime.getRuntime().availableProcessors());
		BigInteger bint = new BigInteger("1000");
		System.out.println(bint.add(new BigInteger("19834")));
		int i = 10;
		int n = i++ % 5;
		System.out.println("i=" + i + "；n=" + n);

		ClassLoader c = ClassLoaderTest.class.getClassLoader(); // 获取Test类的类加载器

		System.out.println(c);

		ClassLoader c1 = c.getParent(); // 获取c这个类加载器的父类加载器

		System.out.println(c1);

		ClassLoader c2 = c1.getParent();// 获取c1这个类加载器的父类加载器

		System.out.println(c2);
		
		int[] ia = new int[5];
		System.out.println(ia.getClass().getClassLoader());
		
		Object oa = new Object[5];
		System.out.println(oa.getClass().getClassLoader());
		
		System.out.println(Operation.class.getClassLoader());
	}

}
