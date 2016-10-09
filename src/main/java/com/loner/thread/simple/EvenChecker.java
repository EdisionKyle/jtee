package com.loner.thread.simple;

public class EvenChecker implements Runnable {

	private EvenGenerator generator;

	public EvenChecker(EvenGenerator generator) {
		this.generator = generator;
	}

	public void run() {
		int nextValue;
		while (!generator.isCancled()) {
			nextValue = generator.next();
			if (nextValue % 2 != 0) {
				System.out.println(nextValue + "不是一个偶数!");
				generator.cancle();
			}
		}
	}
}