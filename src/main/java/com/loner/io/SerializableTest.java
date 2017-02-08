package com.loner.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableTest implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private transient String age;
	private String addr;

	public SerializableTest() {
		super();
	}

	public SerializableTest(String name, String age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}

	public String getAddr() {
		return addr;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "ExternalizableInfo [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}

	// 序列化对象到文件
	public static void serialize(String fileName) {
		try {
			// 创建一个对象输出流，讲对象输出到文件
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));

			SerializableTest user = new SerializableTest("万里独行", "29", "深圳宝安新安街道23区");
			out.writeObject(user); // 序列化一个会员对象

			out.close();
		} catch (Exception x) {
			System.out.println(x.toString());
		}

	}

	// 从文件反序列化到对象
	public static void deserialize(String fileName) {
		try {
			// 创建一个对象输入流，从文件读取对象
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));

			// 读取UserInfo对象并调用它的toString()方法
			SerializableTest user = (SerializableTest) (in.readObject());
			System.out.println(user.toString());

			in.close();
		} catch (Exception x) {
			System.out.println(x.toString());
		}

	}

	public static void main(String[] args) {

		serialize("D:/Resource/test.txt");
		System.out.println("序列化完毕");

		deserialize("D:/Resource/test.txt");
		System.out.println("反序列化完毕");
	}

}
