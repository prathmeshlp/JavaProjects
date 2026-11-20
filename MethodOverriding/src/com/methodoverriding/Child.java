package com.methodoverriding;

public class Child extends Parent {

	@Override
	public void m1() {
		System.out.println("override m1 method child");
	}

//	public void m2(Parent p) {
//		
//	}

	public int m3() {
		return 90;
	}

	@Override
	public Parent m4() {
		return new Child();
	}

	@Override
	void m5() {
		System.out.println("override m5 method in child");
	}

	public static void m7() {
		System.out.println("child m7 static method");
	}

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.m1();
//		parent.m2();
		parent.m3();
		parent.m4();
		parent.m5();
//		parent.m6();
		parent.m7();

		Parent.m7();
		Child.m7();
	}

}
