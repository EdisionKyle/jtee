package com.loner.base.lang;

/**
 * Runtime
 * 
 * @author pengcheng.tian
 *
 */
public class RuntimeTest {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		System.out.println(r.freeMemory());
		System.out.println(r.totalMemory());
		System.out.println(r.maxMemory());
		System.out.println(r.availableProcessors());

		long mem1, mem2;
		Integer someints[] = new Integer[1000];
		System.out.println("Total memory is ：" + r.totalMemory());
		mem1 = r.freeMemory();
		System.out.println("Initial free is : " + mem1);
		r.gc();
		mem1 = r.freeMemory();
		System.out.println("Free memory after garbage collection : " + mem1);
		// allocate integers
		for (int i = 0; i < 1000; i++)
			someints[i] = new Integer(i);
		mem2 = r.freeMemory();
		System.out.println("Free memory after allocation : " + mem2);
		System.out.println("Memory used by allocation : " + (mem1 - mem2));
		// discard Intergers
		for (int i = 0; i < 1000; i++)
			someints[i] = null;
		r.gc(); // request garbage collection
		mem2 = r.freeMemory();
		System.out.println("Free memory after collecting " + "discarded integers : " + mem2);
		// 启动记事本notepad
		try {
			r.exec("notepad");
		} catch (Exception e) {
			System.out.println("Error executing notepad.");
		}
	}

}
