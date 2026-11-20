package com.atm;

public class Account {

	private int accountNo;
	private int pin;
	private double balance;
	private double withdrawnToday;
	private int lastTxnType;
	private double lastTxnAmount;
	private int depositCount;
	private int withdrawCount;

	public Account(int accountNo, int pin, double balance) {

		this.accountNo = accountNo;
		this.pin = pin;
		this.balance = balance;

		this.withdrawnToday = 0;
		this.lastTxnType = 0;
		this.lastTxnAmount = 0;
	}

	public boolean verifyPin(int enteredPin) {
		return this.pin == enteredPin;
	}

	public boolean deposit(double amount) {
		if (amount <= 0 || !Double.isFinite(amount)) {
			return false;
		}
		balance = balance + amount;

		lastTxnType = 1;
		lastTxnAmount = amount;

		depositCount++;

		return true;

	}

	public boolean withdraw(double withdrawAmount) {
		// Validate amount
		if (withdrawAmount < 0) {
			return false;
		}
		// Check multiple of 100
		if (withdrawAmount % 100 != 0) {
			return false;
		}
		// Check single withdrawal limit
		if (withdrawAmount > 10000) {
			return false;
		}
		// Check daily withdrawal limit
		if (withdrawnToday + withdrawAmount > 20000) {
			return false;
		}
		// Check minimum balance
		if (balance - withdrawnToday < 500) {
			return false;
		}
		balance = balance - withdrawAmount;

		withdrawnToday = withdrawnToday + withdrawAmount;
		lastTxnType = 2;
		lastTxnAmount = withdrawAmount;

		withdrawCount++;

		return true;
	}

	public boolean changePin(int oldPin, int newPin) {

		if (this.pin != oldPin && newPin >= 1000 && newPin <= 9999 && oldPin != newPin) {
			this.pin = newPin;
			return true;
		}
		return false;
	}

	public boolean addSimpleInterest(int years) {

		if (years <= 0) {
			return false;
		}

		double interest = balance * 4 * years / 100.0;

		balance = balance + interest;

		// Interest is treated as a credit
		lastTxnType = 1;
		lastTxnAmount = interest;
		depositCount++;

		return true;
	}

	// Show last transaction
	public void showLastTransaction() {

		switch (lastTxnType) {

		case 0:
			System.out.println("No transaction available.");
			break;

		case 1:
			System.out.println("Deposit of Rs. " + lastTxnAmount);
			break;

		case 2:
			System.out.println("Withdrawal of Rs. " + lastTxnAmount);
			break;

		default:
			System.out.println("Unknown transaction.");
		}
	}

	// Transfer money to another account
	public boolean transferTo(Account receiver, double amount) {

		if (receiver == null || receiver == this) {
			return false;
		}

		if (amount <= 0 || !Double.isFinite(amount)) {
			return false;
		}

		// Maintain minimum balance
		if (balance - amount < 500) {
			return false;
		}

		// Check receiver balance overflow
		if (!Double.isFinite(receiver.balance + amount)) {
			return false;
		}

		// Deduct from sender
		balance = balance - amount;

		// Add to receiver
		receiver.balance = receiver.balance + amount;

		// Sender transaction
		lastTxnType = 2;
		lastTxnAmount = amount;
		withdrawCount++;

		// Receiver transaction
		receiver.lastTxnType = 1;
		receiver.lastTxnAmount = amount;
		receiver.depositCount++;

		return true;
	}

	// Getters
	public double getBalance() {
		return balance;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public int getDepositCount() {
		return depositCount;
	}

	public int getWithdrawCount() {
		return withdrawCount;
	}

	public double getWithdrawnToday() {
		return withdrawnToday;
	}

}
