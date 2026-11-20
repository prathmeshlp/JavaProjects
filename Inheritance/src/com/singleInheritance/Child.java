package com.singleInheritance;

public class Child extends Parent {

	
	int j=200;
	
	
	public void m2() {
		
		System.out.println("class y2 method");
	}
	
	
	public static void main(String[] args) {
		System.out.println("Parent ");
		
		
		Parent parent  = new Parent();
		//only parent data
		
		System.out.println(parent.i);
		
		
		System.out.println("===Child Class====");

		Child child = new Child();
		System.out.println(child.i);
		System.out.println(child.j);
		child.m1();
		child.m2();
		
		
		
		
	}
	
	
}
