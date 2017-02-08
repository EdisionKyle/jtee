package com.loner.io;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * BufferedReader读取数据
 * 
 * @author pengcheng.tian
 *
 */
public class BufferedReaderTest {

	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new FileReader("D:/Resource/buf.txt"));) {
			StringBuilder message = new StringBuilder();
			String line = null;
			while ((line = br.readLine()) != null) {
				message.append(line + System.getProperty("line.separator"));
			}

			/*while (br.read() != -1) {
			 * // br.read() != -1的时候已经读取了一个字符，然而在这里并没有对读取出来的这个字符做处理，所以会出现少一个字符
				message.append(br.readLine());
			}*/
			System.out.println(message);
		}
	}

}
