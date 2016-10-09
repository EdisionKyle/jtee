package com.loner.servlet;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class MethodFilter
 */
//@WebFilter(filterName = "/MethodFilter", value = "/*")
public class MethodFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public MethodFilter() {
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("----过滤器销毁----");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		Map<String, String[]> ep = request.getParameterMap();
		if (ep != null) {
			System.out.println("参数开始--->>");
			Iterator<Entry<String, String[]>> si = ep.entrySet().iterator();
			while (si.hasNext()) {
				Map.Entry<String, String[]> entry = si.next();
				System.out.println("key= " + entry.getKey() + "； value= " + (entry.getValue().length > 0 ? entry.getValue()[0] : ""));
			}
			System.out.println("参数结束<<---");
		}
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		System.out.println("MethodFilter执行前！！！");
		chain.doFilter(request, response); // 让目标资源执行，放行
		System.out.println("MethodFilter执行后！！！");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("----过滤器初始化----");
	}

}
