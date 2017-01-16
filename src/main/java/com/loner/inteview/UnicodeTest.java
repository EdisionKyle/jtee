package com.loner.inteview;


public class UnicodeTest {

	public static void main(String[] args) throws Exception {
		String str = "永";
		byte b[] = null;
		// UTF8汉字占三个字节
		b = str.getBytes("UTF-8");
		System.out.println("UTF8编码格式下，一个汉字占" + b.length + "字节: ");
		for (byte i : b) {
			System.out.format("%x ", i);
		}
		System.out.println();

		// 前面多的两个是字序标记
		b = str.getBytes("UTF-16");
		System.out.println("UTF16编码格式下，一个汉字占" + (b.length - 2) + "字节: ");
		for (byte i : b) {
			System.out.format("%x ", i);
		}
		System.out.println();

		// ANSI码小于128的字符占一个字节，其余占俩字节
		b = str.getBytes();
		System.out.println("默认编码" + System.getProperty("file.encoding")
				+ "编码格式下，一个汉字占" + b.length + "字节:");
		for (byte i : b) {
			System.out.format("%x ", i);
		}
	}

}
