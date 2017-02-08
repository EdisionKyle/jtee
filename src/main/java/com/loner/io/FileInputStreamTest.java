package com.loner.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
字符流有两个抽象类：Writer   Reader
其对应子类FileWriter和FileReader可实现文件的读写操作
BufferedWriter和BufferedReader能够提供缓冲区功能，用以提高效率
同样，字节流也有两个抽象类：InputStream   OutputStream
其对应子类有FileInputStream和FileOutputStream实现文件读写
BufferedInputStream和BufferedOutputStream提供缓冲区功能
 */
public class FileInputStreamTest {

	public static void main(String[] args) {
		byte[] info = new byte[9];
		String dirName = "d:/test";
		String fileName = "byte.txt";
		try {
			File dir = new File(dirName); // 创建目录对象
			File file = new File(dir, fileName); // 创建文件对象
			FileInputStream inputFile = new FileInputStream(file);
//			inputFile.read(info); // 读文件
			int temp = 0;
			int i = 0;
			while((temp = inputFile.read()) != -1){
				info[i++] = (byte)temp;
			}
			inputFile.close(); // 关闭文件
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException" + e + " occured.");
		} catch (IOException e) {
			System.out.println("IOException " + e + " occured.");
		}
		for (int i = 0; i < info.length; i++)
			System.out.print(info[i] + "   ");
	}

}
