package com.loner.thread.simple;

public class YieldTest implements Runnable {
	public void run() {
		for (int i = 0; i < 20; ++i) {
			System.out.println(Thread.currentThread().getName() + "运行" + i);
			if (i % 3== 0) {
				System.out.println(Thread.currentThread().getName() + "  线程的礼让");
				Thread.yield();
			}
		}
	}

	public static void main(String[] args) {
		Thread h1 = new Thread(new YieldTest(), "A");
		Thread h2 = new Thread(new YieldTest(), "B");
		h1.start();
		h2.start();

	}
}