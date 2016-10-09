package com.loner.base;

import java.io.*;
import java.util.*;
import org.jdom.*;
import org.jdom.input.*;

public class TestXMLJDom {

	public static void main(String arge[]) {
		long lasting = System.currentTimeMillis();
		try {
			SAXBuilder builder = new SAXBuilder();
			Document doc = builder.build(new File(
					"D:\\spring\\JavaSE\\src\\com\\tpc\\javaseone\\data.xml"));
			Element foo = doc.getRootElement();
			List allChildren = foo.getChildren();
			for (int i = 0; i < allChildren.size(); i++) {
				System.out.print("车牌号码:"
						+ ((Element) allChildren.get(i)).getChild("no")
								.getText());
				System.out.println(" 车主地址:"
						+ ((Element) allChildren.get(i)).getChild("addr")
								.getText());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("运行时间：" + (System.currentTimeMillis() - lasting)
				+ " 毫秒");
	}
}