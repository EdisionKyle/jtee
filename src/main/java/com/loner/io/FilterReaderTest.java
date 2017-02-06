package com.loner.io;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/**
 * java.io.FilterReader.close() 方法关闭该流并释放与之关联的所有系统资源。一旦流被关闭，如再调用read(), ready(),
 * mark(), reset() 或skip() 将抛出IOException
 * 
 * @author Administrator
 *
 */
public class FilterReaderTest {
	public static void main(String[] args) throws Exception {

		FilterReader fr = null;
		Reader r = null;
		int i = 0;
		char c;

		try {
			// create new reader
			r = new StringReader("ABCDEFG");

			// create new filter reader
			fr = new FilterReader(r) {
			};

			// read till the end of the stream
			while ((i = fr.read()) != -1) {
				c = (char) i;
				System.out.println(c);
			}
		} catch (IOException e) {
			// if any I/O error occurs
			e.printStackTrace();
		} finally {
			// releases system resources
			if (r != null)
				r.close();
			if (fr != null) {
				fr.close();
				System.out.println("Stream is closed...");
				System.out.print(" system resources released");
			}
		}
	}
}
