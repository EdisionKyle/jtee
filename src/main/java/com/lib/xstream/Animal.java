package com.lib.xstream;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 *  说明：测试同一标签下循环某一对象
 *  创建时间：2017年2月15日 下午6:30:34
 *  Copyright (C) 2017, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author milesloner
 */
public class Animal {

	@XStreamAlias("name")
	private String name;
	@XStreamAlias("age")
	private int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
