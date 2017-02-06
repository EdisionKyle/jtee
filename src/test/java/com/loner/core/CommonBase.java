package com.loner.core;

public class CommonBase {

	public static void main(String[] args) {
		System.out.println((int) 'A');

		int[] arr = { 2, 4, 3, 7, 2, 3, 3, 0, 7, 9, 1, 0, 9, 1, 8, 3, 0, 7, 0, 4, 3, 8, 7, 1, 6, 9, 0, 1, 6, 3, 3, 4, 1,
				5, 8, 1, 8, 1, 6, 8, 6, 4, 7, 3, 9, 5, 8, 7, 9, 1, 0, 7, 0, 2, 7, 7, 2, 7, 1, 5, 6, 9, 5, 0 };
		int a = 0;
		int b = 0;
		int len = arr.length;

		for (int i = 0; i < len; i++) {
			if (arr[i] % 2 == 0) {
				a++;
			} else {
				b++;
			}
		}
		System.out.println("偶数共有" + a + "个；奇数共有" + b + "个");
		
		System.out.println(13>>2);
		System.out.println(3<<2);
	}

}
