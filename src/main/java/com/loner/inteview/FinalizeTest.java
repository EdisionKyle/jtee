package com.loner.inteview;

public class FinalizeTest {

	public static void main(String args[]) {
		new FinalizeTest();
		// int a[] = new int[3];
		// FinalizeTest f = new FinalizeTest();
		System.gc();
	}

	public void finalize() throws Throwable {
		super.finalize();
		System.out.println("finalize method was called!");
	}

}
