package com.loner.io;

import java.io.File;

/**
 * File方法测试
 * 
 * @author Administrator
 *
 */
public class FileTest1 {

	public static void main(String[] args) {
		File file = new File("D:\\Resource\\train\\buf.txt");
		System.out.println(file.isFile());
		System.out.println(File.separator);
		System.out.println(File.separatorChar);
		System.out.println(File.pathSeparator);
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.getParentFile().getName());
		System.out.println(file.getPath());
		System.out.println(file.isAbsolute());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.length());
		System.out.println(file.getTotalSpace());
		System.out.println(file.getFreeSpace());
		System.out.println(file.getUsableSpace());
	}

}
