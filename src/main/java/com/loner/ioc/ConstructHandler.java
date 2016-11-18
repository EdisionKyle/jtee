/**
 *  工程名：jtee
 *  文件名：ConstructHandler.java
 *  包名：com.loner.ioc
 *  创建时间：2016年11月16日 上午10:43:26
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 */
package com.loner.ioc;

import java.util.List;

/**
 *  类名：ConstructHandler
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年11月16日 上午10:43:26
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 */
public interface ConstructHandler {

	/**
	 * 使用无参的构造器创建bean实例, 不设置任何属性
	 * 
	 * @param className
	 * @return
	 */
	public Object createBeanUseDefaultConstruct(String className);

	/**
	 * 使用有参数的构造器创建bean实例, 不设置任何属性
	 * 
	 * @param className
	 * @param args
	 *            参数集合
	 * @return
	 */
	public Object createBeanUseDefineConstruct(String className, List<Object> args);

}
