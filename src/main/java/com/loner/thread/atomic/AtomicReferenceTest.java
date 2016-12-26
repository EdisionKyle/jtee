/**
 *  工程名：jtee
 *  文件名：AtomicReferenceTest.java
 *  包名：com.loner.base
 *  创建时间：2016年12月26日 上午10:01:51
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 */
package com.loner.thread.atomic;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/**
 *  类名：AtomicReferenceTest
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年12月26日 上午10:01:51
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 */
public class AtomicReferenceTest {

	private static int threadCount = 10;
	private static CountDownLatch countDown = new CountDownLatch(threadCount);
	public static AtomicReference<User> atomicUserRef = new AtomicReference<User>();

	private static class ReferenceUpdater implements Runnable {
		User user;

		public ReferenceUpdater(User user) {
			this.user = user;
		}

		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				User oldUser = atomicUserRef.get();
				atomicUserRef.compareAndSet(oldUser, user);
				Thread.yield();
			}
			countDown.countDown();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread[] threads = new Thread[threadCount];
		for (int i = 0; i < threadCount; i++) {
			threads[i] = new Thread(new ReferenceUpdater(new User("小" + i, i)));
		}
		for (int i = 0; i < threadCount; i++) {
			threads[i].start();
			;
		}
		countDown.await();
		System.out.println(atomicUserRef.get().getName());
		System.out.println(atomicUserRef.get().getOld());
	}

	static class User {
		private String name;
		private int old;

		public User(String name, int old) {
			this.name = name;
			this.old = old;
		}

		public String getName() {
			return name;
		}

		public int getOld() {
			return old;
		}
	}

}
