package com.loner.pattern.singleton;

public class AA {

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	public String toString() {
		//toHexString()返回无符号整数参数所表示的值以十六进制（基数为16） 
		return "重写了object类的ToString()方法\n" +
		getClass().getName() + '@' + Integer.toHexString(hashCode()) +
		"\n" + super.toString() + "\n" + hashCode();
	}

}
