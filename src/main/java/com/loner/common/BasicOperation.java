/**
 *  工程名：jtee
 *  文件名：BasicOperation.java
 *  包名：com.loner.common
 *  创建时间：2016年11月10日 下午2:33:55
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 */
package com.loner.common;
/**
 *  类名：BasicOperation
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年11月10日 下午2:33:55
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 */
public enum BasicOperation implements Operation {

	PLUS("+"){
		public double apply(double x, double y) {
			return x + y;
		}
	},
	MINUS("-") {
		public double apply(double x, double y) {
			return x - y;
		}
	}
	;
	
	private String symbol;
	private BasicOperation(String symbol) {
		this.symbol = symbol;
	}

	public String getOper() {
		return this.symbol;
	}

}
