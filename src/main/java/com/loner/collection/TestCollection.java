package com.loner.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.EventObject;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.WeakHashMap;

public class TestCollection {

	public static void main(String[] args) {
		// ArrayList
		{
			ArrayList arraylist = new ArrayList();
			arraylist.add(0, "end");// 指定索引加入值
			// 需注意的是，如果现有2个值，加入索引为5的那么就会出现异常
			for (int i = 0; i < 2; i++) {
				arraylist.add(i, String.valueOf(i));
			}
			System.out.println("ArrayList:");
			for (int i = 0; i < arraylist.size(); i++) {
				System.out.print(arraylist.get(i) + ";");
			}
			arraylist.add("0");// 直接加入值到ArrayList的最后
			arraylist.add("0");
			System.out.print("\nArrayList\'s lastIndexOf(\"0\") is "
					+ arraylist.lastIndexOf("0"));
		}
		// Arrays
		{
			String[] array = new String[] { "a", "b", "c" };
			List list = Arrays.asList(array);
			System.out.println("\nArrays:");
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i) + ";");
			}
			System.out.print("\nArrays\'s length is " + array.length);// 打印数组的长度
		}
		// Collections
		{
			String[] array = new String[] { "a", "b", "c" };
			List list = Arrays.asList(array);
			Collections.fill(list, "Fill");// 用Fill填充全部元素
			System.out.println("\nCollections:");
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i) + ";");
			}
			array = new String[] { "1", "2", "3" };
			List list2 = Arrays.asList(array);
			Collections.copy(list, list2);// 拷贝list2的数据进list
			System.out.println("\n" + list);
			Collections.swap(list, 2, 1);// 调换索引为1和2的元素的位置
			System.out.println(list);
		}
		// EventObject
		{
			String s = "hello";
			String s2 = s;
			EventObject eventobject = new EventObject(s);// 一个准容器类型，确切的归类它不是容器
			System.out.println("EventObject:");
			System.out.println(eventobject.getSource());
			System.out.println(eventobject.equals(s2));
		}
		// HashMap
		{
			HashMap hashmap = new HashMap();// 一个速度最快的容器
			hashmap.put("0", "c");
			hashmap.put("1", "a");
			hashmap.put("2", "b");
			hashmap.put("3", "a");
			System.out.println("HashMap:");
			System.out.println(hashmap);// 该容器有其内部的排序方式
			Set set = hashmap.keySet();// 获取全部键
			Iterator iterator = set.iterator();
			while (iterator.hasNext()) {
				System.out.print(hashmap.get(iterator.next()) + ";");
			}
		}
		// HashSet
		{
			HashSet hashset = new HashSet();// 一个绝对不能重复的类型
			hashset.add("c");
			hashset.add("b");
			hashset.add("a");
			hashset.add("a");
			hashset.add("b");
			System.out.println("\nHashSet:");
			System.out.println(hashset);
			Iterator iterator = hashset.iterator();// 取出元素
			while (iterator.hasNext()) {
				System.out.print(iterator.next() + ";");
			}
		}
		// Hashtable
		{
			Hashtable hashtable = new Hashtable();// 一个完全可以由其他容器替换的老容器类型
			hashtable.put("0", "c");
			hashtable.put("1", "a");
			hashtable.put("3", "c");
			hashtable.put("2", "b");
			System.out.println("\nHashtable:");
			Enumeration enumeration = hashtable.elements();// 获取元素，Enumeration已经不是主流，Iterator是它的下一代替代品
			while (enumeration.hasMoreElements()) {
				System.out.print(enumeration.nextElement() + ";");
			}
		}
		// IdentityHashMap
		{
			IdentityHashMap identityhashmap = new IdentityHashMap();
			identityhashmap.put("0", "c");
			identityhashmap.put("1", "a");
			identityhashmap.put("3", "b");
			identityhashmap.put("2", "a");
			System.out.println("\nIdentityHashMap:");
			System.out.println(identityhashmap);
			System.out.println(identityhashmap.containsKey("3"));// 是否包含这个键
			System.out.println(identityhashmap.containsValue("a"));// 是否包含值
			Set set = identityhashmap.entrySet();// 传为Set类型
			System.out.println(set);
			set = identityhashmap.keySet();// 全部键
			System.out.println(set);
		}
		// LinkedHashMap
		{
			LinkedHashMap linkedhashmap = new LinkedHashMap();
			linkedhashmap.put("0", "b");
			linkedhashmap.put("2", "a");
			linkedhashmap.put("1", "c");
			linkedhashmap.put("3", "b");
			System.out.println("LinkedHashMap:");
			System.out.println(linkedhashmap);
			System.out.println(linkedhashmap.containsKey("2"));// 是否包含这个键
			System.out.println(linkedhashmap.containsValue("c"));// 是否包含值
			Set set = linkedhashmap.keySet();
			Iterator iterator = set.iterator();
			while (iterator.hasNext()) {
				System.out.print(linkedhashmap.get(iterator.next()) + ";");
			}
		}
		// LinkedHashSet
		{
			LinkedHashSet linkedhashset = new LinkedHashSet();// 它包含了几种Set的属性但却没有自己的特色
			linkedhashset.add("c");
			linkedhashset.add("a");
			linkedhashset.add("a");
			linkedhashset.add("b");
			System.out.println("\nLinkedHashSet:");
			System.out.println(linkedhashset);
			System.out.println(linkedhashset.contains("a"));// 是否包含对象
			Iterator iterator = linkedhashset.iterator();
			while (iterator.hasNext()) {
				System.out.print(iterator.next() + ";");
			}
		}
		// LinkedList
		{
			LinkedList linkedlist = new LinkedList();// 自由使用是它的特色
			linkedlist.add("a");
			linkedlist.add(1, "c");
			linkedlist.addLast("b");
			linkedlist.addFirst("d");
			System.out.println("\nLinkedList:");
			System.out.println(linkedlist);
			// linkedlist.clear();//该方法清空容器
			// linkedlist.remove(0);//删除索引为0的元素
			// linkedlist.remove("d");//删除值为d的元素
			// linkedlist.removeFirst();//删除第一个元素
			// linkedlist.removeLast();//删除最后一个元素
			for (int i = 0; i < linkedlist.size(); i++) {
				System.out.print(linkedlist.get(i) + ";");
			}
		}
		// Stack
		{
			Stack stack = new Stack();// 堆栈
			stack.add("b");
			stack.add(0, "c");
			stack.push("d");
			stack.add("e");
			stack.push("a");
			Enumeration enumeration = stack.elements();
			System.out.println("\nStack:");
			while (enumeration.hasMoreElements()) {
				System.out.print(enumeration.nextElement() + ";");
			}
			// 后进先出
			System.out.println("\n" + stack.peek());
			System.out.println(stack.pop());
			System.out.println(stack.contains("d") + ";" + stack.contains("a"));// 是否包含该元素,有趣的事情发生了
			System.out.println(stack.search("c"));// 非常有用的属性，检索，但是由后向前的排列
		}
		// TreeMap
		{
			TreeMap treemap = new TreeMap();
			treemap.put("0", "d");
			treemap.put("2", "a");
			treemap.put("1", "b");
			treemap.put("3", "c");
			System.out.println("\nTreeMap:");// 可以对键排序
			System.out.println(treemap);
			System.out.println(treemap.firstKey());// 返回第一个键
			Set set = treemap.keySet();
			Iterator iterator = set.iterator();
			while (iterator.hasNext()) {
				System.out.print(treemap.get(iterator.next()) + ";");
			}
		}
		// TreeSet
		{
			TreeSet treeset = new TreeSet();// 自动排序内容
			treeset.add("b");
			treeset.add("a");
			treeset.add("c");
			treeset.add("d");
			System.out.println("\nTreeSet:");
			System.out.println(treeset);
			System.out.println(treeset.first());// 返回第一个元素
			Iterator iterator = treeset.iterator();
			while (iterator.hasNext()) {
				System.out.print(iterator.next() + ";");
			}
		}
		// Vector
		{
			Vector vector = new Vector();
			vector.add(0, "b");
			vector.add("a");
			vector.addElement("d");
			vector.add("c");
			System.out.println("\nVector:");
			System.out.println(vector);
			vector.set(2, "h");// 替换掉指定索引的元素
			System.out.println(vector);
			Object[] str = vector.toArray();
			for (int i = 0; i < str.length; i++) {
				System.out.print(str[i] + ";");
			}
			vector.setSize(2);// 重新设置大小为2
			System.out.println("\n" + vector);
		}
		// WeakHashMap
		{
			WeakHashMap weakhashmap = new WeakHashMap();
			weakhashmap.put("1", "b");
			weakhashmap.put("2", "c");
			weakhashmap.put("0", "d");
			weakhashmap.put("3", "a");
			System.out.println("\nWeakHashMap:");
			System.out.println(weakhashmap);
			System.out.println(weakhashmap.containsKey("3"));// 是否包含键
			System.out.println(weakhashmap.containsValue("d"));// 是否包含值
			Set set = weakhashmap.entrySet();
			Iterator iterator = set.iterator();
			while (iterator.hasNext()) {
				System.out.print(iterator.next() + ";");
			}
			// weakhashmap.remove("2");//删除该键对应的值
			// weakhashmap.get("1");//获取指定键的值
		}
	}
}
