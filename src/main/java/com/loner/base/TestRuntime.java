package com.loner.base;

public class TestRuntime {

	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().maxMemory());
		System.out.println(Runtime.getRuntime().freeMemory());
		System.out.println(Runtime.getRuntime().totalMemory());
		System.out.println(Runtime.getRuntime().availableProcessors());
	}
}
