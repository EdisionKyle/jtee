package com.loner.inteview;

/**
 * 二进制、八进制、十进制、十六进制
 * 
 * @author pengcheng.tian
 *
 */
public class RadixFormatTest {

	public static void main(String[] args) {
		int i = 99;
		System.out.println("转二进制：" + Integer.toBinaryString(i));
		System.out.println("转八进制：" + Integer.toOctalString(i));
		System.out.println("转十六进制：" + Integer.toHexString(i));
		System.out.println("------转10进制------");
		System.out.println("二进制：" + 0b01100011);
		System.out.println("八进制：" + 0143);
		System.out.println("十进制：" + 99);
		System.out.println("十六进制：" + 0x63);
	}

}
