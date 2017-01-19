package com.loner.qrcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonTest {

	public static void main(String[] args) {
		int a = 1;
		a++;
		System.out.println(a++);
		List<String> list = new ArrayList<String>();
		list.add("milesloner");
		list.add("menghua");
		list.add("whereis");
		Set<String> set = new HashSet<String>();
		set.addAll(list);
		System.out.println(set);
	}

}
