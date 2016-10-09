package com.loner.common;

public class EyeEye {
	int i = 40;
	int j;

	public EyeEye() {
		setValue(i++);
	}

	void setValue(int inputValue) {
		int i = 20;
		// j = this.i + 1;
		j = i + 1;
		System.out.println("j= " + j);
	}

	public static void main(String[] args) {
		new EyeEye();

		int score = 9;
		switch (score) {
		case 0:
			System.out.println();
		case 2:
			System.out.println("Best");
		default:
			System.out.println("Error");
		case 1:
			System.out.println("Good");
			break;
		}
	}

}
