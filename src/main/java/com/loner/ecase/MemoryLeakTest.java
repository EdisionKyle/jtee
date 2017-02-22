package com.loner.ecase;

import java.util.Vector;

/**
 * 内存泄漏案例
 * 
 * @author milesloner
 *
 */
public class MemoryLeakTest {

	private static Vector<Object> v = new Vector<Object>(10);

	/**
	 * 循环申请Object对象，并添加到Vector中，然后将对象设置为null，可是这些对象因为被Vector引用着，
	 * 因此并不能被GC回收，造成了内存泄漏。要释放这些对象，还需要被它们从Vector删除，最简单的方法就是将Vector设置为null。
	 */
	public void init() {
		for (int i = 1; i < 100; i++) {
			Object object = new Object();
			v.add(object);
			object = null;
		}
	}

	public static void main(String[] args) {
		MemoryLeakTest ml = new MemoryLeakTest();
		ml.init();
	}

}
