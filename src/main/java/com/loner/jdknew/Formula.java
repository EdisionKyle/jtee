package com.loner.jdknew;

public interface Formula {

	double calculate(int a);

	// 扩展方法
	default double sqrt(int a) {
		return Math.sqrt(a);
	}

	// 扩展方法
	default double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		Formula formula = new Formula() {
			@Override
			public double calculate(int a) {
				return sqrt(a * 100);
			}
		};
		System.out.println(formula.calculate(100)); // 100.0
		System.out.println(formula.sqrt(16)); // 4.0
		System.out.println(formula.add(4.32, 9.08));
	}

}
