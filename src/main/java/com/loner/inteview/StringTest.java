package com.loner.inteview;

public class StringTest {

	public static void main(String[] args) {
		String str = "1234";
		int x = 4, y = 5;
		str = str + (x + y);
		System.out.println(str);

		int i = 10;
		i += i -= i - i;
		System.out.println(x);
		System.out.println("--------分割线------");
		/**
		 * JDK1.6下返回false false，而1.7后返回false true
		 * 见【面试/Tech/原理分析】
		 */
		String s = new String("1");
		s.intern();
		String s2 = "1";
		System.out.println(s == s2);

		String s3 = new String("1") + new String("1");
		s3.intern();
		String s4 = "11";
		System.out.println(s3 == s4);
		/*String s = new String("1");
		String s2 = "1";
		s.intern();
		System.out.println(s == s2);

		String s3 = new String("1") + new String("1");
		s3.intern();
		String s4 = "11";
		System.out.println(s3 == s4);*/
		
		/**
		 * 见【面试/Tech/金典题目】
		 */
		String str1 = new String("jf");
		str1 = 1+2+str1+3+4;
		System.out.println(str1);
	}

}
