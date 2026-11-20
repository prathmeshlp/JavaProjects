package com.statickeyword;

public class StaticExample {

	static {
		System.out.println("===static block===");
		i = 500;
	}

	static int i = m1();

	private static int m1() {
		System.out.println("=====m1 method===");
		return 100;
	}

	public static void main(String[] args) {
		System.out.println("===main method====");
		System.out.println(i);
	}

}
