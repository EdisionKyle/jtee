package com.loner.inteview;

public class OperationBitTest {

	public static void main(String[] args) {
		int a = 15, b = 6;
		// 00001111
		// 00000110
		// 11110000
		System.out.println("a & b==" + (a & b));
		System.out.println("a | b==" + (a | b));
		System.out.println("a ~ b==" + (~a));
		System.out.println("a ^ b==" + (a ^ b));
		System.out.println("2<<3==" + (2 << 3));
		System.out.println("16>>3==" + (16 >> 3));
		System.out.println("-5 >>> 3==" + (-5 >>> 3));
		System.out.println("5 >>> 3==" + (5 >>> 3));
	}

}
