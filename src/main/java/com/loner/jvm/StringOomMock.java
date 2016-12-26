package com.loner.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * 内存溢出测试，分别使用JDK1.6、1.7、1.8测试
 * 
 * @author Administrator
 *
 */
public class StringOomMock {
	static String base = "string";

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			String str = base + base;
			base = str;
			list.add(str.intern());
		}
	}

}
