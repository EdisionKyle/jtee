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
//		 char ch = '中';
		char ch = 'a';
		System.out.println(ch);
		System.out.println("------------Java数值类型------------");
		byte bt = 'a';
		System.out.println(bt + "  --  " + (char)bt);
		String str = "中";
//		 byte[] a = str.getBytes("GBK");
		byte[] a = str.getBytes("UTF-8");
		System.out.println(a.length);
		
//		byte be = -128;
		byte be = 127;
		System.out.println(be);
		char chr = (char)37;
		System.out.println(chr);
		
		System.out.println("------------");
		System.out.println(System.getProperty("file.encoding"));
		char han = '永';
		System.out.format("%x", (short) han);// 对第二个参数（短整型）格式化为十六进制输出，0x开头
		// 输出6c38
		char han1 = 0x6c38;
		System.out.println();
		System.out.println(han1);
		// 输出永
		int score = 89;
		char res = score > 90 ? 'A' : score > 60 ? 'B' : 'C';
		System.out.println("您的分数为：" + score + "；等级为：" + res);
	}
}
