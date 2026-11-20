package com.methodoverloading;

public class Bank {

	void createAccount(long adharNumber) {
		System.out.println("Saving account");
	}

	void createAccount(String GSTIN) {
		System.out.println("Current account created");

	}

	void createAccount(String panNumber, long adharNumber, long p2adharNumber) {
		System.out.println("Joint account created");
	}
	
	void m1(byte b1){
		System.out.println("m1 method for byte");
	}
	void m1(short b1){
		System.out.println("m1 method for short");
	}
	void m1(int b1){
		System.out.println("m1 method for int");
	}
	void m1(long b1){
		System.out.println("m1 method for long");
	}
	void m1(float b1){
		System.out.println("m1 method for float");
	}
	void m1(double b1){
		System.out.println("m1 method for double");
	}
	void m1(char b1){
		System.out.println("m1 method for char");
	}
	void m1(boolean b1){
		System.out.println("m1 method for boolean");
	}
}
