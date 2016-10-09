package com.loner.collection;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("123");
		stack.push("456");
		stack.push("789");
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty());
		System.out.println(stack.capacity());
		System.out.println(stack.get(2));
		
	}

}
	