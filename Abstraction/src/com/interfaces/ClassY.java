package com.interfaces;

public class ClassY implements InterfaceI2 {

	public static int x = 100;

	public static void main(String[] args) {
		System.out.println(x);// 100
		System.out.println(InterfaceI2.x);// 900
		System.out.println(ClassY.x);// 100
		InterfaceI2 i2 = new ClassY();
		System.out.println(i2.x);// 900
		ClassY y = new ClassY();
		System.out.println(y.x);
	}
}
