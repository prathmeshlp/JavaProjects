package com.practice;

public class A {

	
	B b = new B();
	
	public A() {
		System.out.println(111);
	}
	
	{
		System.out.println("Non Static Of A");
	}
	static {
		A a = new A();
		System.out.println("Static Black Of A");
	}
	
	public static void main(String[] args) {
		System.out.println("===main method===");
		
		A a = new A();
		B b = new B();
	}
}
