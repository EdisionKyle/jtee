package com.loner.base;

import org.xml.sax.*;
import org.xml.sax.helpers.*;
import javax.xml.parsers.*;

public class TestXMLSAX extends DefaultHandler {

	java.util.Stack tags = new java.util.Stack();

	public TestXMLSAX() {
		super();
	}

	public static void main(String args[]) {
		long lasting = System.currentTimeMillis();
		try {
			SAXParserFactory sf = SAXParserFactory.newInstance();
			SAXParser sp = sf.newSAXParser();
			TestXMLSAX reader = new TestXMLSAX();
			sp.parse(new InputSource(
					"D:\\spring\\JavaSE\\src\\com\\tpc\\javaseone\\data.xml"),
					reader);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("运行时间：" + (System.currentTimeMillis() - lasting)
				+ " 毫秒");
	}

	public void characters(char ch[], int start, int length)
			throws SAXException {
		String tag = (String) tags.peek();
		if (tag.equals("no")) {
			System.out.print("车牌号码：" + new String(ch, start, length));
		}
		if (tag.equals("addr")) {
			System.out.println("地址:" + new String(ch, start, length));
		}
	}

	public void startElement(String uri, String localName, String qName,
			Attributes attrs) {
		tags.push(qName);
	}
}