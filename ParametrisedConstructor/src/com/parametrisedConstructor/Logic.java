package com.parametrisedConstructor;

public class Logic {

	
	public Logic () {
		System.out.println("==Default Constructor===");
	}
	
	public Logic(int i) {
		System.out.println("==one param constructor==");
		System.out.println(i);
	}
	
	public Logic(String s,char c) {
		System.out.println("==Two Param Constructor==");
		System.out.println(s + " "+ c);
	}
	public Logic(int a, String s,double d) {
		System.out.println("==Three Param Constructor==");
		System.out.println(a+" "+s + " "+ d);
	}
	
	public static void main(String[] args) {
		System.out.println("Parametrised Constructor");
		
		Logic logic = new Logic();
		Logic logic2 = new Logic(300);
		Logic logic3 = new Logic("Pooja",'p');
		Logic logic4 = new Logic(300,"Laxmi",45.52);
	}
	
	
}
