package com.loner.base.lang;

/**
 * Integer
 * 
 * @author pengcheng.tian
 *
 */
public class IntegerTest {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.toUnsignedString(109383, 8));
		char c;
		for(int i = 60; i < 127; i++) {			
			c = (char)i;
			System.out.print(c);
		}
		
	}

	public static long getLong(String l) {
		return Long.parseLong(l);
	}

}
