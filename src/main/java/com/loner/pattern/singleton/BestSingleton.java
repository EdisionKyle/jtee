package com.loner.pattern.singleton;

public class BestSingleton {

	private BestSingleton() {
	}

	private static class SingletonHolder {
		public static final BestSingleton INSTANCE = new BestSingleton();
	}

	public static BestSingleton getInstance() {
		return SingletonHolder.INSTANCE;
	}

}
