package com.practice;

public class Question1 {

	public Question1() {
		System.out.println("Constructor");
	}

	{
		System.out.println("Non Static Block");
	}

	static {

		System.out.println("Static Block");
	}

	public static void main(String[] args) {
		Question1 q1 = new Question1();
		Question1 q2 = new Question1();
	}

}
