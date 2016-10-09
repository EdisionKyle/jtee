package com.loner.thread.simple;

/**
 * 计算1+2+3 ... +100的和
 */
public class ThreadSum extends Thread {
	int total = 0;

	public void run() {

		synchronized (this) {
			for (int i = 0; i < 101; i++) {
				total += i;
			}
			// (完成计算了)唤醒在此对象监视器上等待的单个线程，在本例中线程ThreadInteractionTest被唤醒
			notify();
		}

	}
}