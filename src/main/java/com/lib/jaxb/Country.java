package com.lib.jaxb;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *  说明：集合对象的转换（同样适用于Set）
 *  创建时间：2017年2月15日 下午5:32:34
 *  Copyright (C) 2017, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author milesloner
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "country")
@XmlType(propOrder = { "name", "provinceList" })
public class Country {

	@XmlElement(name = "country_name")
	private String name;

	@XmlElementWrapper(name = "provinces")
	@XmlElement(name = "province")
	private List<Province> provinceList;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the provinceList
	 */
	public List<Province> getProvinceList() {
		return provinceList;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param provinceList
	 *            the provinceList to set
	 */
	public void setProvinceList(List<Province> provinceList) {
		this.provinceList = provinceList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Country [name=" + name + ", provinceList=" + provinceList + "]";
	}

}
