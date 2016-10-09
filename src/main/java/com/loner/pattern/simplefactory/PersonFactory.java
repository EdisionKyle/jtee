package com.loner.pattern.simplefactory;

public class PersonFactory {

	public PersonIn getPersion(String classType) {

		if ("ch".equals(classType)) {
			return new Chinese();
		} else {
			return new American();
		}
	}
}
