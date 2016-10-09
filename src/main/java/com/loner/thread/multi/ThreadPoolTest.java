package com.loner.thread.multi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/*1.减少了创建和销毁线程的次数，每个工作线程都可以被重复利用，可执行多个任务。
  2.可以根据系统的承受能力，调整线程池中工作线线程的数目，防止因为消耗过多的内存
ExecutorService 真正的线程池接口。
ScheduledExecutorService 能和Timer/TimerTask类似，解决那些需要任务重复执行的问题。
ThreadPoolExecutor ExecutorService的默认实现。
ScheduledThreadPoolExecutor 继承ThreadPoolExecutor的ScheduledExecutorService接口实现，周期性任务调度的类实现。

BlockingQueue
*/
public class ThreadPoolTest {
	public static void main(String[] args) {
		// 创建一个可重用固定线程数的线程池
//		ExecutorService pool = Executors.newFixedThreadPool(2);
		//创建一个使用单个 worker 线程的 Executor，以无界队列方式来运行该线程。
//      ExecutorService pool = Executors.newSingleThreadExecutor();
        //创建一个可根据需要创建新线程的线程池，但是在以前构造的线程可用时将重用它们。
        ExecutorService pool = Executors.newCachedThreadPool(); 
		// 创建实现了Runnable接口对象，Thread对象当然也实现了Runnable接口
		Thread t1 = new MyThread("Thread 1");
		Thread t2 = new MyThread("Thread 2");
		Thread t3 = new MyThread("Thread 3");
		Thread t4 = new MyThread("Thread 4");
		Thread t5 = new MyThread("Thread 5");
		// 将线程放入池中进行执行
		pool.execute(t1);
		pool.execute(t2);
		pool.execute(t3);
		pool.execute(t4);
		pool.execute(t5);
		// 关闭线程池
		pool.shutdown();
	}
}

class MyThread extends Thread {
	MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "正在执行。。。");
	}
}