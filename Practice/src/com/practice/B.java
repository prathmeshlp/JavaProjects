package com.practice;

public class B {

	public B() {
		System.out.println(222);
	}

	{
		System.out.println("Non Static Of B");
	}

	static {
		System.out.println("Static Of B");
	}
}
