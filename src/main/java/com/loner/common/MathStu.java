package com.loner.common;

import com.loner.base.Student;

public class MathStu extends Student {

	private double mathScore;

	public double getMathScore() {
		return mathScore;
	}
	
	@Override
	public String print(String name, double score) {
		return name + "：" + score;
	}



	public void setMathScore(double mathScore) {
		this.mathScore = mathScore;
	}

	@Override
	public String toString() {
//		return "MathStu [age=" + age + "mathScore=" + mathScore + "]";
//		return "MathStu [" + "mathScore=" + mathScore + "]";
		return "MathStu [addr=" + addr + "mathScore=" + mathScore + "]";
	}
	
}
