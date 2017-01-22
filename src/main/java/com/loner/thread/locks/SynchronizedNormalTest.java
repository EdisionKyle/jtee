package com.loner.thread.locks;

/**
 * 普通方法同步
 * 
 * 线程2需要等待线程1的method1执行完成才能开始执行method2方法
 * 
 * @author pengcheng.tian
 *
 */
public class SynchronizedNormalTest {

	public synchronized void method1() {
		System.out.println("Method 1 start");
		try {
			System.out.println("Method 1 execute");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Method 1 end");
	}

	public synchronized void method2() {
		System.out.println("Method 2 start");
		try {
			System.out.println("Method 2 execute");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Method 2 end");
	}

	public static void main(String[] args) {
		final SynchronizedNormalTest test = new SynchronizedNormalTest();

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
