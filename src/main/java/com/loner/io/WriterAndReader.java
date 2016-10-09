package com.loner.io;

import java.io.FileReader;
import java.io.FileWriter;

public class WriterAndReader {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("D:/test/fw.txt");
			fw.write("Hello to Java Home \r\n");
			fw.write("This is another new line \r\n олл─│К");
			fw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		FileReader fr = null;
		FileWriter fwcopy = null;
		int temp = 0;
		try {
			fr = new FileReader("D:/test/fw.txt");
			fwcopy = new FileWriter("D:/test/wfcopy.txt");
			while((temp = fr.read()) != -1) {
				System.out.print((char)temp);
				fwcopy.write(temp);
			}
			fr.close();
			fwcopy.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
