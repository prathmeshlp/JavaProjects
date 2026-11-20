package com.practice;

public class ProductNumber {

	public static void main(String[] args) {

		int num = 1234;
		int product = 1;

		while (num > 0) {

			int temp = num % 10;
			product = product * temp;
			System.out.println(temp);
			num = num / 10;

		}
		System.out.println(product);

	}

}
