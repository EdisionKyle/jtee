/**
 *  工程名：jtee
 *  文件名：BeanHolder.java
 *  包名：com.loner.ioc
 *  创建时间：2016年11月16日 上午10:12:43
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 */
package com.loner.ioc;

import java.util.Map;

/**
 *  类名：BeanHolder
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年11月16日 上午10:12:43
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 */
public class BeanHolder {

	private String id;
	
	private String type;
	
	private Map<String, Object> properties;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Map<String, Object> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, Object> properties) {
		this.properties = properties;
	}
	
}
