package com.loner.pattern.simplefactory;

public class Chinese implements PersonIn {

	public String sayHello(String name) {
		return "您好，" + name;
	}

	public String sayGoodbye(String name) {
		return "再见，" + name;
	}
	
}