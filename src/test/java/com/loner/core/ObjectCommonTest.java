package com.loner.core;

public class ObjectCommonTest {

	public static void main(String[] args) {
		String a1 = "ABCD";
		String a2 = "ABCD";
		String a3 = new String("ABCD");
		System.out.println("a1 == a2：" + a1 == a2);
		System.out.println("a2 == a3：" + a2 == a3);
		System.out.println("a1 equals a2：" + a1.equals(a2));
		System.out.println("a2 equals a3：" + a2.equals(a3));

		Object o1 = 982374L;
		System.out.println("a1.hashCode：" + a1.hashCode());
		System.out.println("a2.hashCode：" + a2.hashCode());
		System.out.println("o1.hashCode：" + o1.hashCode());
	}

}