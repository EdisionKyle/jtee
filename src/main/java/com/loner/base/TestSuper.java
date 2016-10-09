package com.loner.base;

class A2 {

	public int i = 100;

	public void q() {
		System.out.println("A类中的q()");
		System.out.println(this.i);
	}

	public void p() {
		System.out.println(this.getClass().getName());
		System.out.println(this.i);
		this.q();
	}
}

class B2 extends A2 {

	public int i = 200;

	// public void q() {
	// System.out.println("B类中的q()");
	// System.out.println(this.i);
	// }

	@Override
	public void p() {
		super.p();
	}
}

public class TestSuper {

	public static void main(String[] args) {
		B2 b2 = new B2();
		b2.p();
	}
}
