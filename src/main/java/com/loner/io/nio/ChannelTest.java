package com.loner.io.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Channel读取和写入
 * 
 * @author Administrator
 *
 */
public class ChannelTest {

	public static void main(String[] args) throws IOException {
		ChannelTest channel = new ChannelTest();
		channel.write();
		// channel.read();
	}

	public void read() throws IOException {
		FileInputStream fin = new FileInputStream(
				"D:\\Resource\\train\\channel.txt");
		// 获取通道
		FileChannel fc = fin.getChannel();
		// 创建缓冲区
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		// 读取数据到缓冲区
		fc.read(buffer);
		buffer.flip();

		while (buffer.remaining() > 0) {
			byte b = buffer.get();
			System.out.print(((char) b));
		}

		fin.close();
	}

	public void write() throws IOException {
		String message[] = { "83", "111", "109", "101", "32", "98", "121",
				"116", "101", "115", "46" };

		FileOutputStream fout = new FileOutputStream(
				"D:\\Resource\\train\\channel.txt");
		FileChannel fc = fout.getChannel();
		ByteBuffer buffer = ByteBuffer.allocate(1024);

		for (int i = 0; i < message.length; ++i) {
			buffer.put(message[i].getBytes());
		}
		buffer.flip();
		fc.write(buffer);

		fout.close();
	}

}
