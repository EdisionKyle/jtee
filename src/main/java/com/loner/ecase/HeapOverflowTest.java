package com.loner.ecase;

import java.util.ArrayList;

/**
 * 堆溢出案例
 * 
 * @author milesloner
 *
 */
public class HeapOverflowTest {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		// java.lang.OutOfMemoryError: Java heap space
		while (true) {
			list.add(new Object());
		}
	}

}
