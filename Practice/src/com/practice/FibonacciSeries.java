package com.practice;

import java.util.Scanner;

public class FibonacciSeries {

	int num;
	int a = 0;
	int b = 1;
	int c = 0;

	public void getFibonnaciiSeries() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please Enter Any Number");
		int num = scanner.nextInt();

		for (int i = 0; i <= num; i++) {
			System.out.println(a);

			c = a + b;
			a = b;
			b = c;

		}

	}

	public static void main(String[] args) {
		FibonacciSeries fSeries = new FibonacciSeries();
		fSeries.getFibonnaciiSeries();
	}

}
