package com.loner.base;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerIncreTest {
	public AtomicInteger inc = new AtomicInteger();

	public void increase() {
		inc.getAndIncrement();
	}

	public static void main(String[] args) {
		final AtomicIntegerIncreTest test = new AtomicIntegerIncreTest();
		for (int i = 0; i < 10; i++) {
			new Thread() {
				public void run() {
					for (int j = 0; j < 1000; j++)
						test.increase();
				};
			}.start();
		}

		while (Thread.activeCount() > 1)//返回活动线程的当前线程的线程组中的数量
			// 保证前面的线程都执行完
			Thread.yield();//暂停当前正在执行的线程对象，并执行其他线程，与join()相反
			//与sleep()类似，只是不能由用户指定暂停多长时间
//			yield方法只会给优先级相同或更高优先级的线程执行机会。yield不会将线程转入阻塞状态，只是强制当前线程进入就绪状态。
//			因此完全有可能某个线程调用yield方法暂停后，立即又获得处理器资源被执行。			
		
//		Thread.sleep(long millis)使当前线程暂停millis所指定的毫秒，转到执行其它线程
//		让其他线程有机会继续执行，但它并不释放对象锁。也就是说如果有synchronized同步快，其他线程仍然不能访问共享数据
//		sleep()可以使低优先级的线程得到执行的机会
//		sleep比yield方法有更好的可移植性，通常，不要依靠yield控制并发线程的执行
		System.out.println(test.inc);
	}

}
