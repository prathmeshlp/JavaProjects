package com.abstraction;

public class ClassY extends ClassX {

	public void m2() {
		System.out.println("implemented m2 method");
	}

	public void m3() {
		System.out.println("classY m3 method ");
	}

	public static void main(String[] args) {

//		ClassX x = new ClassX();

		ClassX x = new ClassY();// abstraction

		x.m1();
		x.m2();
		x.m3();

		System.out.println("===child class====");

		ClassY y = new ClassY();
		y.m1();
		y.m2();
		y.m3();
	}
}
