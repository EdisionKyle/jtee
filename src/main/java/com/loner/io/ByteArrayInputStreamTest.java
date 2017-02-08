package com.loner.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * 对字节数组读写
 * 
 * 流的来源或目的地并不一定是文件，也可以是内存中的一块空间，例如一个字节数组。java.io.ByteArrayInputStream、
 * java.io.ByteArrayOutputStream就是将字节数组当作流输入来源、输出目的地的类。
 * java.io.ByteArrayInputStream将一个字节数组当作流输入的来源，
 * 而java.io.ByteArrayOutputStream则可以将一个字节数组当作流输出目的地。
 * 
 * @author pengcheng.tian
 *
 */
public class ByteArrayInputStreamTest {

	public static void main(String[] args) throws Exception {
		// ByteArrayOutputStream/ByteArrayInputStream
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		baos.write("ByteArrayOutputStream and ByteArrayInputStream 测试...".getBytes());
		baos.close(); // 关闭无效

		ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
		byte[] buf = new byte[1024];
		int len = bais.read(buf);
		System.out.println(new String(buf, 0, len));
		bais.close();
	}

}
