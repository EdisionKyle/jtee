/**
 *  工程名：jtee
 *  文件名：CnSutdent.java
 *  包名：com.loner.rmi
 *  创建时间：2016年9月26日 下午1:40:29
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 */
package com.loner.rpc.rmi;

import java.io.Serializable;

/**
 *  类名：CnSutdent
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年9月26日 下午1:40:29
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 */
public class CnStudent implements Serializable {

	private static final long serialVersionUID = -1581420683212612502L;

	private String uid;
	private String uname;
	private String addr;
	private String job;

	public CnStudent() {
		super();
	}

	public CnStudent(String uid) {
		super();
		this.uid = uid;
	}


	public CnStudent(String uid, String uname, String addr, String job) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.addr = addr;
		this.job = job;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "CnStudent [uid=" + uid + ", uname=" + uname + ", addr=" + addr + ", job=" + job + "]";
	}

}
