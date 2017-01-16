package com.loner.inteview;

/**
 * 对象的克隆
 * 
 * @author Administrator
 *
 */
public class CloneableTest {

	public static void main(String[] args) throws Exception {
		Weather w = new Weather("tianpc", 28, "深圳南山");
		Weather w1 = w;
		System.out.println("----引用的复制,地址相同----");
		System.out.println(w);
		System.out.println(w1);
		
		Weather w2 = (Weather)w.clone();
		System.out.println(w2);
	}

}
