package com.loner.rpc.hession;

import java.net.MalformedURLException;
import java.util.Map;

import com.caucho.hessian.client.HessianProxyFactory;

/*
 * 客户端——>序列化写到输出流——>远程方法(服务器端)——>序列化写到输出流 ——>客户端读取输入流——>输出结果
 */
public class HessianClient {

	public static void main(String[] args) throws MalformedURLException,
			InterruptedException {
	
		String url = "http://localhost:8080/jtee/userServlet";

		HessianProxyFactory factory = new HessianProxyFactory();
		IUserService da = (IUserService) factory.create(IUserService.class, url);
		System.err.println("获取字符串");
		da.setName("test");
		System.out.println(da.sayHello());
		System.err.println("获取实体对象");
		User user = da.getUser();
		System.out.println(user.getName());
		System.err.println("获取List");
		for (String fruit : da.getLoveFruit()) {
			System.out.println(fruit);
		}
		System.err.println("获取Map");
		for (Map.Entry<String, String> entry : da.getBabays().entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key=" + key + " value=" + value);
		}
	}

}