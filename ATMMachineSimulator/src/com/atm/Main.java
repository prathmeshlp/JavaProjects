package com.atm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Creating two account objects
		Account account1 = new Account(101, 1234, 20000);
		Account account2 = new Account(102, 5678, 15000);

		Account activeAccount = null;
		Account receiverAccount = null;
		// ================= LOGIN =================

		System.out.println("===== WELCOME TO ATM =====");

		for (int i = 1; i <= 3; i++) {

			System.out.println("Enter your 4-digit PIN: ");
			int enteredPin = scanner.nextInt();

			if (account1.verifyPin(enteredPin)) {

				activeAccount = account1;
				receiverAccount = account2;
				break;

			} else if (account2.verifyPin(enteredPin)) {

				activeAccount = account2;
				receiverAccount = account1;
				break;

			} else {

				System.out.println("Incorrect PIN!");

				System.out.println("Attempts remaining: " + (3 - i));
			}
		}

		// Check login status
		if (activeAccount == null) {

			System.out.println("Card blocked. Too many incorrect attempts.");

			scanner.close();
			return;
		}

		System.out.println("\nLogin successful!");

		System.out.println("Welcome! Account Number: " + activeAccount.getAccountNo());

		while (true) {
			System.out.println("\n===== ATM MACHINE =====");

			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Change PIN");
			System.out.println("5. Last Transaction");
			System.out.println("6. Transaction Counts");
			System.out.println("7. Transfer Money");
			System.out.println("8. Add Simple Interest (4%)");
			System.out.println("0. Logout and Exit");
			System.out.println("=======================");
			System.out.println("Enter your choice:");
			int choice = scanner.nextInt();

			switch (choice) {

			// Check Balance
			case 1: {

				System.out.println("Available Balance: Rs. " + activeAccount.getBalance());

				break;
			}

			// Deposit
			case 2: {
				System.out.println("Enter deposit amount:");
				double amount = scanner.nextDouble();

				if (activeAccount.deposit(amount)) {

					System.out.println("Deposit successful!");

					System.out.println("Updated Balance: Rs. " + activeAccount.getBalance());

				} else {

					System.out.println("Deposit failed! Amount must be greater than zero.");
				}

				break;
			}

			// Withdraw
			case 3: {

				System.out.println("Enter withdraw amount:");
				double amount = scanner.nextDouble();

				if (activeAccount.withdraw(amount)) {

					System.out.println("Please collect your cash.");

					System.out.println("Remaining Balance: Rs. " + activeAccount.getBalance());

				} else {

					System.out.println("Withdrawal failed! Check withdrawal rules.");
				}

				break;
			}

			// Change PIN
			case 4: {
				System.out.println("Enter old PIN: ");
				int oldPin = scanner.nextInt();
				System.out.println("Enter New PIN: ");
				int newPin = scanner.nextInt();

				if (activeAccount.changePin(oldPin, newPin)) {

					System.out.println("PIN changed successfully!");

				} else {

					System.out.println("PIN change failed! Check your old and new PIN.");
				}

				break;
			}

			// Last Transaction
			case 5: {

				activeAccount.showLastTransaction();

				break;
			}

			// Transaction Counts
			case 6: {

				System.out.println("Total Deposits: " + activeAccount.getDepositCount());

				System.out.println("Total Withdrawals: " + activeAccount.getWithdrawCount());

				System.out.println("Total Cash Withdrawn Today: Rs. " + activeAccount.getWithdrawnToday());

				break;
			}

			// Transfer Money
			case 7: {

				System.out.println("Receiver Account: " + receiverAccount.getAccountNo());

				System.out.println("Enter transfer amount:");
				double amount = scanner.nextInt();

				if (activeAccount.transferTo(receiverAccount, amount)) {

					System.out.println("Transfer successful!");

					System.out.println("Your Balance: Rs. " + activeAccount.getBalance());

				} else {

					System.out.println("Transfer failed! Check amount and available balance.");
				}

				break;
			}

			// Simple Interest
			case 8: {
				System.out.println("Enter number of years: ");
				int years = scanner.nextInt();

				if (activeAccount.addSimpleInterest(years)) {

					System.out.println("Interest added successfully!");

					System.out.println("Updated Balance: Rs. " + activeAccount.getBalance());

				} else {

					System.out.println("Invalid number of years!");
				}

				break;
			}

			// Exit
			case 0: {

				System.out.println("Thank you for using our ATM.");

				System.out.println("Please collect your card.");

				scanner.close();
				return;
			}

			default: {

				System.out.println("Invalid choice!");

			}
			}

		}

	}
}
