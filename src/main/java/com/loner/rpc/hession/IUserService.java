package com.loner.rpc.hession;

import java.util.List;
import java.util.Map;

public interface IUserService {

	public void setName(String name);

	public String sayHello();

	public User getUser();

	public List<String> getLoveFruit();

	public Map<String, String> getBabays();

}