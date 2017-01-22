package com.loner.thread.locks;

/**
 * 代码块同步
 * 
 * 虽然线程1和线程2都进入了对应的方法开始执行，但是线程2在进入同步块之前，需要等待线程1中同步块执行完成
 * 
 * @author pengcheng.tian
 *
 */
public class SynchronizedBlockTest {

	public void method1() {
		System.out.println("Method 1 start");
		try {
			synchronized (this) {
				System.out.println("Method 1 execute");
				Thread.sleep(3000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Method 1 end");
	}

	public void method2() {
		System.out.println("Method 2 start");
		try {
			synchronized (this) {
				System.out.println("Method 2 execute");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Method 2 end");
	}

	public static void main(String[] args) {
		final SynchronizedBlockTest test = new SynchronizedBlockTest();

		new Thread(new Runnable() {
			@Override
			public void run() {
				test.method1();
			}
		}).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				test.method2();
			}
		}).start();
	}

}
