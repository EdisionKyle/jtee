package com.loner.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 读取键盘输入
 * 
 * @author pengcheng.tian
 *
 */
public class BufferedReaderTest1 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("请输入一系列文字，可包括空格：");
		String text = bufferedReader.readLine();
		System.out.println("请输入文字：" + text);
	}

}
