package com.loner.io;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ExternalizableInfo implements Externalizable {

	private String name;
	private String age;
	private String addr;

	public ExternalizableInfo() {
		super();
	}

	public ExternalizableInfo(String name, String age, String addr) {
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
		return "ExternalizableInfo [name=" + name + ", age=" + age + ", addr="
				+ addr + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("现在执行序列化方法");
		// 可以在序列化时写非自身的变量
		Date d = new Date();
		out.writeObject(d);
		// 只序列化userName,userPass变量
		out.writeObject(name);
		out.writeObject(addr);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		System.out.println("现在执行反序列化方法");
		Date d = (Date) in.readObject();
		System.out.println(d);
		this.name = (String) in.readObject();
		this.addr = (String) in.readObject();
	}

	// 序列化对象到文件
	public static void serialize(String fileName) {
		try {
			// 创建一个对象输出流，讲对象输出到文件
			ObjectOutputStream out = new ObjectOutputStream(
					new FileOutputStream(fileName));

			ExternalizableInfo user = new ExternalizableInfo("万里独行", "29",
					"深圳宝安新安街道23区");
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
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(
					fileName));

			// 读取UserInfo对象并调用它的toString()方法
			ExternalizableInfo user = (ExternalizableInfo) (in.readObject());
			System.out.println(user.toString());

			in.close();
		} catch (Exception x) {
			System.out.println(x.toString());
		}

	}

	public static void main(String[] args) {

		serialize("D:\\logs\\test.txt");
		System.out.println("序列化完毕");

		deserialize("D:\\logs\\test.txt");
		System.out.println("反序列化完毕");
	}

}
