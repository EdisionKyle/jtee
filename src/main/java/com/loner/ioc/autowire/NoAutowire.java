package com.loner.ioc.autowire;
/**
 * 这个类代表不自动装配的类
 * @author pengcheng.tian
 *
 */
public class NoAutowire implements Autowire {
	
	@SuppressWarnings("unused")
	private String type;
	public NoAutowire(String type) {
		this.type = type;
	}
	/**
	 * 直接返回no，表示不需要自动装配
	 */
	public String getType() {
		return "no";
	}

}
