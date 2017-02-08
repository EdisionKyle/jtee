package com.loner.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * DataOutputStream与DataInputstream包装OutputStream与InputStream。
 * 在读写操作上更加丰富，应用更简便。能直接Write和read各种基本数据类型和字符串
 * 
 * @author pengcheng.tian
 *
 */
public class DataInputStreamTest {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos3 = new FileOutputStream("test2.txt");
		DataOutputStream dos = new DataOutputStream(fos3);
		dos.writeUTF("哈哈222222222222xxxxxxxxxxxxxxx");
		dos.close();

		FileInputStream fis3 = new FileInputStream("test2.txt");
		DataInputStream dis = new DataInputStream(fis3);
		String str2 = dis.readUTF();
		System.out.println(str2);
		dis.close();

		FileOutputStream fos4 = new FileOutputStream("test3.txt");
		DataOutputStream dos2 = new DataOutputStream(fos4);
		dos2.writeInt(12);
		dos2.writeFloat((float) 2.5);
		dos2.writeChars("测试");
		dos2.close();

		FileInputStream fis4 = new FileInputStream("test3.txt");
		DataInputStream dis2 = new DataInputStream(fis4);
		int disInt = dis2.readInt();
		float disFloat = dis2.readFloat();
		char chardis = dis2.readChar();
		char chardis2 = dis2.readChar();
		System.out.println(disInt + " " + disFloat + " " + chardis + "" + chardis2);
		dis2.close();
	}

}
