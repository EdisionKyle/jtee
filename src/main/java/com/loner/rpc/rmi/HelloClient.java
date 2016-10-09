package com.loner.rpc.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class HelloClient {
	public static void main(String args[]) {
		try {
			IHello rhello = (IHello) Naming
					.lookup("rmi://localhost:8888/RHello");
			String result = rhello.helloWorld();
			System.out.println(result);
			if("Hello World!".equals(result)){
				System.out.println("Good！远程方法调用哦成功。");
			}
			System.out.println("*****************");
			System.out.println(rhello.sayHelloToSomeBody("熔岩"));
			System.out.println("*****************");
			System.out.println(rhello.compute(3, 4, 5));
			System.out.println(rhello.findCnStuent(new CnStudent("P987238746827")).toString());
		} catch (NotBoundException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

}