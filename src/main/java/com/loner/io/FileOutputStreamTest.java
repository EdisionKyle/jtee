package com.loner.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		byte[] info = { 12, 34, 56, 76, 89, 54, 28, 90, 's' };
		String dirName = "d:/test";
		String fileName = "byte.txt";
		try {
			File dir = new File(dirName); // 创建目录路径对象
			if (!dir.exists())
				dir.mkdir(); // 检测目录是否存在
			File file = new File(dir, fileName); // 创建文件对象
			file.createNewFile(); // 创建空文件
			FileOutputStream outputFile = new FileOutputStream(file);
//			for (int i = 0; i < info.length; i++)
//				outputFile.write(info[i]); // 写数据
			outputFile.write(info);
			outputFile.close(); // 关闭文件
		} catch (IOException e) {
			System.out.println("IOException " + e + " occurred.");
		}
	}

}
