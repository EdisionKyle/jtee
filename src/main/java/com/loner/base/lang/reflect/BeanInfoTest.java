package com.loner.base.lang.reflect;

import org.apache.commons.beanutils.PropertyUtils;

/**
 * 自省测试
 * 
 * @author pengcheng.tian
 *
 */
public class BeanInfoTest {

	public static void main(String[] args) {
		UserInfo userInfo = new UserInfo();
		userInfo.setUserName("peida");
		try {
			System.out.println(PropertyUtils.getProperty(userInfo, "userName"));
			BeanInfoUtil.getPropertyByIntrospector(userInfo, "userName");
			BeanInfoUtil.setPropertyByIntrospector(userInfo, "userName", "萬里獨行-milesloner520");
			BeanInfoUtil.getPropertyByIntrospector(userInfo, "userName");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/*public static void main(String[] args) {
		UserInfo userInfo = new UserInfo();
		try {
			BeanUtils.setProperty(userInfo, "userName", "peida");

			System.out.println("set userName:" + userInfo.getUserName());

			System.out.println("get userName:" + BeanUtils.getProperty(userInfo, "userName"));

			BeanUtils.setProperty(userInfo, "age", 18);
			System.out.println("set age:" + userInfo.getAge());

			System.out.println("get age:" + BeanUtils.getProperty(userInfo, "age"));

			System.out.println("get userName type:" + BeanUtils.getProperty(userInfo, "userName").getClass().getName());
			System.out.println("get age type:" + BeanUtils.getProperty(userInfo, "age").getClass().getName());

			PropertyUtils.setProperty(userInfo, "age", 8);
			System.out.println(PropertyUtils.getProperty(userInfo, "age"));

			System.out.println(PropertyUtils.getProperty(userInfo, "age").getClass().getName());

			PropertyUtils.setProperty(userInfo, "age", "8");
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}*/

}
