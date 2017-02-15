package com.lib.xstream;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 *  说明：
 *  创建时间：2017年2月15日 下午6:29:19
 *  Copyright (C) 2017, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author milesloner
 */
@XStreamAlias("phoneNumber")
public class PhoneNumber {

	@XStreamAlias("code")
	private int code;
	@XStreamAlias("number")
	private String number;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
