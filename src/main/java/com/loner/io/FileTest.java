package com.loner.io;

import java.io.File;

public class FileTest {

	public static void main(String[] args) throws Exception {
		File file = new File("D:\\logs\\student");
		File file1 = new File("D:/logs/stu");
		System.out.println("D:\\logs\\student是否存在" + file.exists());
		System.out.println("D:/logs/stu是否存在" + file1.exists());
		// 创建文件
		file.createNewFile();
		System.out.println("file可执行" + file.canExecute());
		// 如果该参数等于此抽象路径名，则返回零；比较file.getPath()
		// 如果此抽象路径名在字母顺序上小于该参数，则返回小于零的值；
		// 如果此抽象路径名在字母顺序上大于该参数，则返回大于零的值
		System.out.println("file和file1比较" + file1.compareTo(file));
		// file.delete(); 删除文件
		// file.deleteOnExit();在JVM进程退出的时候删除文件,通常用在临时文件的删除
		System.out.println(file.getAbsoluteFile().getAbsolutePath());
		System.out.println(file.getAbsolutePath());// 抽象路径名
		System.out.println("抽象路径名的规范形式 " + file.getCanonicalFile());
		System.out.println(file.getFreeSpace());
		System.out.println(file.getTotalSpace() + " - "
				+ file1.getUsableSpace());
		System.out.println("file.length()-字节：" + file1.length());
		File dir = new File("D:/logs");
		String[] dirList = dir.list();
		for (String s : dirList) {
			System.out.println("dir.list()：" + s);
		}
		System.out.println("-----------");
		File[] fileList = dir.listFiles();
		for (File s : fileList) {
			System.out.println("dir.listFiles()：" + s);
		}
		System.out.println("+++++++++");
		System.out.println(file.toURI());
		System.out.println(file.toPath());
		
		File f = new File("D:/logs/s");
        File f1 = new File("D:/logs/stu");
        
        // rename file
        Boolean bool = f.renameTo(f1);
        System.out.println(bool);
	}

}
