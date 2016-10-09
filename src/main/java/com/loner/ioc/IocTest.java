package com.loner.ioc;

class IocTest {

	public static void main(String[] args) throws Exception {
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		Object o = factory.getBean("plane");
//		Object o = factory.getBean("car");
		Moveable m = (Moveable) o;
		m.run();
	}

}
