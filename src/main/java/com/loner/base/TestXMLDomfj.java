package com.loner.base;

import java.io.*;
import java.util.*;
import org.dom4j.*;
import org.dom4j.io.*;

public class TestXMLDomfj {

	public static void main(String arge[]) {
		long lasting = System.currentTimeMillis();
		try {
			File f = new File("D:\\spring\\JavaSE\\src\\com\\tpc\\javaseone\\data.xml");
			SAXReader reader = new SAXReader();
			Document doc = reader.read(f);
			Element root = doc.getRootElement();
			Element foo;
			for (Iterator i = root.elementIterator("value"); i.hasNext();) {
				foo = (Element) i.next();
				System.out.print("车牌号码:" + foo.elementText("no"));
				System.out.println(" 车主地址:" + foo.elementText("addr"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("运行时间：" + (System.currentTimeMillis() - lasting)
				+ " 毫秒");
	}
}
