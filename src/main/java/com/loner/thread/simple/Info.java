package com.loner.thread.simple;

class Info {

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
//	把竞争访问的资源类Foo变量x标识为private
//	同步哪些修改变量的代码，使用synchronized关键字同步方法或代码
	public synchronized void set(String name, int age) {
		if (!flag) {
			try {
				super.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		this.name = name;
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.age = age;
		flag = false;
		super.notify();
	}

	public synchronized void get() {
		if (flag) {
			try {
				super.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(this.getName() + "<===>" + this.getAge());
		flag = true;
		super.notify();
	}

	private String name = "Rollen";
	private int age = 20;
	private boolean flag = false;
}