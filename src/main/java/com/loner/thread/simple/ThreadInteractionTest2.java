package com.loner.thread.simple;

/**
 * 线程的交互
 */
public class ThreadInteractionTest2 extends Thread {
	ThreadSum2 sum;

	public ThreadInteractionTest2(ThreadSum2 sum) {
		this.sum = sum;
	}

	@Override
	public void run() {
		synchronized (sum) {
			try {
				System.out.println("等待对象sum完成计算。。。");
				// 当前线程ThreadInteractionTest等待
				sum.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "--sum对象计算的总和是：" + sum.total);
		}
	}

	public static void main(String[] args) {
		ThreadSum2 sum = new ThreadSum2();

		// 启动三个线程，分别获取计算结果
		new ThreadInteractionTest2(sum).start();
		new ThreadInteractionTest2(sum).start();
		new ThreadInteractionTest2(sum).start();

		// 启动计算线程
		sum.start();

	}
}