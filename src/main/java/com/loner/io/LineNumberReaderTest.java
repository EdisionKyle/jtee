package com.loner.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 *  说明：
 *  创建时间：2017年2月23日 下午3:59:31
 *  Copyright (C) 2017, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author milesloner
 */
public class LineNumberReaderTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String fileName = "D:\\Resource\\buf.txt";
		try (// 构造LineNumberReader实例
				LineNumberReader lnr = new LineNumberReader(new FileReader(fileName));) {
			String line = "";
			while ((line = lnr.readLine()) != null) {
				System.out.println("Line " + lnr.getLineNumber() + ": " + line);
			}
		} catch (Exception e) {

		}
	}

}
