package com.superandthiskeyword;

public class A {
	A() {
		this(10, 20, 30);
		System.out.println(888);
	}

	A(int i, int j, int k) {
		this("abc", 'G');
		System.out.println(222);
	}

	A(String s, char c) {

		System.out.println(444);
	}

	A(char c, int b, double d) {
		this();
		System.out.println(6666);

	}
}
