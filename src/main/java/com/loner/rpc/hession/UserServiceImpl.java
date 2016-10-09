package com.loner.rpc.hession;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.caucho.hessian.server.HessianServlet;

//public class DemoService implements DemoApi {
public class UserServiceImpl extends HessianServlet implements IUserService {

	private static final long serialVersionUID = 1L;
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String sayHello() {
		System.out.println("hello,world!");
		return "hello:" + name;
	}

	public User getUser() {
		return new User("ming", "m123");
	}

	public List<String> getLoveFruit() {
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("kiwi");
		list.add("orange");
		return list;
	}

	public Map<String, String> getBabays() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("son", "孙吴空");
		map.put("daughter", "孙小美");
		return map;
	}
}