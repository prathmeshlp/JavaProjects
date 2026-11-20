package com.abstraction;

public class PaymentWithUPI extends Payment {

	@Override
	public void makePayment() {
		System.out.println("payment done with UPI");
	}
}
