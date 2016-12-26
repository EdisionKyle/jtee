/**
 *  工程名：jtee
 *  文件名：AtomicIntegerFieldUpdaterTest.java
 *  包名：java.util.concurrent.atomic
 *  创建时间：2016年12月26日 上午10:07:54
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 */
package com.loner.thread.atomic;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/**
 *  类名：AtomicIntegerFieldUpdaterTest
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年12月26日 上午10:07:54
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 */
public class AtomicIntegerFieldUpdaterTest {

	// 创建原子更新器,并设置需要更新的对象类和对象的属性
	private static AtomicIntegerFieldUpdater<User> a = AtomicIntegerFieldUpdater.newUpdater(User.class, "old");

	public static void main(String[] args) throws InterruptedException {
		// 设置柯南的年龄是10岁
		User conan = new User("conan", 10);
		// 柯南长了一岁，但是仍然会输出旧的年龄
		System.out.println(a.getAndIncrement(conan));
		// 输出柯南现在的年龄
		System.out.println(a.get(conan));
	}

	public static class User {
		private String name;
		public volatile int old;

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
