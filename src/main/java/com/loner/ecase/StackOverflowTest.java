package com.loner.ecase;

/**
 * 栈溢出案例；通过递归调用方法，不停地产生栈帧，一直把栈空间堆满，直到抛出异常
 * 
 * @author milesloner
 *
 */
public class StackOverflowTest {

	public static void main(String[] args) {
		// \classes>java com/loner/ecase/StackOverflowTest > D:\info.log 2> D:\err.log
		// java.lang.StackOverflowError
		new StackOverflowTest().recursive();
	}

	public void recursive() {
		recursive();
	}

}
