package com.loner.thread.simple;
/*
 * 轮询（Polling）是一种CPU决策如何提供周边设备服务的方式，又称“程控输出入”（Programmed I/O）。
 * 轮询法的概念是，由CPU定时发出询问，依序询问每一个周边设备是否需要其服务，有即给予服务，
 * 服务结束后再问下一个周边，接着不断周而复始。
 */
public class ThreadTester {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new ThreadTesterA());
		Thread t2 = new Thread(new ThreadTesterB());
		t1.start();
		t1.join(); // wait t1 to be finished 等待该线程终止
		t2.start();
		t2.join(); // in this program, this may be removed
	}
}

class ThreadTesterA implements Runnable {

	private int counter;

	public void run() {
		while (counter <= 10) {
			System.out.println("Counter = " + counter + " ");
			counter++;
		}
		System.out.println();
	}
}

class ThreadTesterB implements Runnable {

	private int i;

	public void run() {
		while (i <= 10) {
			System.out.println("i = " + i + " ");
			i++;
		}
		System.out.println();
	}
}