package com.loner.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * BufferedOutputStream测试
 * 
 * @author pengcheng.tian
 *
 */
public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		final byte[] letters = { 0x61, 0x62, 0x63, 0x64, 0x65, 0x66, 0x67, 0x68, 0x69, 0x6A, 0x6B, 0x6C, 0x6D, 0x6E,
				0x6F, 0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 0x78, 0x79, 0x7A };
		try (OutputStream os = new FileOutputStream("D:/Resource/buf_out.txt");
				BufferedOutputStream bos = new BufferedOutputStream(os);) {
			bos.write(letters, 0, 10);
			bos.close();
		} catch (Exception e) {
		}
	}

}
