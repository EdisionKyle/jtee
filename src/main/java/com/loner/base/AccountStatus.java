/**
 *  工程名：jtee
 *  文件名：AccountStatus.java
 *  包名：com.loner.base
 *  创建时间：2016年11月10日 下午3:24:39
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 */
package com.loner.base;
/**
 *  类名：AccountStatus
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年11月10日 下午3:24:39
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 */
//枚举类
public enum AccountStatus implements EnumMessage {
	Init(0, "初始化"), Ready(1, "正常"), ChangePassword(2, "需要修改密码"), Frozen(4, "冻结"), Disabled(64, "禁用");
	private final Integer _code;
	private final String _message;

	AccountStatus(Integer code, String message) {
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
