package com.loner.inteview;

import java.io.UnsupportedEncodingException;

public class UnicodeTest1 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		System.out.println("a(Unicode)    ：" + "a".getBytes("Unicode").length);
		System.out.println("aa(Unicode)    ：" + "aa".getBytes("Unicode").length);
		System.out.println("啊(Unicode)   ：" + "啊".getBytes("Unicode").length);
		System.out.println("啊啊(Unicode) ：" + "啊啊".getBytes("Unicode").length);
		System.out.println("");
		System.out.println("a(GBK)    ：" + "a".getBytes("GBK").length);
		System.out.println("aa(GBK)    ：" + "aa".getBytes("GBK").length);
		System.out.println("啊(GBK)   ：" + "啊".getBytes("GBK").length);
		System.out.println("啊啊(GBK) ：" + "啊啊".getBytes("GBK").length);
		System.out.println("");
		System.out.println("a(UTF-8)    ：" + "a".getBytes("UTF-8").length);
		System.out.println("aa(UTF-8)   ：" + "aa".getBytes("UTF-8").length);
		System.out.println("啊(UTF-8)   ：" + "啊".getBytes("UTF-8").length);
		System.out.println("啊啊(UTF-8) ：" + "啊啊".getBytes("UTF-8").length);
		System.out.println("");
		System.out.println("a(UTF-16)    ：" + "a".getBytes("UTF-16").length);
		System.out.println("aa(UTF-16)   ：" + "aa".getBytes("UTF-16").length);
		System.out.println("啊(UTF-16)   ：" + "啊".getBytes("UTF-16").length);
		System.out.println("啊啊(UTF-16) ：" + "啊啊".getBytes("UTF-16").length);
	}

}
