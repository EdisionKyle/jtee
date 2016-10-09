package com.loner.servlet;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class HelloOnLineListener
 *
 */
//@WebListener
public class HelloOnLineListener implements HttpSessionListener {

	/**
	 * Default constructor.
	 */
	public HelloOnLineListener() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
	 */
	@SuppressWarnings("unchecked")
	public void sessionCreated(HttpSessionEvent se) {
		HttpSession session = se.getSession();
		// 获取sessionid
		String sessionid = session.getId();
		ServletContext application = session.getServletContext();
		if (session.isNew()) {// 如果是一次新的回话
			String user = (String) session.getAttribute("user");
			user = (user == null) ? "游客" : user;
			Map<String, String> online = (Map<String, String>) application
					.getAttribute("online");
			if (online == null) {
				online = new HashMap<String, String>();
			}
			online.put(sessionid, user);
			application.setAttribute("online", online);
		}
	}

	/**
	 * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
	 */
	@SuppressWarnings("unchecked")
	public void sessionDestroyed(HttpSessionEvent se) {
		HttpSession session = se.getSession();
		ServletContext application = session.getServletContext();
		String sessionid = session.getId();
		Map<String, String> online = (Map<String, String>) application
				.getAttribute("online");
		if (online != null)
			online.remove(sessionid);
		application.setAttribute("online", online);
	}

}
