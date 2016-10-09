package com.loner.ioc;

/**
 * IOC容器接口定义
 * 
 * @author Administrator
 *
 */
public interface BeanFactory {

	Object getBean(String id);

}
