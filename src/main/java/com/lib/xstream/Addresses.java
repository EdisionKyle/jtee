package com.lib.xstream;

import java.util.Iterator;
import java.util.List;

/**
 *  说明：
 *  创建时间：2017年2月15日 下午5:54:53
 *  Copyright (C) 2017, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author milesloner
 */
public class Addresses {

	private List<Address> listAdd;

	public Addresses(List<Address> listAdd) {
		this.listAdd = listAdd;
	}

	public List<Address> getListAdd() {
		return listAdd;
	}

	public void setListAdd(List<Address> listAdd) {
		this.listAdd = listAdd;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (Iterator<Address> it = listAdd.iterator(); it.hasNext();) {
			Address add = (Address) it.next();
			sb.append(add.toString());
		}
		return "Addresses{" + "listAdd=" + sb.toString() + "}\n";
	}

}
