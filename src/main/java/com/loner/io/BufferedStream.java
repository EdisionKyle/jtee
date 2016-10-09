package com.loner.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStream {

	public static void main(String[] args) {

		String bin = "E:/Musics/Beat_It.mp3";

		String copy = "E:/Musics/Beat_It00.mp3";

		FileInputStream i = null;
		FileOutputStream o = null;
		BufferedInputStream bi = null;
		BufferedOutputStream bo = null;

		try {
			i = new FileInputStream(bin);
			o = new FileOutputStream(copy);
			bi = new BufferedInputStream(i);
			bo = new BufferedOutputStream(o);

			byte[] buf = new byte[1024];
			int temp = 0;
			while ((temp = bi.read(buf)) != -1) {
				bo.write(buf, 0, temp);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bi != null) {
				try {
					i.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bo != null) {
				try {
					o.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
