package com.lib.xstream;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamImplicit;

/**
 *  说明：用Xstream注解的方式实现：一个标签下有多个同名标签
 *  创建时间：2017年2月15日 下午6:29:50
 *  Copyright (C) 2017, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author milesloner
 */
public class Friends {

	@XStreamImplicit(itemFieldName = "name") // itemFieldName定义重复字段的名称，
	/*
	 * <friends> <friends> <name>A1</name> <String>A1</String> <name>A2</name>
	 * 如果没有，则会变成 =====> <String>A1</String> <name>A3</name> <String>A1</String>
	 * </friends> </friends>
	 */
	private List<String> name;

	public List<String> getName() {
		return name;
	}

	public void setName(List<String> name) {
		this.name = name;
	}

}
