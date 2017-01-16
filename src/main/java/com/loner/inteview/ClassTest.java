package com.loner.inteview;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Class 类
 * 
 * @author pengcheng.tian
 *
 */
public class ClassTest {

	public static void main(String[] args) throws Exception {
		// 获取Class对象的3种方法
		Weather c1 = new Weather();
		Class<? extends Weather> wc = c1.getClass();
		System.out.println(wc.getName());

		Class<?> c2 = Class.forName("com.loner.inteview.Weather");
		System.out.println(c2.getName());

		Class<?> c3 = Weather.class;
		System.out.println(c3.getName());
		Weather w = (Weather) c3.newInstance();
		w.setAge(29);
		w.setName("milesloner");
		w.setAddr("深圳南山");
		System.out.println(w.toString());
		System.out.println("类加载器：" + c3.getClassLoader());

		Object o = new Weather();
		System.out.println(o instanceof Weather);
		System.out.println(o instanceof Integer);

		Class<Integer> ic = int.class;
		System.out.println("int是否为基本类型：" + ic.isPrimitive());
		// System.out.println(c3.getField("name"));

		int[] ia = new int[5];
		System.out.println("是否为数组：" + ia.getClass());
		char[] ca = new char[5];
		System.out.println("是否为数组：" + ca.getClass().getName());
		System.out.println("组件类型：" + ia.getClass().getSimpleName());
		System.out.println("组件类型：" + ia.getClass().getComponentType());
		System.out.println(void.class.getName());

		System.out.println("+++++++++++++++++++++");
		Method[] m = c3.getMethods();
		System.out.println(m);

		Field[] f = c3.getDeclaredFields();
		System.out.println("------获取声明字段------");
		for (Field ff : f) {
			System.out.println(ff.getName());
		}
	}

}
