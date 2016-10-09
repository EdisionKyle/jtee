package com.loner.base;

public class TestSwitch {

	public static void main(String[] args) {
		int i = 0;
		int j = 1;
		switch (i) {
		case 0:
			j = 1;
//			break;
		case 2:
			j = 2;
//			break;
		case 10:
			j = 10;
		}
		System.out.println("j=" + j);
	}
}