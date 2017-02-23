package com.loner.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

/**
 *  说明：
 *  创建时间：2017年2月23日 下午10:52:48
 *  Copyright (C) 2017, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author milesloner
 */
public class PushbackInputStreamTest {

	public static void main(String[] args) throws IOException {
		String str = "www.baidu.com"; // 定义字符串
		PushbackInputStream push = null; // 定义回退流对象
		ByteArrayInputStream bai = null; // 定义内存输入流
		bai = new ByteArrayInputStream(str.getBytes()); // 实例化内存输入流
		push = new PushbackInputStream(bai); // 从内存中读取数据
		System.out.println("读取之后的数据为：");
		int temp = 0;
		while ((temp = push.read()) != -1) { // 读取内容
			if (temp == '.') { // 判断是否读取到了"."
				push.unread(temp); // 放回到缓冲区之中
				temp = push.read(); // 再读一遍
				System.out.println("退回--：" + (char) temp);
			} else {
				System.out.println("非点**：" + (char) temp); // 输出内容
			}
		}
	}

}
