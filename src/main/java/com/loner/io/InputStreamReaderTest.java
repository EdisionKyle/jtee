package com.loner.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  说明：
 *  创建时间：2017年2月23日 下午3:21:10
 *  Copyright (C) 2017, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author milesloner
 */
public class InputStreamReaderTest {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("随便输入：");
		String text = bufferedReader.readLine();
		System.out.println("您输入的文字是：" + text);
	}

}
