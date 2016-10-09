package com.loner.thread.simple;

/**
 * 线程的调度(合并)
 */
public class ThreadJoin {
	public static void main(String[] args) {
		ThreadJoin join = new ThreadJoin();
		Thread t1 = join.new MyThread1();
		t1.start();

		for (int i = 0; i < 20; i++) {
			System.out.println("主线程第" + i + "次执行！");
			if (i > 2)
				try {
					// t1线程合并到主线程中，主线程停止执行过程，转而执行t1线程，直到t1执行完毕后继续。
					t1.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
	}
//	b线程执行，a线程join后，直接执行完a，然后才执行b

	class MyThread1 extends Thread {
		public void run() {
			for (int i = 0; i < 100; i++) {
				System.out.println("线程1第" + i + "次执行！");
			}
		}
	}
}