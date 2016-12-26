package com.loner.jdknew;

import java.util.LinkedHashMap;
import java.util.Map;

public class MTest {

	public static void main(String[] args) {

		Map<String, String> map = new LinkedHashMap<String, String>(16, 0.75f,
				true);
		map.put("a", "真爱");
		map.put("c", "哈哈");
		map.put("b", "逗比");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry);
		}
	}

}
