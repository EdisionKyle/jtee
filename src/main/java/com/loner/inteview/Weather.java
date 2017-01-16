package com.loner.inteview;

import java.io.Serializable;

public class Weather implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;

	private String name;
	private int age;
	private String addr;

	public Weather() {
		super();
	}

	public Weather(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
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

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

//	@Override
//	public String toString() {
//		return "Weather [name=" + name + ", age=" + age + ", addr=" + addr + "]";
//	}

	
}
