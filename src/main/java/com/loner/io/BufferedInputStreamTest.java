package com.loner.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * BufferedInputStream测试
 * 
 * @author pengcheng.tian
 *
 */
public class BufferedInputStreamTest {

	public static void main(String[] args) throws Exception {
		/*try (InputStream is = new FileInputStream("D:/Resource/buf.txt");
				BufferedInputStream bis = new BufferedInputStream(is);) {
			while (bis.available() > 0) {
				bis.skip(1);
				char c = (char) bis.read();
				System.out.print(" " + c);
			}
		} catch (Exception e) {
		}*/
		try (InputStream is = new FileInputStream("D:/Resource/buf.txt");
				BufferedInputStream bis = new BufferedInputStream(is);) {
			int numByte = bis.available();
			byte[] b = new byte[numByte];
			bis.read(b, 0, numByte);
			String str = new String(b);
			System.out.println(str);
		} catch (Exception e) {

		}
	}
}
