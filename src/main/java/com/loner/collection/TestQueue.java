package com.loner.collection;

import java.util.LinkedList;
import java.util.Queue;

/*
 		抛出异常 	          返回特殊值
插入 	add(e) 	    offer(e)
移除 	remove() 	poll()
检查 	element() 	peek()
 */
public class TestQueue {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.offer("Hello");
		queue.offer("World!");
		queue.offer("你好！");
		System.out.println(queue.size());
		String str;
		while ((str = queue.poll()) != null) {
			System.out.println(str);
		}
		System.out.println(queue.size());
	}
}