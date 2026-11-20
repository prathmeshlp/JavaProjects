package com.superandthiskeyword;

public class ClassY extends ClassX {

	public ClassY() {
		this(101);
		System.out.println("CHild Default COnstructor");
	}

	ClassY(int i) {
		this("abc", 'A');
		System.out.println("Child SInlge Param Cons");
	}

	ClassY(String s, char c) {
		super(10, 10.10);
		System.out.println("Child Two Params Const");
	}

	public static void main(String[] args) {
		ClassY y = new ClassY();

	}

}
