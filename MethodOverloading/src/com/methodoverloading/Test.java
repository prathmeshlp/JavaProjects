package com.methodoverloading;

public class Test {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.createAccount(102020212021l);
		bank.createAccount("GSTIN02104");
		bank.createAccount("PAncaRd", 50212021425l, 45215245658l);
		bank.m1((byte)1);
		bank.m1((short)127);
		bank.m1(101);
		bank.m1(5656252542452l);
		bank.m1(120.25f);
		bank.m1(120.25);
		bank.m1('A');
		bank.m1(true);
	}
}
