/**
 *  工程名：jtee
 *  文件名：BrandServiceImpl.java
 *  包名：com.loner.rpc.thrift
 *  创建时间：2016年9月27日 下午3:39:24
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 */
package com.loner.rpc.thrift;

import java.util.Date;

import org.apache.thrift.TException;

/**
 *  类名：BrandServiceImpl
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年9月27日 下午3:39:24
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 */
public class BrandServiceImpl implements BrandService.Iface {

	public BrandServiceImpl() {
	}

	@Override
	public String sayHello(String username) throws TException {
		return "Hi," + username + " welcome to thrift, now is:" + new Date();
	}

}
