package com.loner.base;

import com.loner.common.MathStu;

public class StudentTest {

	public static void main(String[] args) {
		/*Student stu = new Student();
		stu.addr = "深圳市宝安区新安街道";
		stu.setName("张梦华");
		stu.setAge(29);
		stu.setScore(89.09);
		System.out.println(stu.toString());*/
		
		MathStu math = new MathStu();
		math.setAddr("北京市朝阳区互联网金融大厦");
		math.setAge(84);
		System.out.println(math.toString());
		
		ChineseStu chinese = new ChineseStu();
		chinese.setAge(32);
		chinese.setChineseScore(89);
		System.out.println(chinese.getChineseScore());
		System.out.println(chinese.toString());
		
		System.out.println(97.2345325989298500001+.98792379840876);
		System.out.println(new StrictfpTest().sum());
	}

}
