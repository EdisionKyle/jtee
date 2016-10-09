package com.loner.base;

public class ChineseStu extends Student {

	private double chineseScore;

	{
		System.out.println("子类普通初始化块");
	}
	static {
		System.out.println("子类静态初始化块");
	}

	public ChineseStu() {
		System.out.println("子类构造器");
	}

	public double getChineseScore() {
		// System.out.println("name=" + name);//The field Student.name is not
		// visible
		System.out.println("age=" + age);
		return (chineseScore + score) / 2;
	}

	@Override
	public String print(String name, double score) {
		return name + "：" + score;
	}

	public void setChineseScore(double chineseScore) {
		this.chineseScore = chineseScore;
	}
	
	public static void main(String[] args) {
		ChineseStu a = new ChineseStu();
		System.out.println(a.toString());
	}

}
