package com.loner.thread.simple;

/**
 *使用退出标志终止线程
 *
 *Java语言规范中指出：为了获得最佳速度，允许线程保存共享成员变量的私有拷贝，
 *而且只当线程进入或者离开同步代码块时才与共享成员变量的原始值对比。
 *
 *对于这个成员变量不能保存它的私有拷贝，而应直接与共享成员变量交互
 *由于使用volatile屏蔽掉了VM中必要的代码优化，所以在效率上比较低，因此一定在必要时才使用此关键字
 */
public class ThreadInterruptFlag extends Thread {
	public volatile boolean exit = false;
//使用Java关键字volatile，目的是使exit同步，也就是说在同一时刻只能由一个线程来修改exit的值
	public void run() {
		while (!exit)
			;
	}

	public static void main(String[] args) throws Exception {
		ThreadInterruptFlag thread = new ThreadInterruptFlag();
		thread.start();
		sleep(5000); // 主线程延迟5秒
		thread.exit = true; // 终止线程thread
		thread.join();
		System.out.println("线程退出!");
	}
}