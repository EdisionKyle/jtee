/**
 *  工程名：jtee
 *  文件名：AuditNotifyStatus.java
 *  包名：com.loner.base
 *  创建时间：2016年11月10日 下午3:25:18
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 */
package com.loner.base;
/**
 *  类名：AuditNotifyStatus
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年11月10日 下午3:25:18
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 */
public enum AuditNotifyStatus implements EnumMessage {
	Sms(2, "短信"), Mail(4, "邮箱"), SmsAndMail(6, "短信和邮箱");
	private final Integer _code;
	private final String _message;

	AuditNotifyStatus(Integer code, String message) {
		_code = code;
		_message = message;
	}

	@Override
	public Integer getValue() {
		return _code;
	}

	@Override
	public String getMessage() {
		return _message;
	}
}
