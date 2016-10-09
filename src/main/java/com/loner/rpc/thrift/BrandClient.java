/**
 *  工程名：jtee
 *  文件名：BrandClient.java
 *  包名：com.loner.rpc.thrift
 *  创建时间：2016年9月27日 下午4:08:36
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 */
package com.loner.rpc.thrift;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

/**
 *  类名：BrandClient
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年9月27日 下午4:08:36
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 */
public class BrandClient {
	public static final String SERVER_IP = "localhost";
	public static final int SERVER_PORT = 8090;
	public static final int TIMEOUT = 30000;

	/**
	 *
	 * @param userName
	 */
	public void startClient(String userName) {
		TTransport transport = null;
		try {
			transport = new TSocket(SERVER_IP, SERVER_PORT, TIMEOUT);
			// 协议要和服务端一致
			TProtocol protocol = new TBinaryProtocol(transport);
			BrandService.Client client = new BrandService.Client(protocol);
			transport.open();
			String result = client.sayHello(userName);
			System.out.println("Thrify client result =: \n\t" + result);
		} catch (TTransportException e) {
			e.printStackTrace();
		} catch (TException e) {
			e.printStackTrace();
		} finally {
			if (null != transport) {
				transport.close();
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BrandClient client = new BrandClient();
		client.startClient("Michael");
	}

}
