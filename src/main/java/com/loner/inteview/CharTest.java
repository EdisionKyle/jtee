package com.loner.inteview;

public class CharTest {

	public static void main(String[] args) {
		byte b = 12;
		System.out.println((double)b);
		char c = '1';
		System.out.println(c);
		Character ch = new Character('c');
		System.out.println(Character.toUpperCase(ch));
		System.out.println(Character.isLetter(ch));
		System.out.println(Character.isDigit(ch));
		
		char d = '\u9876';
		System.out.println(d);
	}

}
