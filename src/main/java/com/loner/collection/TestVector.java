package com.loner.collection;

import java.util.Vector;

public class TestVector {
	public static void main(String[] args) {
		Vector<Object> v1 = new Vector<Object>();
		Integer integer1 = new Integer(1);
		v1.addElement("one");
		// 加入的为字符串对象
		v1.addElement(integer1);
		v1.addElement(integer1);
		// 加入的为Integer的对象
		v1.addElement("two");
		v1.addElement(new Integer(2));
		v1.addElement(integer1);
		v1.addElement(integer1);
		System.out.println("The vector v1 is:\n\t" + v1);
		// 将v1转换成字符串并打印
		v1.insertElementAt("three", 2);
		v1.insertElementAt(new Float(3.9), 3);
		System.out
				.println("The vector v1(used method insertElementAt()) is:\n\t "
						+ v1);
		// 往指定位置插入新的对象，指定位置后的对象依次往后顺延
		v1.setElementAt("four", 2);
		System.out.println("The vector v1(used method setElementAt()) is:\n\t "
				+ v1);
		// 将指定位置的对象设置为新的对象

		v1.removeElement(integer1);
		// 使用枚举类(Enumeration)的方法来获取向量对象的每个元素
		System.out.println("The position of object 1(top-to-bottom):"
				+ v1.indexOf(integer1));
		System.out.println("The position of object 1(tottom-to-top):"
				+ v1.lastIndexOf(integer1));
		// 按不同的方向查找对象integer1所处的位置
		v1.setSize(4);
		System.out.println("The new vector(resized the vector)is:" + v1);
		// 重新设置v1的大小，多余的元素被行弃
	}
}
