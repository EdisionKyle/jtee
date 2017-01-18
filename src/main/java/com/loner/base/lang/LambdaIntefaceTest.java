package com.loner.base.lang;

/**
 * FunctionalInterface测试
 * 
 * @author Administrator
 *
 */
public class LambdaIntefaceTest {

	public static void main(String[] args) {
		LambdaInteface li = (() -> {
			System.out.println("我是Lambda表达式...");
			System.out.println("好酷...");
		});
		li.print();
	}

}
