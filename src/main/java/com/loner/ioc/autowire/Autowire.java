package com.loner.ioc.autowire;
/**
 * 这是代表自动装配的接口
 * @author pengcheng.tian
 */
public interface Autowire {
	/**
	 * 返回类中需要自动装配的类型的值
	 * @return
	 */
	public String getType();
}
