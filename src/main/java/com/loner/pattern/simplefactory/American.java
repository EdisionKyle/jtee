package com.loner.pattern.simplefactory;

public class American implements PersonIn {

	public String sayHello(String name) {
		return "Hello，" + name;
	}

	public String sayGoodbye(String name) {
		return "GoodBye，" + name;
	}
	
}
