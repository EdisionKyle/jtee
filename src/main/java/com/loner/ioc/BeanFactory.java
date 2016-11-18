package com.loner.ioc;

/**
 * IOC容器接口定义
 * 
 * @author Administrator
 *
 */
public interface BeanFactory {

	/**
	 * 根据id找到bean对应的对象实例
	 * 
	 * @author pengcheng.tian
	 * @param id
	 * @return
	 */
	public Object getBean(String id);

	/**
	 * Ioc容器中是否包含id的bean
	 * 
	 * @author pengcheng.tian
	 * @param id
	 * @return
	 */
	public boolean beanIsExist(String id);

}
