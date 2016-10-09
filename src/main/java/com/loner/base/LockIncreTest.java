package com.loner.base;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockIncreTest {
	public int inc = 0;
	Lock lock = new ReentrantLock();//重入锁/递归无阻塞的同步机制
	/**
	1、首先判断锁有没有被持有，如果被持有，就判断持有锁的线程是不是当前线程，如果不是就啥也不做，
	返回获取失败，如果是就增加重入数，返回成功获取；

	2、如果锁没有被任何线程持有（c==0），首先判断当前结点前面是否还有线程在排除等待锁，如果有，直接返回获取失败，
	否则将锁持有数设为acquires，一般为1，然后设置锁的拥有者为当前线程，成功获取。*/
	
/*	synchronized，通常是指该代码具有 原子性（atomicity）和 可见性（visibility）。
	原子性意味着一个线程一次只能执行由一个指定监控对象（lock）保护的代码，从而防止多个线程在更新共享状态时相互冲突。
	可见性则更为微妙；它要对付内存缓存和编译器优化的各种反常行为。*/
	
	public void increase() {
		lock.lock();
		try {
			inc++;
		} finally {
			lock.unlock();
		}
	}

	public static void main(String[] args) {
		final LockIncreTest test = new LockIncreTest();
		for (int i = 0; i < 10; i++) {
			new Thread() {
				public void run() {
					for (int j = 0; j < 10000; j++)
						test.increase();
				};
			}.start();
		}

		while (Thread.activeCount() > 1)
			// 保证前面的线程都执行完
			Thread.yield();
		System.out.println(test.inc);
	}

}
