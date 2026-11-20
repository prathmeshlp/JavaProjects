package com.superandthiskeyword;

public class ClassX extends Object{

	
	public ClassX()
	{
		super();
		System.out.println("Parent Default Constructor");
	}
	
	public ClassX(int i,double d) {
		this();
		System.out.println("Parent Double Param Constructor");
	}
	
}
