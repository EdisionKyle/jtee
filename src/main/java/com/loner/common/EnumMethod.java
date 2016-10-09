package com.loner.common;

public enum EnumMethod {

	green {
		public void color(String color) {
			System.out.println("I'm green." + color);
		}
	},
	yellow {
		public void color(String color) {
			System.out.println("I'm yellow." + color);
		}
	},
	black {
		public void color(String color) {
			System.out.println("I'm black." + color);
		}
	};

	public abstract void color(String color);

}
