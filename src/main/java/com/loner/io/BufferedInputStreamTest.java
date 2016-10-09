package com.loner.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class BufferedInputStreamTest {

	public static void main(String[] args) throws Exception {
		try (InputStream is = new FileInputStream("D:/logs/buf.txt");
				BufferedInputStream bis = new BufferedInputStream(is);) {
			while (bis.available() > 0) {
				bis.skip(1);
				char c = (char) bis.read();
				System.out.print(" " + c);
			}
		} catch (Exception e) {
		}

	}
}
