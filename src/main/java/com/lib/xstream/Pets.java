package com.lib.xstream;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamImplicit;

/**
 *  说明：测试同一标签下循环某一对象
 *  创建时间：2017年2月15日 下午6:31:11
 *  Copyright (C) 2017, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author milesloner
 */
public class Pets {

	@XStreamImplicit(itemFieldName = "pet")
	private List<Animal> animalList;

	public List<Animal> getAnimalList() {
		return animalList;
	}

	public void setAnimalList(List<Animal> animalList) {
		this.animalList = animalList;
	}

}
