package com.loner.base;

public class TestFinal {

	public static void main(String[] args) {
		Other o = new Other();
		new TestFinal().addOne(o);
	}
	
//	修改的是o的成员变量。而o的reference并没有改变。
	public void addOne(final Other o) {
		o.i++;
		System.out.println(o.i);
	}
}

class Other {
	public int i;
}
