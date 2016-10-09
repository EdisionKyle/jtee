/**
 *  工程名：jtee
 *  文件名：BrandServer.java
 *  包名：com.loner.rpc.thrift
 *  创建时间：2016年9月27日 下午4:00:23
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 */
package com.loner.rpc.thrift;

import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;

/**
 *  类名：BrandServer
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年9月27日 下午4:00:23
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 */
public class BrandServer {
	public static final int SERVER_PORT = 8090;

	public void startServer() {
		try {
			System.out.println("BrandService TSimpleServer start...");

			TProcessor tprocessor = new BrandService.Processor<BrandService.Iface>(new BrandServiceImpl());

			// 简单的单线程服务模型，一般用于测试
			TServerSocket serverTransport = new TServerSocket(SERVER_PORT);
			TServer.Args tArgs = new TServer.Args(serverTransport);
			tArgs.processor(tprocessor);
			tArgs.protocolFactory(new TBinaryProtocol.Factory());
			TServer server = new TSimpleServer(tArgs);
			server.serve();

		} catch (Exception e) {
			System.out.println("BrandService TSimpleServer start error...");
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BrandServer server = new BrandServer();
		server.startServer();
	}

}