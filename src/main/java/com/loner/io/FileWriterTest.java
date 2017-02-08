package com.loner.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		File f = new File("d:/test/char.txt");
		String newStr = "高尚的追求，使生命变得壮丽，使精神变得富有；庸俗的追求，使人生变得昏暗，使青春变得衰朽。\r\n"
				+ "灵魂在耕耘中净化，信念在耕耘中升腾。转首回望，耕耘后是一片清新的天地，一个绚丽的人生。\r\n"
				+ "人生是海洋，希望是舵手的罗盘，使人们在暴风雨中不致迷失方向。";
		FileWriter fw;
		try {
			fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(newStr);
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
