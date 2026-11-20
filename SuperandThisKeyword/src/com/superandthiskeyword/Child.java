package com.superandthiskeyword;

public class Child extends Parent {

	int iphone = 18;

	@Override
	public void m1() {
		System.out.println("overrided m1 method from child class");
	}

	public void m2() {
		System.out.println("child m2 method");
		System.out.println(super.iphone);
		super.m1();
	}

	public void m3() {
		System.out.println("===m3 method===");
		this.m2();
		System.out.println(this.iphone);
		// jvd takes care of this
	}

	public static void main(String[] args) {
		Child child = new Child();
		child.m2();
		child.m3();
	}
}
