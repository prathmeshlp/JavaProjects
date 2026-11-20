package com.protectedkeyword;

public class Q extends P {

	@Override
	public void run() {
//		super.run();
		System.out.println("child run");
	}

	@Override
	public void walk() {
//		super.walk();
		System.out.println("child walk");
	}

	public static void main(String[] args) {
//		P p = new P();
		P p = new Q();
		p.run();
//		p.walk();
	}

}
