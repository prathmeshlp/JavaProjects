package com.methodOverride;

public class Child extends Parent {

	int i = 200;

	@Override
	public void m1() {

		System.out.println("override m1 method of parent  in child class");
	}

	public void m3() {
		System.out.println("child m3 method");
	}

	public static void main(String[] args) {

		// Inheritance
		// We can make 3 types of objects

		System.out.println("===Parent Classs===");
		Parent parent = new Parent();
		// only parent data
		parent.m1();
		parent.m2();

		System.out.println("===Parent Child Mix Object");
		Parent p1 = new Child();
		p1.m1();
		p1.m2();
		System.out.println(p1.i);
		
		
		System.out.println("===Child Class===");
		Child child = new Child();
		//parent + override  + child
		child.m1();
		child.m2();
		child.m3();
		System.out.println(child.i);

	}

}
