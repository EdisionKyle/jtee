package com.loner.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class
 * HelloServletContextAttributeListener
 *
 */
//@WebListener
public class HelloServletContextAttributeListener implements
		ServletContextAttributeListener {

	/**
	 * Default constructor.
	 */
	public HelloServletContextAttributeListener() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
	 */
	public void attributeAdded(ServletContextAttributeEvent scab) {
		ServletContext application = scab.getServletContext();
		// 获取添加的属性名和属性值
		String name = scab.getName();
		Object value = scab.getValue();
		System.out.println(application + "范围内添加了名为" + name + "，值为" + value
				+ "的属性!");
	}

	/**
	 * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
	 */
	public void attributeReplaced(ServletContextAttributeEvent scab) {
		ServletContext application = scab.getServletContext();
		// 获取被替换的属性名和属性值
		String name = scab.getName();
		Object value = scab.getValue();
		System.out.println(application + "范围内名为" + name + "，值为" + value
				+ "的属性被替换!");
	}

	/**
	 * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
	 */
	public void attributeRemoved(ServletContextAttributeEvent scab) {
		ServletContext application = scab.getServletContext();
		// 获取被删除的属性名和属性值
		String name = scab.getName();
		Object value = scab.getValue();
		System.out.println(application + "范围内名为" + name + "，值为" + value
				+ "的属性被删除!");
	}

}
