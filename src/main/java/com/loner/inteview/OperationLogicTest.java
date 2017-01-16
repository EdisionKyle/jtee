package com.loner.inteview;

/**
 * boolean逻辑运算
 * 
 * @author Administrator
 *
 */
public class OperationLogicTest {

	public static void main(String[] args) {
		boolean f = false;
		boolean t = true;
		if (f && t) {
			System.out.println("f && t");
		}
		if (f || t) {
			System.out.println("f || t");
		}
		if (!f) {
			System.out.println("!f");
		}
		if (f ^ t) {
			System.out.println("f ^ t");
		}
		if (f & t) {
			System.out.println("f & t");
		}
		if (f | t) {
			System.out.println("f | t");
		}
		System.out.println("----短路运算----");
		int a = 3, b = 0;
		System.out.println((a > 0) && (b-- < 0));
		System.out.println("a：" + a + "  b：" + b);
		int c = 3, d = 0;
		System.out.println((c > 0) && (--d < 0));
	}
}
