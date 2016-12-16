/**
 *  工程名：jtee
 *  文件名：ThreadLocalTest.java
 *  包名：com.loner.thread.simple
 *  创建时间：2016年12月16日 下午5:06:28
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 */
package com.loner.thread.simple;
/**
 *  类名：ThreadLocalTest
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年12月16日 下午5:06:28
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 */
public class ThreadLocalTest {

	// 创建一个Integer型的线程本地变量
	public static final ThreadLocal<Integer> local = new ThreadLocal<Integer>() {
		@Override
		protected Integer initialValue() {
			return 0;
		}
	};

	public static void main(String[] args) throws InterruptedException {
		Thread[] threads = new Thread[5];
		for (int j = 0; j < 5; j++) {
			threads[j] = new Thread(new Runnable() {
				@Override
				public void run() {
					// 获取当前线程的本地变量，然后累加5次
					int num = local.get();
					for (int i = 0; i < 5; i++) {
						num++;
					}
					// 重新设置累加后的本地变量
					local.set(num);
					System.out.println(Thread.currentThread().getName() + " : " + local.get());
				}
			}, "Thread-" + j);
		}

		for (Thread thread : threads) {
			thread.start();
		}
	}

}
