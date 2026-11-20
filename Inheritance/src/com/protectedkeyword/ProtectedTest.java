package com.protectedkeyword;

public class ProtectedTest {

	protected int pid = 200;
	protected String name = "xyz";

	protected ProtectedTest() {

		System.out.println("Protected Default Constructor");
	}

	protected void m1() {

		System.out.println("protected m1 method");
	}

//	public static void main(String[] args) {
//		ProtectedTest pt = new ProtectedTest();
//		System.out.println(pt.pid + " " + pt.name);
//		System.out.println("main method");
//	}

}
