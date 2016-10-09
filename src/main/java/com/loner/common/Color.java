package com.loner.common;

public enum Color implements Behaviour {

	RED("red", 1), GREEN("green", 2), BLUE("blue", 3);
	private String name;
	private int index;

	private Color(String name, int index) {
		this.name = name;
		this.index = index;
	}

	public static String getName(int index) {
		for (Color color : Color.values()) {
			if (color.index == index)
				return color.name;
		}
		return null;
	}

	public String toString() {
		return this.index + ":" + this.name;
	}

	public String getInfo() {
		return this.name;
	}

	@Override
	public void print() {
		System.out.println("Hello...");
	}

}
