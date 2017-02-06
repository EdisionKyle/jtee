package com.loner.io;

import java.io.IOException;
import java.io.StringWriter;

/**
 * java.io.StringWriter.close()
 * 方法关闭StringWriter，但没有任何效果。在这个类中的方法可以在流已关闭后调用，而不会产生一个IOException
 * 
 * @author Administrator
 *
 */
public class StringWriterTest {

	public static void main(String[] args) {

		// create a new writer
		StringWriter sw = new StringWriter();

		// create a new sequence
		String s = "Hello world";

		// write a string
		sw.write(s);

		// print result
		System.out.println("" + sw.toString());

		try {
			// close the writer
			sw.close();
		} catch (IOException ex) {
			ex.printStackTrace();
			;
		}
		sw.write("243");
		System.out.println(sw.toString());
	}

}
