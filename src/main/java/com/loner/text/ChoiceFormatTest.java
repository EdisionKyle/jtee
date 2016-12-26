package com.loner.text;

import java.text.ChoiceFormat;

/**
 * 相当于以数字为键，字符串为值的键值对。
 * 分别使用一组double类型的数组作为键，一组String类型的数组作为值，
 * 两数组相同索引值的元素作为一对。
 * 
 * @author Administrator
 *
 */
public class ChoiceFormatTest {

	public static void main(String[] args) {
		double[] limit = { 0, 1, 3 };
		String[] format = { "hello0", "hello1", "hello3" };
		ChoiceFormat cf = new ChoiceFormat(limit, format);
		for (int i = 0; i < 4; ++i) {
			System.out.println(cf.format(i));
		}
	}

}
