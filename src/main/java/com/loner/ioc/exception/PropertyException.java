/**
 *  工程名：jtee
 *  文件名：PropertyException.java
 *  包名：com.loner.ioc
 *  创建时间：2016年11月16日 上午10:54:04
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 */
package com.loner.ioc.exception;
/**
 *  类名：PropertyException
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年11月16日 上午10:54:04
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 */
public class PropertyException extends RuntimeException {

	private static final long serialVersionUID = -6698765159305576430L;

	public PropertyException() {
		super();
	}

	public PropertyException(String message) {
		super(message);
	}

	public PropertyException(Throwable cause) {
		super(cause);
	}

	public PropertyException(String message, Throwable cause) {
		super(message, cause);
	}

}
