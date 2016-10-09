package com.loner.thread.simple;

public class LifeCycle extends Thread {

	/**
	 * 生命周期
	 */
	public void run() {
		int n = 0;
		while ((++n) < 1000) {
		}
	}

	public static void main(String[] args) {
		try {
			LifeCycle thread = new LifeCycle();
			System.out.println("isAlive: " + thread.isAlive());
			thread.start();
			System.out.println("isAlive: " + thread.isAlive());
			thread.join(); // 等线程thread结束后再继续执行
			System.out.println("thread已经结束!");
			System.out.println("isAlive: " + thread.isAlive());
			System.out.println("isInterrupted: " + thread.isInterrupted());
			thread.interrupt();
			System.out.println("thread已经Interrupt!");
			System.out.println("isInterrupted: " + thread.isInterrupted());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
