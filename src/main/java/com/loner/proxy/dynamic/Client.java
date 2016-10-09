package com.loner.proxy.dynamic;

import com.loner.proxy.stati.UserManager;
import com.loner.proxy.stati.UserManagerImpl;

public class Client {

	public static void main(String[] args) {
		ProxyHandler proxyHandler = new ProxyHandler();
		UserManager userManager = (UserManager) proxyHandler
				.newProxyInstance(new UserManagerImpl());
		// UserManager userManager=new UserManagerImpl();
		userManager.addUser("111100000000", "张三");
		userManager.delUser("11335577");
	}

}
