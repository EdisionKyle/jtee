package com.loner.ds;

public class BubbleSort {

	public static void main(String[] args) {
		int intarr[] = new int[10];
		for (int i = 0; i < intarr.length; i++) {
			intarr[i] = (int) (Math.random() * 100);
		}
		bubbleSort(intarr);
		printData(intarr);
		System.out.println();
		System.out.println("----------------");
		System.out.println();

		java.util.Random r = new java.util.Random();
		for (int i = 0; i < 10; i++) {
			System.out.print(r.nextInt(100) + "  ");
		}
	}

	public static void bubbleSort(int[] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i] > data[j]) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
	}
	
	public static void printData(int[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + "  ");
		}
		System.out.println();
	}

}
