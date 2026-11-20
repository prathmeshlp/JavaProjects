package com.abstraction;

public class PaymentWithCC extends Payment {

	@Override
	public void makePayment() {
		System.out.println("payment done with cc");
	}

	public static void main(String[] args) {

		Payment payment;
		System.out.println("===UPI Payment====");
		payment = new PaymentWithUPI();// paren child mix
//		PaymentWithNetBanking payment2 = new PaymentWithNetBanking(); //child class
		payment.startPayment();
		payment.makePayment();
		payment.paymentComplete();
		System.out.println("===NetBanking Payment====");
		payment = new PaymentWithNetBanking();
		payment.startPayment();
		payment.makePayment();
		payment.paymentComplete();
		System.out.println("===CC Payment====");
		payment = new PaymentWithCC();
		payment.startPayment();

		payment.makePayment();
		payment.paymentComplete();
	}
}
