package com.loner.io;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * fd对象是非常重要的一个变量，“fd=1”就代表了“标准输出”，“fd=0”就代表了“标准输入”，“fd=2”就代表了“标准错误输出”
 * 
 * @author pengcheng.tian
 *
 */
public class FileDescriptorTest {

	public static void main(String[] args) {

		try {
			FileOutputStream out = new FileOutputStream(FileDescriptor.err);
			out.write('A');
			out.close();
			// 输出信息到屏幕，等价于System.out.print('A');
		} catch (IOException e) {
		}
//		System.err.println('A');
	}

}
