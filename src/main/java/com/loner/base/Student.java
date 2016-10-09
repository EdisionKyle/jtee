package com.loner.base;

import java.math.BigDecimal;

public abstract class Student {
	private String name;
	int age;
	protected String addr;
	public double score;

	{
		System.out.println("基类普通初始化块");
	}
	static {
		System.out.println("基类静态初始化块");
	}

	public String getName() {
		return name;
	}

	public abstract String print(String name, double score);
	
	public int getAge() {
		return age;
	}

	public String getAddr() {
		return addr;
	}

	public double getScore() {
		return score;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", addr=" + addr
				+ ", score=" + score + "]";
	}

	public static void main(String[] args) {
		String aa = "abc";
		System.out.println(aa.intern());
		Object o = null;
		System.out.println(o);
		Double d = Math.pow(2, 32);
		BigDecimal bd = new BigDecimal(d);
		System.out.println(bd.toPlainString());
		System.out.println(Integer.toOctalString(34) + " * " + Integer.toHexString(34) + " * " + Integer.toBinaryString(34));
		Integer n = 1000;
		Integer m = 1000;
		System.out.println(n == m);
		Long li = 100L;
		Long lt = 100L;
		System.out.println(li == lt);
	}
}
