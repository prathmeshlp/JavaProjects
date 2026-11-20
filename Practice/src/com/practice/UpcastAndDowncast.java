package com.practice;

public class UpcastAndDowncast {

	public static void main(String[] args) {
		Child c1 = new Child();
		c1.parentMethod();

		// Step 2: Upcasting
		Parent p1 = c1;

		p1.parentMethod();

		// Step 3: Downcasting
		Child c2 = (Child) p1;

		c2.parentMethod();

		c2.childMethod();
	}
}
