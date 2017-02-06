package com.loner.io;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Tes {

	public static String change(String str) {
		str = "heloo";
		return str;
	}

	private static void printIt(String s) {
		System.out.println("myString");
	}

	private static void printIt(Object o) {
		System.out.println("myObject");
	}

	public static void main(String[] args) {
		Tes.printIt((Object)null);
		Tes.printIt("999999999999");
		String st = "11234";
		st = change(st);
		System.out.println(st);
		Date d = new Date(1335446424000L);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		System.out.println(sdf.format(d));
	}
}