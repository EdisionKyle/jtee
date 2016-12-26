/**
 *  工程名：jtee
 *  文件名：AtomicIntegerArrayTest.java
 *  包名：com.loner.base
 *  创建时间：2016年12月26日 上午9:53:33
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 */
package com.loner.thread.atomic;

import java.util.concurrent.CountDownLatch;

/**
 *  类名：AtomicIntegerArrayTest
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年12月26日 上午9:53:33
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 */
public class AtomicIntegerArrayTest {

	private static int threadCount = 1000;
	private static CountDownLatch countDown = new CountDownLatch(threadCount);
	static int[] values = new int[10];

	private static class Counter implements Runnable {
		@Override
		public void run() {
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 10; j++) {// 所有元素+1
					values[j]++;
				}
			}
			countDown.countDown();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread[] threads = new Thread[threadCount];
		for (int i = 0; i < threadCount; i++) {
			threads[i] = new Thread(new Counter());
		}
		for (int i = 0; i < threadCount; i++) {
			threads[i].start();
			;
		}
		countDown.await();
		for (int i = 0; i < 10; i++) {
			System.out.print(values[i] + " ");
		}
	}

}
