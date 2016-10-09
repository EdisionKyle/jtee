package com.loner.thread.simple;

public class CheckerTest {
	
	public static void main(String[] args) {
		//很可能某个线程在执行完这一行只进行了一次递增之后，CPU时间片被另外一个线程夺去，于是就生产出了奇数
		//不到迫不得已坚决不用synchronized加锁
		//性能的损耗
		//同步化方法会强制线程队列排队等着执行方法
		//同步化很可能会导致死锁
		EvenGenerator generator = new EvenGenerator();
		Thread t1 = new Thread(new EvenChecker(generator));
		Thread t2 = new Thread(new EvenChecker(generator));

		t1.start();
		t2.start();
	}
}