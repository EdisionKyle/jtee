package com.loner.thread.simple;

/**
 * 线程死锁
 */
public class ThreadDieSock implements Runnable {
	A a = new A();
	B b = new B();

	public void init() {
		Thread.currentThread().setName("主线程");
		a.foo(b);// 锁定A对象 @c
		System.out.println("进入了主线程之后");
	}

	public void run() {
		Thread.currentThread().setName("副线程");
		b.bar(a);// 锁定B对象 @d
		System.out.println("进入了副线程之后");
	}

	public static void main(String[] args) {
		/*
		 * @c锁定了A对象， @d锁定了B对象 。@c方法中@a申请锁定B对象，@d方法中@b申请锁定A对象，互相等待，因此发生死锁。
		 */
		ThreadDieSock deadLock = new ThreadDieSock();
		new Thread(deadLock).start();
		deadLock.init();
	}

}