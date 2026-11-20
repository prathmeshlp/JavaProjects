package com.protectedkeyword;

public class MainClass {

	public static void main(String[] args) {

		ProtectedTest pTest = new ProtectedTest();
		System.out.println(pTest.pid);
		System.out.println(pTest.name);
		pTest.m1();

	}

}
