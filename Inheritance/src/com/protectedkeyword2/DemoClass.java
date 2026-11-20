package com.protectedkeyword2;

import com.protectedkeyword.ProtectedTest;

public class DemoClass extends ProtectedTest {

	public static void main(String[] args) {

		DemoClass demoClass = new DemoClass();
		System.out.println(demoClass.pid);
		System.out.println(demoClass.name);
		demoClass.m1();
		
		
//		ProtectedTest pt1= new DemoClass();
//		System.out.println(pt1.pid);
//		System.out.println(pt1.name);
//		
		
	}

}
