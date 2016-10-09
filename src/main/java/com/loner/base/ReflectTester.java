package com.loner.base;

import java.applet.Applet;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//reflect 机制学习
public class ReflectTester {

	public void protest() {
		try {
			Class<?> c = Class.forName("com.tpc.javaseone.Customer");

			System.out.println("构造函数：");
			Constructor<?> con[] = c.getConstructors();
			for (int i = 0; i < con.length; i++) {
				System.out.println(con[i].toString());
			}
			System.out.println("属性：");
			Field f[] = c.getDeclaredFields();
			for (int i = 0; i < f.length; i++) {
				System.out.println(f[i].toString());
			}
			System.out.println("方法：");
			Method m[] = c.getDeclaredMethods();
			for (int i = 0; i < m.length; i++) {
				System.out.println(m[i].toString());
			}
		} catch (Throwable e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		Class<? extends String> c2 = str.getClass();
		System.out.println(c2);

		Class<Applet> c1 = java.applet.Applet.class;
		System.out.println(c1);

		System.out.println("-----------");
		ReflectTester t = new ReflectTester();

		t.protest();
	}
}

class Customer {
	private long id;
	private String name;
	private int age;

	public Customer() {
	}

	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
