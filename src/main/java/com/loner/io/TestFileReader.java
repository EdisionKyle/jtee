package com.loner.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {

	public static void main(String[] args) {
		File f = new File("d:/test/char.txt");
		String oldStr = "";
		BufferedReader br = null;
		try {
			FileReader fr = new FileReader(f);
			br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {
				oldStr = oldStr + line + "\r\n";
				//newLine()方法依据平台而定
                //windows下的换行是\r\n
                //Linux下则是\n
			}
			System.out.println(oldStr);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
