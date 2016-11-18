package com.loner.ioc.element;

import java.util.ArrayList;
import java.util.List;

/**
 * 这里我们使用的是组合模式，一个集合元素本身包含了多个叶子元素ref或者value
 * 本身可以不用实现LeafElement但是这里我们为了使CollectionElement和LeafElement
 * 以同样的方式被处理所以我们实现了LeafElement
 * @author pengcheng.tian
 */
public class CollectionElement implements LeafElement {
	private String type;
	private List<LeafElement> list;
	public void setList(List<LeafElement> list) {
		this.list = list;
	}
	public void add(LeafElement leafElement) {
		this.list.add(leafElement);
	}
	@Override
	public String getType() {
		return this.type;
	}
	public CollectionElement(String type) {
		this.type = type;
		
	}
	public List<LeafElement> getList() {
		return list;
	}
	@Override
	public Object[] getValue() {
		List<Object> value = new ArrayList<Object>();
		for(LeafElement le:this.getList()) {
			value.add(le.getValue());
		}
		return value.toArray();
	}

}
