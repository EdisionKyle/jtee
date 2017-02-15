package com.lib.jaxb;

import org.junit.Test;

/**
 *  说明：包含复杂对象的转换测试
 *  创建时间：2017年2月15日 下午5:28:23
 *  Copyright (C) 2017, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author milesloner
 */
public class StudentTest {

	@Test
	public void showMarshaller() {

		Student student = new Student();
		student.setId(12);
		student.setName("test");

		Role role = new Role();
		role.setDesc("管理");
		role.setName("班长");

		student.setRole(role);

		String str = JaxbUtil.convertToXml(student);
		System.out.println(str);
	}

	@Test
	public void showUnMarshaller() {
		String str = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>" + "<student id=\"12\">"
				+ "    <name>test</name>" + "   <role>" + "      <name>班长</name>" + "     <desc>管理</desc>" + "</role>"
				+ "</student>";
		Student student = JaxbUtil.converyToJavaBean(str, Student.class);
		System.out.println(student);
	}

}
