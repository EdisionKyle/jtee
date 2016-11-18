package com.loner.ioc.autowire;

/**
 * 根据姓名自动装配的类，实现自动装配的接口
 * @author pengcheng.tian
 *
 */
public class ByNameAutowire implements Autowire {
	/**
	 * 用一个构造方法保存传入的自动装配的类型值
	 */
	private String type;
	public ByNameAutowire(String type) {
		this.type = type;
	}
	/**
	 * 返回传入的需要自动装配的value值
	 */
	public String getType() {
		return type;
	}
}
