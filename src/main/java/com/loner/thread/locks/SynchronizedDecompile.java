package com.loner.thread.locks;

/**
 * 反编译深入分析synchronized原理
 * cd /d F:\space-git\jtee\target\classes
 * javap -c com.loner.thread.locks.SynchronizedDecompile
 * 或者使用参数 -verbose
 * @author pengcheng.tian
 *
 */
public class SynchronizedDecompile {

	public void method() {
		synchronized (this) {
			System.out.println("synchronized block on this object");
		}
	}
	/*public synchronized void method() {
		System.out.println("synchronized method on this object");
	}*/

	public static void main(String[] args) {
		SynchronizedDecompile sd = new SynchronizedDecompile();
		sd.method();
	}

}
