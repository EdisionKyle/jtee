package com.loner.ioc;

public class Plane implements Moveable {

	private String uname;

	public void run() {
		System.out.println(uname + " 拖着翅膀天空飞plane... ...");
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

}
