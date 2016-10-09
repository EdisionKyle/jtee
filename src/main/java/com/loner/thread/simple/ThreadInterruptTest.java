package com.loner.thread.simple;

public class ThreadInterruptTest extends Thread {
	public void run() {
		try {
			sleep(10000); // 延迟10秒
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
/*
在调用interrupt方法后， sleep方法抛出异常，然后输出错误信息：sleep interrupted。

注意：在Thread类中有两个方法可以判断线程是否通过interrupt方法被终止。一个是静态的方法interrupted()，
一个是非静态的方法isInterrupted()，这两个方法的区别是interrupted用来判断当前线是否被中断，
而isInterrupted可以用来判断其他线程是否被中断。因此，while (!isInterrupted())也可以换成while (!Thread.interrupted())。
 */
	public static void main(String[] args) throws Exception {
		Thread thread = new ThreadInterruptTest();
		thread.start();
		System.out.println("在10秒之内按任意键中断线程!");
		int ii = System.in.read();
		thread.interrupt();
		System.out.println("输入值：" + ii);
		thread.join();
		System.out.println("线程已经退出!");
	}
}