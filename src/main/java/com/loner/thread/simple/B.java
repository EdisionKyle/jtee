package com.loner.thread.simple;

public class B {
	public synchronized void bar(A a) {
		System.out.println("当前线程名:" + Thread.currentThread().getName()
				+ "进入了B实例的bar方法");
		try {
			Thread.sleep(200);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println("当前线程名:" + Thread.currentThread().getName()
				+ "企图调用A实例的foo方法");
		a.last();// 锁定B对象后申请锁定A对象 @b
	}

	public synchronized void last() {
		System.out.println("进入了B类的last方法内部");
	}

}