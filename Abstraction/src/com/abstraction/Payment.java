package com.abstraction;

public abstract class Payment {

	public void startPayment() {
		System.out.println("payment started...");
	}

	public abstract void makePayment();

	public void paymentComplete() {
		System.out.println("payment omplete...");
	}
}
