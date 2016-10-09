package com.loner.base;

import java.io.*;
import org.w3c.dom.*;
import javax.xml.parsers.*;

public class TestXMLDom {

	public static void main(String arge[]) {
		long lasting = System.currentTimeMillis();
		try {
			File f = new File(
					"D:\\spring\\JavaSE\\src\\com\\tpc\\javaseone\\data.xml");
			DocumentBuilderFactory factory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(f);
			NodeList nl = doc.getElementsByTagName("value");
			for (int i = 0; i < nl.getLength(); i++) {
				System.out.print("车牌号码:"
						+ doc.getElementsByTagName("no").item(i)
								.getFirstChild().getNodeValue());
				System.out.println(" 车主地址:"
						+ doc.getElementsByTagName("addr").item(i)
								.getFirstChild().getNodeValue());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("运行时间：" + (System.currentTimeMillis() - lasting)
				+ " 毫秒");
	}

}
