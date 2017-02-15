package com.lib.xstream;

import java.util.Iterator;
import java.util.List;

/**
 *  说明：
 *  创建时间：2017年2月15日 下午5:56:02
 *  Copyright (C) 2017, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author milesloner
 */
public class Persons {

	private String type;
	private List<Person> listPerson;

	public Persons(List<Person> listPerson, String type) {
		this.listPerson = listPerson;
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Person> getListPerson() {
		return listPerson;
	}

	public void setListPerson(List<Person> listPerson) {
		this.listPerson = listPerson;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (Iterator<Person> it = listPerson.iterator(); it.hasNext();) {
			Person p = (Person) it.next();
			sb.append(p.toString());
		}
		return "Persons{" + "type='" + type + '\'' + ", listPerson=" + sb.toString() + "}\n";
	}

}
