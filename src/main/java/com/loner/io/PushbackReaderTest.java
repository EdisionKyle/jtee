package com.loner.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackReader;

/**
 *  说明：
 *  创建时间：2017年2月23日 下午11:02:52
 *  Copyright (C) 2017, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author milesloner
 */
public class PushbackReaderTest {

	public static void main(String[] args) {
		PushbackReader reader = null;
		try {
			// 构建PushbackReader字符流对象
			reader = new PushbackReader(new InputStreamReader(
					new FileInputStream("D:\\Resource\\train\\PushbackReader.txt")), 64);
			char[] buffer = new char[64];
			int len = 0;
			while ((len = reader.read(buffer)) != -1) {
				String tempStr = new String(buffer, 0, len);
				System.out.println(tempStr);
				// 判断本次读取的字符串中是否存在"you"字符串
				if (tempStr.indexOf("you") != -1) {
					// 将本次读取的字符数组推回到输入字符流
					reader.unread(tempStr.toCharArray());
					// 读取推回的字符流，然后输出
					if ((len = reader.read(buffer)) != -1) {
						System.out.println("<<" + new String(buffer, 0, len)
								+ ">>");
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != reader) {
				try {
					reader.close();
					reader = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
