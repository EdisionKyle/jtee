package com.loner.io;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 *  说明：
 *  创建时间：2017年2月23日 下午6:10:25
 *  Copyright (C) 2017, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author milesloner
 */
public class PipedWriter2PipedReaderTest {

	public static void main(String[] args) throws IOException {
		CharSenderThread cst = new CharSenderThread();
		CharReceiverThread crt = new CharReceiverThread();
		PipedWriter pw = cst.getPipedWriter();
		PipedReader pr = crt.getPipedReader();

		pw.connect(pr);
		/**
		 * 想想为什么下面这样写会报Piped not connect异常 ？
		 */
		// new Thread(new CharSenderThread()).start();
		// new CharReceiverThread().start();

		new Thread(cst).start();
		crt.start();
	}

}

@SuppressWarnings("unused")
class CharSenderThread implements Runnable {
	private PipedWriter pw = new PipedWriter();

	public PipedWriter getPipedWriter() {
		return pw;
	}

	@Override
	public void run() {
		// sendOneChar();
		sendShortMessage();
//		sendLongMessage();
	}

	private void sendOneChar() {
		try {
			pw.write("a".charAt(0));
			pw.flush();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void sendShortMessage() {
		try {
			pw.write("this is a short message from CharSenderThread !".toCharArray());
			pw.flush();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void sendLongMessage() {
		try {
			char[] b = new char[1028];
			// 生成一个长度为1028的字符数组、前1020个是1、后8个是2。
			for (int i = 0; i < 1020; i++) {
				b[i] = 'a';
			}
			for (int i = 1020; i < 1028; i++) {
				b[i] = 'b';
			}
			pw.write(b);
			pw.flush();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
@SuppressWarnings("unused")
class CharReceiverThread extends Thread {
	private PipedReader pr = new PipedReader();

	public PipedReader getPipedReader() {
		return pr;
	}

	@Override
	public void run() {
		// receiveOneChar();
		receiveShortMessage();
//		receiverLongMessage();
	}

	private void receiveOneChar() {
		try {
			int n = pr.read();
			System.out.println(n);
			pr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void receiveShortMessage() {
		try {
			char[] b = new char[1024];
			int n = pr.read(b);
			System.out.println(new String(b, 0, n));
			pr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void receiverLongMessage() {
		try {
			char[] b = new char[2048];
			int count = 0;
			while (true) {
				count = pr.read(b);
				for (int i = 0; i < count; i++) {
					System.out.print(b[i]);
				}
				if (count == -1)
					break;
			}
			pr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}