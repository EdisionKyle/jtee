package com.loner.thread.multi;

public class ImplRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("通过实现Runnable接口创建子线程... ...");
	}

}