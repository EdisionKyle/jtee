package com.loner.base;

class A1 {

	public int i = 100;

	public void p() {
		System.out.println(this.getClass().getName());
		System.out.println(this.i);
	}
}

class B1 extends A1 {

	public int i = 200;

	@Override
	public void p() {
		System.out.println(this.getClass().getName());
		System.out.println(this.i);
	}
}

public class TestThisOnOverride {

	public static void main(String[] args) {
		B1 b1 = new B1();
		b1.p();
	}
}
