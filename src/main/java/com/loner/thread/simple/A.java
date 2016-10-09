package com.loner.thread.simple;


public class A {
	/*
	 * synchronized同步代码块时允许任何对象来作为同步监视器，如：synchronized(obj);
	 * 同步方法时无须显式指定同步监视器，同步方法的同步监视器是this,即对象本身.
	 */
	public synchronized void foo(B b) {
		System.out.println("当前线程名:" + Thread.currentThread().getName()
				+ "进入了A实例的foo方法");
		try {
			Thread.sleep(200);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println("当前线程名:" + Thread.currentThread().getName()
				+ "企图调用B实例的last方法");
		b.last();// 锁定A对象后申请锁定B对象 @a
	}

	/* 执行此方法时必须锁定B对象 */
	public synchronized void last() {
		System.out.println("进入了A类的last方法内部");
	}
}