package com.loner.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintTest {

	public static void main(String[] args) {
		try{
			PrintStream ps = new PrintStream(new FileOutputStream(new File("d:\\test\\abc.txt")));
			PrintWriter pw = new PrintWriter(new FileWriter(new File("d:\\test\\def.txt")),true);
			
			ps.println("hello，to my world。谢谢\n巴嘎");
			pw.write("Hello,I'm come from printwriter.信息");
			pw.println("我是通过println写入");
			ps.flush();
			ps.close();
			pw.flush();
			pw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}