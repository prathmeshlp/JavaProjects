package com.superandthiskeyword;

public class B extends A {

	B() {
		this(true, 90);
		System.out.println(333);
	}

	B(int i, String s, char c) {
		this();
		System.out.println(555);
	}

	B(boolean flag, int b) {

		this("abc", false, 'K');
		System.out.println(777);
	}

	B(String s, boolean b, char c) {
		super('H', 20, 10.10);
		System.out.println(111);
	}

	public static void main(String[] args) {

		B b = new B(10, "abc", 'C');

//		444
//		222
//		888
//		6666
//		111
//		777
//		333
//		555

	}
}
