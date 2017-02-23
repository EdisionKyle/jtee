package com.loner.io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *  说明：
 *  创建时间：2017年2月23日 下午5:36:51
 *  Copyright (C) 2017, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author milesloner
 */
public class PipedInputStreamTest {

	public static void main(String[] args) {
		// 管道输出流
		PipedOutputStream out = new PipedOutputStream();
		// 管道输入流
		PipedInputStream in = null;
		try {
			// 连接两个管道流。或者调用connect(Piped..)；方法也可以
			in = new PipedInputStream(out);
			Thread read = new Thread(new Read(in));
			Thread write = new Thread(new Write(out));
			// 启动线程
			read.start();
			write.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class Write implements Runnable {

	PipedOutputStream pos = null;

	public Write(PipedOutputStream pos) {
		this.pos = pos;
	}

	public void run() {
		try {
			System.out.println("程序将在3秒后写入数据，请稍等...");
			Thread.sleep(3000);
			for(int i = 0; i < 20; i++) {
				pos.write(("萬里獨行--随机数：" + RandomStringUtils.randomNumeric(8)).getBytes());
				pos.flush();
				Thread.sleep(1000);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pos != null) {
					pos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

class Read implements Runnable {

	PipedInputStream pis = null;

	public Read(PipedInputStream pis) {
		this.pis = pis;
	}

	public void run() {
		byte[] buf = new byte[1024];
		try {
			short c = 0;
			while(true) {
				buf = new byte[1024];
				pis.read(buf);
				System.out.println(new String(buf));
				buf = null;
				c++;
				if(c > 20) {
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pis != null) {
					pis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
