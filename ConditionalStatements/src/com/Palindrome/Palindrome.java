package com.Palindrome;

public class Palindrome {

	public static void main(String[] args) {

		int num = 12321;
		int num2 = num;
		int reverseNum = 0;

		System.out.println(num);
		System.out.println(num2);
		
		
		while (num > 0) {

			int temp = num % 10;
			reverseNum = reverseNum * 10 + temp;
			num = num / 10;

		}

		System.out.println(num2 == reverseNum);

	}

}
