package com.loner.thread.multi;

public class ExtendThread extends Thread {

	@Override
	public void run() {
		System.out.println("通过继承Thread创建子线程... ...");
	}

}