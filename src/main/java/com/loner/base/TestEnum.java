package com.loner.base;

public class TestEnum {
	/* 最普通的枚举 */
	public enum ColorSelect {
		red, green, yellow, blue;
	}

	/* 枚举也可以象一般的类一样添加方法和属性,你可以为它添加静态和非静态的属性或方法,这一切都象你在一般的类中做的那样. */
	public enum Season {
		// 枚举列表必须写在最前面，否则编译出错
		winter, spring, summer, fall;

		private final static String location = "Phoenix";

		public static Season getBest() {
			if (location.equals("Phoenix"))
				return winter;
			else
				return summer;
		}
	}

	public static void main(String[] args) {
        /*
         * 枚举类型是一种类型，用于定义变量，以限制变量的赋值 赋值时通过"枚举名.值"来取得相关枚举中的值
         */
        ColorSelect m = ColorSelect.blue;
        switch (m) {
        /*注意:枚举重写了ToString(),说以枚举变量的值是不带前缀的
          *所以为blue而非ColorSelect.blue
          */
        case red:
            System.out.println("color is red");
            break;
        case green:
            System.out.println("color is green");
            break;
        case yellow:
            System.out.println("color is yellow");
            break;
        case blue:
            System.out.println("color is blue");
            break;
        }
        System.out.println("\n遍历ColorSelect中的值:");
        /*通过values()获得枚举值的数组*/
        for (ColorSelect c : ColorSelect.values()) {
            System.out.println(c);
        }
	System.out.println("\n枚举ColorSelect中的值有："+ColorSelect.values().length+"个");

	System.out.println(ColorSelect.red.ordinal());//0
	System.out.println(ColorSelect.green.ordinal());//1
	System.out.println(ColorSelect.yellow.ordinal());//2
	System.out.println(ColorSelect.blue.ordinal());//3

	System.out.println("\n" + ColorSelect.red.compareTo(ColorSelect.green));

	System.out.println("\n" +Season.getBest());

    }
}