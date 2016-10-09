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
		int n = i++%5;
		System.out.println("i=" + i + "；n=" + n);
	}

}
