package com.lib.xstream;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 *  说明：注解测试
 *  创建时间：2017年2月15日 下午6:27:33
 *  Copyright (C) 2017, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author milesloner
 */
public class PersonTest {

	public static void main(String[] args) {
		// toXml
		// new PersonTest().toXml();

		// toBean
		new PersonTest().toBean();
	}

	/**
	 * 注解生产xml
	 * 
	 * @Title: toXml
	 * @return String
	 */
	public String toXml() {
		PersonBean per = new PersonBean();
		per.setFirstName("chen");
		per.setLastName("youlong");

		PhoneNumber tel = new PhoneNumber();
		tel.setCode(137280);
		tel.setNumber("137280968");

		PhoneNumber fax = new PhoneNumber();
		fax.setCode(20);
		fax.setNumber("020221327");
		per.setTel(tel);
		per.setFax(fax);

		// 测试一个标签下有多个同名标签
		List<String> friendList = new ArrayList<String>();
		friendList.add("A1");
		friendList.add("A2");
		friendList.add("A3");
		Friends friend1 = new Friends();
		friend1.setName(friendList);
		per.setFriend(friend1);

		// 测试一个标签下循环对象
		Animal dog = new Animal("doly", 2);
		Animal cat = new Animal("Ketty", 2);
		List<Animal> petList = new ArrayList<Animal>();
		petList.add(dog);
		petList.add(cat);
		Pets pet = new Pets();
		pet.setAnimalList(petList);
		per.setPet(pet);

		XStream xstream = new XStream(new DomDriver("utf-8")); // 指定编码解析器
		xstream.processAnnotations(PersonBean.class);// 如果没有这句，xml中的根元素会是<包.类名>；或者说：注解根本就没生效，所以的元素名就是类的属性
		xstream.aliasSystemAttribute(null, "class");
		String xmlString = xstream.toXML(per);
		System.out.println("xml===\n" + xmlString);
		return xmlString;
	}

	/**
	 * toBean
	 * 
	 * @Title: toBean
	 * @return
	 * @return PersonBean
	 */
	public PersonBean toBean() {
		String xmlStr = "<person>" + "<firstName>chen</firstName>" + "<lastName>youlong</lastName>" + "<telphone>"
				+ "<code>137280</code>" + "<number>137280968</number>" + "</telphone>" + "<faxphone>"
				+ "<code>20</code>" + "<number>020221327</number>" + "</faxphone>" + "<friends>" + "<name>A1</name>"
				+ "<name>A2</name>" + "<name>A3</name>" + "</friends>" + "<pets>" + "<pet>" + "<name>doly</name>"
				+ "<age>2</age>" + "</pet>" + "<pet>" + "<name>Ketty</name>" + "<age>2</age>" + "</pet>" + "</pets>"
				+ "</person>";

		XStream xstream = new XStream(new DomDriver()); // 注意：不是new Xstream();
														// 否则报错：java.lang.NoClassDefFoundError:
														// org/xmlpull/v1/XmlPullParserFactory
		xstream.processAnnotations(PersonBean.class);
		PersonBean person = (PersonBean) xstream.fromXML(xmlStr);
		System.out.println("person=firstname==" + person.getFirstName());
		System.out.println("person==Friends==name1==" + person.getFriend().getName().get(0));
		System.out.println("person==Pets==name==" + person.getPet().getAnimalList().get(1).getName());
		return person;
	}

}
