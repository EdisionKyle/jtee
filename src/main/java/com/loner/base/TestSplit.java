package com.loner.base;

/**
 * public string[] split(string regex, int limit) {
 * return pattern.compile(regex).split(this, limit);
 * } 
 * separator 字符串或 正则表达式对象
 * limit 限制返回数组中的元素个数。
 * */
public class TestSplit {

	static String[] ss;
	
	public static void num1() {

	    String ip = "10.96.119.95,10.96.119.94,10.96.119.96";

	    ip = ip.split(",")[0];

	    System.out.println(ip);

	}
	
	public static void num2() {

	    String s = "The rain in Spain falls mainly in the plain.";

	    // 在每个空格字符处进行分解。

	    ss = s.split(" ");

	    for (int i = 0; i < ss.length; i++)

	       System.out.println(ss[i]);

	}
	
	public static void num3() {

	    String s = "The rain in Spain falls mainly in the plain.";

	    ss = s.split(" ", 2);

	    for (int i = 0; i < ss.length; i++)

	       System.out.println(ss[i]);

	}
	
	public static void num4() {

	    String s = "The rain in Spain falls mainly in the plain.";

	    // 在每个空格字符处进行分解。

	    ss = s.split(" ", 20);

	    for (int i = 0; i < ss.length; i++)

	       System.out.println(ss[i]);

	}
	
	public static void num5() {

	    String value = "192.168.128.33";

	    String[] names = value.split("\\.");

	    for (int i = 0; i < names.length; i++)

	       System.out.println(names[i]);

	}
	
	public static void num6() {

	    String s = "19314,19293,19277,19257,19264,19285,19287,19281,19311,19321,19856,19563";

	    // 在每个空格字符处进行分解。

	    ss = s.split("19264,");
	    StringBuffer result = new StringBuffer("19264,");
	    System.out.println("length:" + ss.length);
	    for (int i = 0; i < ss.length; i++) {
//		       System.out.print(ss[i] + "|");
	    	result.append(ss[i]);
	    }
    	System.out.println(result.substring(0, 59));

	}
	
	public static void main(String[] args) {
		num1();
		System.out.println("---------------");
		num2();
		System.out.println("---------------");
		num3();
		System.out.println("---------------");
		num4();
		System.out.println("---------------");
		num5();
		System.out.println("---------------");
		num6();
	}
	
}
