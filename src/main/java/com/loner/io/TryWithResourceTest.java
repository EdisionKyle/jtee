package com.loner.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TryWithResourceTest {

	public static void main(String[] args) {
		// 自动资源管理
		// try {
		// printFileJava7();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// switch中使用string
		String swich = "a";
		switch (swich) {
		case "a":
			System.out.println("SWITCH = a");
			break;
		case "b":
			System.out.println("SWITCH = b");
			break;
		default:
			System.out.println("SWITCH = default");
			break;
		}
		// 数字字面量下划线支持
		long l = 10_89_987;
		System.out.println(l);
		// catch子句可以同时捕获多个异常
		try {
			throw new ArithmeticException();
			// throw new NullPointerException();
		} catch (NullPointerException | ArithmeticException e) {
			System.out.println(e);
		}
		// 泛型实例化类型自动推断
		List<String> list = new ArrayList<>();
		list.add("tianpc");
		list.add("weixm");
		System.out.println(list);
	}

	public static void printFileJava7() throws IOException {
		// try-with-resources语句
		try (FileInputStream is = new FileInputStream(new File("D:\\logs\\stu"))) {
			int data = is.read();
			while (data != -1) {
				System.out.println((char) data);
				data = is.read();
			}
		} catch (Exception e) {
			System.err.println("报错啦");
		}
	}

}
