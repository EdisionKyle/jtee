/**
 *  工程名：jtee
 *  文件名：BeanCreateException.java
 *  包名：com.loner.ioc
 *  创建时间：2016年11月16日 上午10:47:21
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 */
package com.loner.ioc.exception;
/**
 *  类名：BeanCreateException
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年11月16日 上午10:47:21
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 */
public class BeanCreateException extends RuntimeException {

	private static final long serialVersionUID = 6276273917965334148L;

	public BeanCreateException() {
		super();
	}

	public BeanCreateException(String message) {
		super(message);
	}

	public BeanCreateException(Throwable cause) {
		super(cause);
	}

	public BeanCreateException(String message, Throwable cause) {
		super(message, cause);
	}

}
