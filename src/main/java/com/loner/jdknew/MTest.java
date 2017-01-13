package com.loner.jdknew;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MTest {

	public static void main(String[] args) {

		String str = "Hello To Java Home";
		String[] arr =  {"a", "b", "c"};
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "meng520");
		int intA = 23;
		change(str, arr, map, intA);
		System.out.println("String==" + str);
		System.out.println("arr==" + Arrays.toString(arr));
		System.out.println("map==" + map);
		System.out.println("intA==" + intA);
	}

	public static void change(String str, String[] arr, Map<String, String> map, int intA) {
		str = "Hello To Python Home";
		arr[0] = "FG";
		map.put("name", "tianpc");
		intA = 29;
	}

}
