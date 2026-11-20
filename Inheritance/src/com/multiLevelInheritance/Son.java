package com.multiLevelInheritance;

public class Son extends Father {

	
	int k=3;
	
	
	public void m3() {
		System.out.println("===m3 method from Son class");
//		System.out.println(i);
//		System.out.println(j);
//		System.out.println(k);
	}
	
	public static void main(String[] args) {
		Son son = new Son();
		System.out.println(son.i);
		System.out.println(son.j);
		System.out.println(son.k);
		son.m1();
		son.m2();
		son.m3();
	}
	
	
}
