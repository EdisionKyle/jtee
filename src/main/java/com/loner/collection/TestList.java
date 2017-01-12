package com.loner.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		List<String> arrlist = new ArrayList<String>();
		arrlist.add("Max");
		arrlist.add("Scott");
		arrlist.add("Jeffry");
		arrlist.add("c");
		arrlist.add("c");
		arrlist.add("Joe");
		arrlist.add("Kelvin");
		arrlist.add("c");
        //有可能不能全部删除
//        removeListElement1(arrlist);
        //能够正确删除
//        removeListElement2(arrlist);
        //能够正确删除
        removeListElement3(arrlist);
		for(String a : arrlist) {
			System.out.print(a + "  ");
		}
	}

	/**
	 * 删除list中值为"c"的元素
	 * 
	 * 当值为"c"的元素在Arraylist中不连续存储的时候,是可以把值为"c"的元素全部删掉
	 * 
	 * 但是当值为"c"的元素在Arraylist中有连续存储的时候,就没有把值为"c"的元素全部删除
	 * 因为删除了元素,Arraylist的长度变小了,索引也会改变,但是迭代的下标没有跟着变小
	 */
	public static void removeListElement1(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			if ("c".equals(list.get(i))) {
				list.remove(i);
			}
		}
	}

	/**
	 * 删除Arraylist中值为"c"的元素
	 * 
	 * 不管值为"c"的元素在Arraylist中是否连续，都可以把值为"c"的元素全部删除
	 */
	public static void removeListElement2(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			if ("c".equals(list.get(i))) {
				list.remove(i);
				--i;// 删除了元素，迭代的下标也跟着改变
			}
		}
	}

	/**
	 * 删除Arraylist中值为"c"的元素
	 * 
	 * 不管值为"c"的元素在list中是否连续，都可以把值为"c"的元素全部删除
	 * 
	 * 需保证没有其他线程同时在修改
	 */
	public static void removeListElement3(List<String> list) {
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String str = iterator.next();
			if ("c".equals(str)) {
				iterator.remove();
			}
		}
	}

}
