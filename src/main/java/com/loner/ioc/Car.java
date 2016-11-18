package com.loner.ioc;

public class Car implements Moveable {

	private String uname;

	public void run() {
		System.out.println(uname + " 拖着四个轮子满街跑car... ...");
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

}
