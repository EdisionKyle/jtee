package com.loner.thread.simple;

public class EvenGenerator {

	private int currentValue = 0;
	private boolean cancled = false;

	public synchronized int next() {
		++currentValue; // 危险
		++currentValue;
		return currentValue;
	}

	public boolean isCancled() {
		return cancled;
	}

	public void cancle() {
		cancled = true;
	}
}