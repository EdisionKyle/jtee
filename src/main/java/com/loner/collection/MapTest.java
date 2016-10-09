package com.loner.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args) {

		// HashMap
		System.out.println("------HashMap无序输出------");
		HashMap<String, String> hsMap = new HashMap<String, String>();
		hsMap.put("3", "Value3");
		hsMap.put("1", "Value1");
		hsMap.put("2", "Value2");
		hsMap.put("b", "ValueB");
		hsMap.put("a", "ValueA");
		Iterator<Map.Entry<String, String>> it = hsMap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> e = it.next();
			System.out.println("Key: " + e.getKey() + "--Value: "
					+ e.getValue());
		}

		// TreeMap
		System.out.println("------TreeMap按Key排序输出------");
		TreeMap<String, String> teMap = new TreeMap<String, String>();
		teMap.put("3", "Value3");
		teMap.put("1", "Value1");
		teMap.put("2", "Value2");
		teMap.put("b", "ValueB");
		teMap.put("a", "ValueA");
		Iterator<Map.Entry<String, String>> tit = teMap.entrySet().iterator();
		while (tit.hasNext()) {
			Map.Entry<String, String> e = tit.next();
			System.out.println("Key: " + e.getKey() + "--Value: "
					+ e.getValue());
		}

		// LinkedHashMap
		System.out.println("--LinkedHashMap根据输入的顺序输出--");
		LinkedHashMap<String, String> lhsMap = new LinkedHashMap<String, String>();
		lhsMap.put("3", "Value3");
		lhsMap.put("1", "Value1");
		lhsMap.put("2", "Value2");
		lhsMap.put("b", "ValueB");
		lhsMap.put("a", "ValueA");
		Iterator<Map.Entry<String, String>> lit = lhsMap.entrySet().iterator();
		while (lit.hasNext()) {
			Map.Entry<String, String> e = lit.next();
			System.out.println("Key: " + e.getKey() + "--Value: "
					+ e.getValue());
		}
	}

}