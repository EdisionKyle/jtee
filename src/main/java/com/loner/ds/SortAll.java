package com.loner.ds;

public class SortAll {
	public static void main(String[] args) {
		int[] data = { 5, 6, 12, 4, 9, 3, 23, 39, 403, 596, 87, 1 };
	/*	System.out.println("----冒泡排序：----");
		bubbleSort(data);
		printData(data);
		System.out.println("----选择排序：----");
		selectSort(data);
		printData(data);*/
		printData(data);
		System.out.println("----插入排序：----");
		insertSort(data);
		printData(data);
		System.out.println("----希尔排序：----");
		shellSort(data);
		printData(data);
		System.out.println("----快速排序：----");
		quickSort(data, 0, data.length - 1);
		printData(data);
	}

	// 冒泡排序 O(n^2)
	// 5, 6, 12, 4, 9, 3, 23, 39, 403, 596, 87, 1
	public static void bubbleSort(int[] data) {
		int temp = 0;
		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i] > data[j]) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
	}

	// 选择排序  O(n^2)
	// 5, 6, 12, 4, 9, 3, 23, 39, 403, 596, 87, 1
	public static void selectSort(int[] data) {
		int lowerIndex = 0;
		int temp = 0;
		for (int i = 0; i < data.length; i++) {
			lowerIndex = i;
			for (int j = i + 1; j < data.length; j++) {
				if (data[j] < data[lowerIndex]) {
					lowerIndex = j;
				}
			}
			temp = data[i];
			data[i] = data[lowerIndex];
			data[lowerIndex] = temp;
		}
	}

	// 插入排序
	// 5, 6, 12, 4, 9, 3, 23, 39, 403, 596, 87, 1
	public static void insertSort(int[] data) {
		for (int i = 1; i < data.length; i++) {
			for (int j = i; j > 0; j--) {
				if (data[j] < data[j - 1]) {
					int temp = data[j];
					data[j] = data[j - 1];
					data[j - 1] = temp;
				}
				printData(data);
			}
		}
	}

	// 希尔排序
	public static void shellSort(int[] data) {
		int temp;
		for (int k = data.length / 2; k > 0; k /= 2) {
			for (int i = k; i < data.length; i++) {
				for (int j = i; j >= k; j -= k) {
					if (data[j - k] > data[j]) {
						temp = data[j - k];
						data[j - k] = data[j];
						data[j] = temp;
					}
				}
			}
		}
	}

	// 快速排序
	public static void quickSort(int[] data, int left, int right) {
		int i = left;
		int j = right;
		int middle = data[left];
		while (true) {
			while (++i < right - 1 && data[i] < middle)
				;
			while (--j > left && data[j] > middle)
				;
			if (i >= j) {
				break;
			}
			int temp = data[j];
			data[j] = data[j - 1];
			data[j - 1] = temp;
		}
		data[left] = data[j];
		data[j] = middle;

		if (left < j) {
			quickSort(data, left, j);
		}
		if (i < right) {
			quickSort(data, i, right);
		}
	}

	// 打印数组
	public static void printData(int[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + "\t");
		}
		System.out.println();
	}
}
