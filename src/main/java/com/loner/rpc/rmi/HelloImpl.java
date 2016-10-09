package com.loner.rpc.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * 远程接口必须实现服务接口并且继承java.rmi.server.UnicastRemoteObject对象，构造方法必须抛出RemoteException
 * 
 * @author Administrator
 *
 */
public class HelloImpl extends UnicastRemoteObject implements IHello {

	private static final long serialVersionUID = -1982716344690063700L;

	/**
	 * 因为UnicastRemoteObject的构造方法抛出了RemoteException异常，
	 * 因此这里默认的构造方法必须写，必须声明抛出RemoteException异常
	 * 
	 * @throws RemoteException
	 */
	public HelloImpl() throws RemoteException {
		super();
	}

	public String helloWorld() throws RemoteException {
		return "Hello World!";
	}

	public String sayHelloToSomeBody(String someBodyName)
			throws RemoteException {
		return "您好," + someBodyName + "!";
	}

	public int compute(int a, int b, int c) throws RemoteException {
		return ((a + b) * c);
	}

	public double rmb2Dollar(double rmb) {
		return rmb * 0.125;
	}

	public CnStudent findCnStuent(CnStudent cs) throws RemoteException {
		return new CnStudent(cs.getUid(), "milesloner", "深圳市南山区", "Java攻城狮");
	}

}