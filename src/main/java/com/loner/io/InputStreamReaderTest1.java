package com.loner.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *  说明：
 *  创建时间：2017年2月23日 下午3:24:59
 *  Copyright (C) 2017, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author milesloner
 */
public class InputStreamReaderTest1 {

	public static void main(String[] args) throws IOException {
//		transReadNoBuf();
		transReadByBuf();
	}

	public static void transReadNoBuf() throws IOException {
		// 读取键盘输入
		// InputStream in = System.in;
		InputStream in = new FileInputStream("D:\\Resource\\buf.txt");// 读取文件数据
		// 将字节流向字符流的转换。要启用从字节到字符的有效转换，可以提前从底层流读取更多的字节
		InputStreamReader isr = new InputStreamReader(in);// 读取
		// 简洁
		// InputStreamReader isr = new InputStreamReader(
		// new FileInputStream("D:\\demo.txt"));

		char[] cha = new char[1024];
		int len = isr.read(cha);
		System.out.println(new String(cha, 0, len));
		isr.close();
	}

	public static void transReadByBuf() throws IOException {
		// 读取键盘输入
		// InputStream in = System.in;
		InputStream in = new FileInputStream("D:\\Resource\\buf.txt");// 读取文件数据
		// 将字节流向字符流的转换
		InputStreamReader isr = new InputStreamReader(in);// 读取
		// 创建字符流缓冲区
		BufferedReader bufr = new BufferedReader(isr);// 缓冲
		// 简洁
		// BufferedReader bufr = new BufferedReader(
		// new InputStreamReader(new FileInputStream("D:\\demo.txt")));
		String line;
		while ((line = bufr.readLine()) != null) {
			System.out.println(line);
		}
		isr.close();
	}

}
