package com.loner.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestMapToSet {

	public static void main(String[] args) {
		HashMap<String, String> kmap = new HashMap<String, String>();
		HashMap<String, String> emap = new HashMap<String, String>();

		for (int i = 0; i < 10; i++) {
			kmap.put(" " + i, "YL");
		}
		for (int i = 0; i < 10; i++) {
			emap.put(" " + i, "ZT");
		}

		Iterator<Map.Entry<String, String>> ktor = kmap.entrySet().iterator();
		while (ktor.hasNext()) {
			System.out.println(ktor.next());
		}
		System.out.println("---------------");
		Iterator<Map.Entry<String,String>> itor = emap.entrySet().iterator();
		while (itor.hasNext()) {
			Map.Entry<String,String> e = itor.next();
			System.out.print(e.getKey() + " ");
			System.out.println(e.getValue());
		}
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "tianpc");
		map.put("age", "29");
		map.put("addr", "深圳宝安区");
		map.put("job", "Java开发工程师");
		Iterator<Map.Entry<String, String>> ii = map.entrySet().iterator();
		while(ii.hasNext()) {
			Map.Entry<String, String> en = ii.next();
			System.out.println(en.getKey() + " - " + en.getValue());
		}
	}

}
