package com.calculator;

public class Calculator {

	private double lastResult;
	private int operationCount;

	public Calculator() {

		this.lastResult = 0.0;
		this.operationCount = 0;
	}

	// Helper method to update result and count
	private double updateResult(double result) {
		this.lastResult = result;
		this.operationCount++;

		return result;
	}

	// Method Overloading: Add two integers
	public double add(int a, int b) {
		return updateResult(a + b);
	}

	// Method Overloading: Add two doubles
	public double add(double a, double b) {
		return updateResult(a + b);
	}

	// Method Overloading: Add three integers
	public double add(int a, int b, int c) {
		return updateResult(a + b + c);
	}

	// Subtraction
	public double subtract(double a, double b) {
		return updateResult(a - b);
	}

	// Multiplication
	public double multiply(double a, double b) {
		return updateResult(a * b);
	}

	// Division
	public double divide(double a, double b) {

		if (b == 0) {
			throw new IllegalArgumentException("Cannot divide by zero");
		}

		return updateResult(a / b);
	}

	// Remainder
	public double remainder(int a, int b) {

		if (b == 0) {
			throw new IllegalArgumentException("Cannot divide by zero");
		}

		return updateResult(a % b);
	}

	// Power using for loop
	public double power(int base, int exponent) {

		if (exponent < 0) {
			throw new IllegalArgumentException("Exponent must be zero or more");
		}

		double result = 1;

		for (int i = 1; i <= exponent; i++) {
			result = result * base;
		}

		return updateResult(result);
	}

	// Square
	public double square(double number) {
		return updateResult(number * number);
	}

	// factorial

	public double factorial(int num) {
		if (num <= 0) {
			throw new IllegalArgumentException("Factorial is not defined for negative numbers or zero");
		}
//		   if (num > 170) {
//	            throw new IllegalArgumentException(
//	                "Number is too large for factorial"
//	            );
//	        }
		double result = 1;
		for (int i = 1; i <= num; i++) {
			result = result * i;
		}

		return updateResult(result);
	}

	public boolean isPrime(int number) {

		if (number <= 1) {
			return false;
		}

		for (int i = 2; i <= number / i; i++) {

			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}

	// Check Even or Odd
	public boolean isEven(int number) {
		return number % 2 == 0;
	}

	// Getter for last result
	public double getLastResult() {
		return lastResult;
	}

	// Getter for operation count
	public int getOperationCount() {
		return operationCount;
	}

}
