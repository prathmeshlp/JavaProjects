package com.datatypes;

public class Datatypes {

	byte b = 127; // Range: -128 to 127. Uses 1 byte of memory.
	byte byte1;
	byte b1 = 100;
	short s = 123;
	short sh;
	int i = 33000;
	int integer;
	int i1 = 100;

	// Number 12digit > 10 digit
	// CC DC aadhar card, vvip, int, ivr, account
	long l = 999999999;// 8 byte = 64 bit //
	long l1;

	// -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

	// floating
	// float < double
	float f = 123.4532f;// 0.0 // 4byte = 32 bit // 100.0 // after decimal upto 6 to 7
	float f1;
	double d = 3456.7893; // 0.0 // 8 byte = 64 bit // after decimal upto 15 decimal
	double d1;
	boolean flag = true; // 1bit // false
	boolean checDefaultBooleanValue;

	// character
	char c = 'A'; // \u0000 // 2 byte = 16 bit
	char ch;

	String name = "Pratik";
	String name2;

	// Use Case Examples
	byte age;
	short year;
	int marks;
	long population;
	boolean isLoggedIn;
	String message;

	public Datatypes() {
		age = 25;
		year = 2026;
		marks = 95;
		population = 8000000000L;
		isLoggedIn = true;
		message = "Welcome to Java!";
	}

	public void m1() {

		System.out.println("m1 method local variables");
		byte b = 127; // 1byte = 8 bit // -128 to 127 // 0 // 100%
		short s = 123; // 2 byte = 16 bit // -32,768 to 32,767 // 0
		// Number : int : Java
		int i = 33000; // 4 byte = 32 bit -2,147,483,648 to 2,147,483,647 // 0 // 100
		// Number 12digit > 10 digit
		// CC DC aadhar card, vvip, int, ivr, account
		long l = 99999999; // 8 byte = 64 bit
		// -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		// floating
		// float < double
		float f = 123.4532f; // 0.0 // 4byte = 32 bit // 100.0 // after decimal upto 6 to 7
		double d = 3456.7893; // 0.0 // 8 byte = 64 bit // after decimal upto 15 decimal
		boolean flag = true; // 1bit // false
		// character
		char c = 'A'; // \u0000 // 2 byte = 16 bit
		String name = "Pratik";

		System.out.println("local variable" + " " + b);
	}

	public void m2() {
		Datatypes dt = new Datatypes();
//		byte age;
//		short year;
//		int marks;
//		long population;
//		boolean isLoggedIn;
//		String message;
		System.out.println(dt.age);
		System.out.println(dt.year);
		System.out.println(dt.marks);
		System.out.println(dt.population);
		System.out.println(dt.isLoggedIn);
		System.out.println(dt.message);
	}

	public static void main(String[] args) {
		Datatypes d = new Datatypes();

		System.out.println(d.b);
		System.out.println(d.b1);
		System.out.println(d.s);
		System.out.println(d.i);
		System.out.println(d.i1);
		System.out.println(d.f);
		System.out.println(d.d);
		System.out.println(d.flag);
		System.out.println(d.c);
		System.out.println(d.name);

		// Default values
		System.out.println("Default Value" + d.byte1);
		System.out.println("Default Value" + d.sh);
		System.out.println("Default Value" + d.integer);
		System.out.println("Default Value" + d.l1);
		System.out.println("Default Value" + d.f1);
		System.out.println("Default Value" + d.d1);
		System.out.println("Default Value" + d.checDefaultBooleanValue);
		System.out.println("Default Value" + d.ch);
		System.out.println("Default Value" + d.name2);

		d.m1();
		d.m2();
	}

}