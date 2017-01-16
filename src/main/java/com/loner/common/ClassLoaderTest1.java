package com.loner.common;

import java.net.URL;

public class ClassLoaderTest1 {

	public static void main(String[] args) {
		URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
		for (int i = 0; i < urls.length; i++) {
			System.out.println(urls[i].toExternalForm());
		}
		System.out.println("-----sun.boot.class.path-----");
		System.out.println(System.getProperty("sun.boot.class.path"));
		System.out.println("++++++++++++");
		
		ClassLoader cl = ClassLoaderTest1.class.getClassLoader();
		while(cl != null) {
			System.out.println(cl);
			cl = cl.getParent();
		}
		System.out.println(cl);
	}

}
