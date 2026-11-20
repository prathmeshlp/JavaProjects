package com.methodoverriding;

public class Parent {

	public void m1() {
		System.out.println("parent m1 method");

	}

	public final void m2(Parent s) {
		System.out.println("parent m2 method");

	}

	public int m3() {
		System.out.println("parent m3 method");
		return 10;

	}

	public Parent m4() {
		System.out.println("parent m4 method");
		return new Parent();
	}

	void m5() {
		System.out.println("parent m5 method");

	}


	private void m6() {
		System.out.println("parent m6 method");

	}

	public static void m7() {
		System.out.println("parent static m7 method");

	}
}
