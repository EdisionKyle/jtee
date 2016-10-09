package com.loner.collection;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		List<String> arrlist = new ArrayList<String>();
		arrlist.add("Max");
		arrlist.add("Scott");
		arrlist.add("Jeffry");
		arrlist.add("Joe");
		arrlist.add("Kelvin");
		for(String a : arrlist) {
			System.out.print(a + "  ");
		}
	}
	
}
