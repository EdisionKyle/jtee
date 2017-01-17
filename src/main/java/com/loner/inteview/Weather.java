package com.loner.inteview;

import java.io.Serializable;

/**
 * @see java.lang.Object#clone
 * @author pengcheng.tian
 *
 */
public class Weather implements Serializable, Cloneable, Comparable<Weather> {

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

	// 比较开始
	@Override
	public int compareTo(Weather o) {
		return this.age - o.getAge();
	}

	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		if (obj instanceof Weather) {
			Weather new_name = (Weather) obj;
			if (this.age == new_name.getAge()) {
				flag = true;
			}
		}
		return flag;
	}

	// 比较结束
	@Override
	public String toString() {
		return "Weather [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}

}
