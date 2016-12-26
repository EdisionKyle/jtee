/**
 *  工程名：jtee
 *  文件名：AtomicBooleanTest.java
 *  包名：com.loner.thread.atomic
 *  创建时间：2016年12月26日 上午9:20:47
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 */
package com.loner.thread.atomic;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 *  类名：AtomicBooleanTest
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年12月26日 上午9:20:47
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 */
public class AtomicBooleanTest {

	public static void main(String[] args) {
		new Thread(new BarWorker("小三")).start();
		new Thread(new BarWorker("原配")).start();
	}

	private static class BarWorker implements Runnable {

//		private static boolean exists = false;
		private static AtomicBoolean exists = new AtomicBoolean(false);

		private String name;

		public BarWorker(String name) {
			this.name = name;
		}

		/*public void run() {
			if (!exists) {
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e1) {
					// do nothing
				}
				exists = true;
				System.out.println(name + " enter");
				try {
					System.out.println(name + " working");
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					// do nothing
				}
				System.out.println(name + " leave");
				exists = false;
			} else {
				System.out.println(name + " give up");
			}
		}*/

		public void run() {
			if (exists.compareAndSet(false, true)) {
				System.out.println(name + " enter");
				try {
					System.out.println(name + " working");
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
				}
				System.out.println(name + " leave");
				exists.set(false);
			} else {
				System.out.println(name + " give up");
			}
		}

	}

}
