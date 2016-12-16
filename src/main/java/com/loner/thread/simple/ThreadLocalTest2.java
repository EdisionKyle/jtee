/**
 *  工程名：jtee
 *  文件名：ThreadLocalTest2.java
 *  包名：com.loner.thread.simple
 *  创建时间：2016年12月16日 下午5:09:21
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 */
package com.loner.thread.simple;
/**
 *  类名：ThreadLocalTest2
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年12月16日 下午5:09:21
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 */
public class ThreadLocalTest2 {
	//https://my.oschina.net/clopopo/blog/149368 详细解释
	private static Index num = new Index();
	// 创建一个Index类型的本地变量
	private static ThreadLocal<Index> local = new ThreadLocal<Index>() {
		@Override
		protected Index initialValue() {
			return num;
		}
	};

	public static void main(String[] args) throws InterruptedException {
		Thread[] threads = new Thread[5];
		for (int j = 0; j < 5; j++) {
			threads[j] = new Thread(new Runnable() {
				@Override
				public void run() {
					// 取出当前线程的本地变量，并累加1000次
					Index index = local.get();
					for (int i = 0; i < 1000; i++) {
						index.increase();
					}
					System.out.println(Thread.currentThread().getName() + " : " + index.num);
				}
			}, "Thread-" + j);
		}
		for (Thread thread : threads) {
			thread.start();
		}
	}

	static class Index {
		int num;
		public void increase() {
			num++;
		}
	}

}
