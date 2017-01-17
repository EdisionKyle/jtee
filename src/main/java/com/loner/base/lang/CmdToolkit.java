package com.loner.base.lang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 控制台处理工具箱
 * 
 * @author pengcheng.tian
 *
 */
public class CmdToolkit {

	private CmdToolkit() {
	}

	/**
	 * 读取控制命令的输出结果
	 *
	 * @param cmd
	 *            命令
	 * @param isPrettify
	 *            返回的结果是否进行美化（换行），美化意味着换行，默认不进行美化,当此参数为null时也不美化，
	 * @return 控制命令的输出结果
	 * @throws IOException
	 */
	public static String readConsole(String cmd, Boolean isPrettify) throws IOException {
		StringBuffer cmdout = new StringBuffer();
		System.out.println("执行命令：" + cmd);
		Process process = Runtime.getRuntime().exec(cmd); // 执行一个系统命令
		InputStream fis = process.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(fis, "gbk"));
		String line = null;
		if (isPrettify == null || isPrettify) {
			while ((line = br.readLine()) != null) {
				cmdout.append(line);
			}
		} else {
			while ((line = br.readLine()) != null) {
				cmdout.append(line).append(System.getProperty("line.separator"));
			}
		}
		System.out.println("执行系统命令后的结果为：\n" + cmdout.toString());
		return cmdout.toString().trim();
	}

	public static void showEnv() throws IOException {
		ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "java", "-version");
		// 如果将值设置为 true，标准错误将与标准输出合并。这使得关联错误消息和相应的输出变得更容易。

		// 在此情况下，合并的数据可从 Process.getInputStream() 返回的流读取
		pb.redirectErrorStream(true);
		pb.environment().put("Path", "C:/Java/jdk1.8.0_91/bin");
		pb.environment().put("JAVA_HOME", "C:/Java/jdk1.8.0_91");

		Process ps = pb.start();
		Scanner scanner = new Scanner(ps.getInputStream());
		StringBuilder result = new StringBuilder();
		while (scanner.hasNextLine()) {
			result.append(scanner.nextLine());
			result.append(System.getProperty("line.separator"));
		}

		scanner.close();
		System.out.println(result.toString());
	}

	public static void main(String[] args) throws IOException {
		CmdToolkit.readConsole("tasklist", true);
		CmdToolkit.readConsole("ipconfig", false);
		CmdToolkit.showEnv();
	}

}
