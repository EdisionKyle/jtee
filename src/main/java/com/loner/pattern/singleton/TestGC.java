package com.loner.pattern.singleton;

import java.io.UnsupportedEncodingException;

public class TestGC {
	private String name;
	private int age;

	public TestGC() {
	}

	public TestGC(String name) {
		this.name = name;
	}

	public TestGC(String name, int age) {
		this(name);
		this.age = age;
	}

	// 每个类里面都有finalize方法，和构造方法功能相反，一个是对象产生时调用，一个是对象消亡时调用
	// 是对应object的, 当garbage collector (GC)
	// 决定这个object不再被使用,而要进行清理的时候,会调用finalize()
	public void finalize() {

		System.out.println("开始清理对象...");
	}

	public static void main(String[] args) {
		// 下面三个对象一产生即成为拉圾
		new TestGC();
		new TestGC();
		new TestGC();

		// 如果不加上下面这句，以上产生的三个对象虽成为拉圾,但不一定马上就会启用拉圾回收机制把拉圾回收走
		// 所以就可能看不到 finalize 方法内部执行的效果
		// System.gc();
		// public static void gc() {
		// Runtime.getRuntime().gc();
		// }
		char ca = 'q';
		String sa = "中";

		byte[] bytes = null;
		byte[] bytes1 = null;
		try {
			//通常gbk/gb2312是2个字节，utf-8是3个字节。
			bytes = sa.getBytes("UTF-8");
			bytes1 = charToByte(ca);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("bytes 大小：" + bytes.length);
		System.out.println("bytes1大小：" + bytes1.length);
		System.out.println(Math.round(-11.5));

	}

	public static byte[] charToByte(char c) {
		byte[] b = new byte[2];
		b[0] = (byte) ((c & 0xFF00) >> 8);
		b[1] = (byte) (c & 0xFF);
		return b;
	}
}
