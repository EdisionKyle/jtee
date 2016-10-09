package com.loner.pattern.singleton;

public class Test {

	public static void main(String[] args) {
		Singleton sing = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();

		System.out.println(sing);
		System.out.println(sing2);

		System.out.println("-----------------饿汉式单例模式----------------");
		System.out.println("第一次取得实例（饿汉式）");
		MySingleton s1 = MySingleton.getInstance();
		System.out.println("第二次取得实例（饿汉式）");
		MySingleton s2 = MySingleton.getInstance();
		if (s1 == s2) {
			System.out.println(">>>>>s1,s2为同一实例（饿汉式）<<<<<");
		}
		System.out.println(" 当将一个对象的引用作为参数传递给System.out.println();" +
				"时，默认是调用对象参数的toString()方法;\n" + s1);
		System.out.println(new AA().toString());
		
	}

}
