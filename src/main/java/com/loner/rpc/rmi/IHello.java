package com.loner.rpc.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 定义远程服务接口，必须继承Remote接口，其中需要远程调用的方法必须抛出RemoteException异常
 */
public interface IHello extends Remote {

	public String helloWorld() throws RemoteException;

	public String sayHelloToSomeBody(String someBodyName)
			throws RemoteException;

	public int compute(int a, int b, int c) throws RemoteException;

	public double rmb2Dollar(double rmb) throws RemoteException;

	public CnStudent findCnStuent(CnStudent cs) throws RemoteException;

}