package com.loner.base.annotation;

import com.loner.base.annotation.FruitColor.Color;

public class Apple {

	@FruitName(value = "苹果")
	private String appleName;

	@FruitColor(fruitColor = Color.GREEN)
	private String appleColor;

	public String getAppleName() {
		return appleName;
	}

	public void setAppleName(String appleName) {
		this.appleName = appleName;
	}

	public String getAppleColor() {
		return appleColor;
	}

	public void setAppleColor(String appleColor) {
		this.appleColor = appleColor;
	}

	public void displayName() {
		System.out.println("水果的名字是：" + appleName + "；颜色是：" + appleColor);
	}

	public static void main(String[] args) {
		Apple apple = new Apple();
		apple.displayName();
	}

}
