package com.loner.io;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * 运用BufferedWriter把数据写入文件
 * 
 * @author pengcheng.tian
 *
 */
public class BufferedWriterTest {

	public static void main(String[] args) throws Exception {
		String content = "运用BufferedWriter把数据写入文件88888888888888";
		/*try (OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream("D:/Resource/buf.txt"));
				BufferedWriter writer = new BufferedWriter(write);) {
			writer.write(content);
			writer.flush();
			write.close();
			writer.close();
		}*/
		try (FileWriter fw = new FileWriter("D:/Resource/buf.txt");
				BufferedWriter bw = new BufferedWriter(fw);) {
			fw.write(content);
			fw.flush();
			fw.close();
			fw.close();
		}
	}
}
