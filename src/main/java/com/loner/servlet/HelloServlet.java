package com.loner.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
//@WebServlet(value = "/HelloServlet", asyncSupported = true)
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HelloServlet() {
		super();
	}

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("我是init()方法！用来进行初始化工作");
	}

	
	@Override
	public ServletConfig getServletConfig() {
		return super.getServletConfig();
	}

	@Override
	public String getServletInfo() {
		return super.getServletInfo();
	}

	@Override
	public String getServletName() {
		return super.getServletName();
	}
	
	public void printServlet() {
		ServletConfig sc = getServletConfig();
		String si = getServletInfo();
		String sn = getServletName();
		System.out.println("Servlet配置：" + sc.getInitParameterNames());
		System.out.println("".equals(si) ? "ServletInfo为空" : si);
		System.out.println(sn);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		printServlet();
//		response.getWriter().write("Hello,Welcome to Servlet World.");
		response.setCharacterEncoding("UTF-8");
//		response.getOutputStream().write("OutputStream".getBytes());
//		getOutputStream和getWriter这两个方法互相排斥
//		response.sendRedirect("http://www.baidu.com"); 地址栏改变、不仅限于本系统、参数放在URL上
		request.setAttribute("name", "tianpc");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/dispatcher.jsp");
		dispatcher.forward(request, response);//地址栏不改变、仅限于本系统、参数可以是url带parameter,session,request.setAttribute
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	@Override
	public void destroy() {
		super.destroy();
		System.out.println("我是destroy()方法！用来进行销毁实例的工作");
	}
}
