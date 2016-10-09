package com.loner.inteview;

import java.io.UnsupportedEncodingException;

public class BaseTypeTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		System.out.println("------------Java布尔类型------------");
		boolean bl = false;
		System.out.println(bl);
		System.out
				.println("------------Java字符类型，char在Java中是16位的，因为Java用的是Unicode；"
						+ "gbk/gb2312是2个字节，utf-8是3个字节------------");
		// char ch = '中';
		char ch = 'a';
		System.out.println(ch);
		System.out.println("------------Java数值类型------------");
		byte bt = 'a';
		System.out.println(bt + "  --  " + (char)bt);
		String str = "中";
		// byte[] a = str.getBytes("GBK");
		byte[] a = str.getBytes("UTF-8");
		System.out.println(a.length);
		
//		byte be = -128;
		byte be = 127;
		System.out.println(be);
		char chr = (char)-3;
		System.out.println(chr);
	}
}
