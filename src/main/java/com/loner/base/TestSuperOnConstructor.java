package com.loner.base;

class A3 {
	public A3() {
		System.out.println("A");
	}
}

class B3 extends A3 {
	public B3() {
		System.out.println("B");
	}
}

public class TestSuperOnConstructor {

	public static void main(String[] args) {
		B3 b3 = new B3();
		System.out.println(b3.toString());
	}
}
