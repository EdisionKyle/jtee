/**
 *  工程名：jtee
 *  文件名：CommonBase.java
 *  包名：com.loner.core
 *  创建时间：2016年12月16日 上午9:41:41
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 */
package com.loner.core;
/**
 *  类名：CommonBase
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年12月16日 上午9:41:41
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 */
public class CommonBase {

	public static void main(String[] args) {
		String a = "ABC";
		Object b = new Object();
		System.out.println(a.intern() == b);
	}

}
