package com.loner.base;

public class SystemTest {

	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		System.gc();
		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getProperty("java.home"));
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.lineSeparator());
		System.exit(0);
	}

}
