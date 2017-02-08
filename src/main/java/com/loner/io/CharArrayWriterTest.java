package com.loner.io;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;

/**
 * 与ByteArrayInputStream/ByteArrayOutputStream的区别就是字节导向与字符导向
 * 
 * @author pengcheng.tian
 *
 */
public class CharArrayWriterTest {

	public static void main(String[] args) throws Exception {
		CharArrayWriter caw = new CharArrayWriter();
		caw.write("CharArrayWriter 测试...");

		CharArrayReader car = new CharArrayReader(caw.toCharArray());
		char[] carcbuf = new char[1024];
		int carlen = car.read(carcbuf);
		System.out.println(new String(carcbuf, 0, carlen));
	}

}
