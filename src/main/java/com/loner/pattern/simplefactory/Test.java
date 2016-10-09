package com.loner.pattern.simplefactory;

public class Test {

	public static void main(String[] args) {
		PersonFactory factory = new PersonFactory();
		PersonIn persion = factory.getPersion("ch");
		String result = persion.sayHello("张三");
		System.out.println("result:" + result);
		result = persion.sayGoodbye("李四");
		System.out.println("result:" + result);

		persion = factory.getPersion("am");
		String result1 = persion.sayHello("LiLee");
		System.out.println("result:" + result1);
		result1 = persion.sayGoodbye("HanMeiMei");
		System.out.println("result:" + result1);
	}

}
