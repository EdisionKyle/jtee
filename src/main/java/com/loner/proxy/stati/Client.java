package com.loner.proxy.stati;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UserManager userManager = new UserManagerImplProxy(
				new UserManagerImpl());
		userManager.addUser("001", "于亮");
	}

}