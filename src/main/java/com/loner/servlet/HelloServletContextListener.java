package com.loner.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class HelloListener
 *
 */
//@WebListener
public class HelloServletContextListener implements ServletContextListener {

	/**
	 * Default constructor.
	 */
	public HelloServletContextListener() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("HelloServletContextListener初始化");
		System.out.println(sce.getServletContext().getServerInfo());
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("HelloServletContextListener销毁");
	}

}
