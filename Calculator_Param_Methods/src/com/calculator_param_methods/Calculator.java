package com.calculator_param_methods;

import java.util.Scanner;

public class Calculator {

	public int add(int a, int b) {

		int add = a + b;
		return add;
	}

	public int subtract(int a, int b) {

		int sub = a - b;
		return sub;

	}

	public int multiplication(int num1, int num2) {

		int mul = num1 * num2;
		return mul;
	}

	public int division(int num1, int num2) {

		int div = num1 / num2;
		return div;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Calculator calculator = new Calculator();
		System.out.println("Pls enter first param for addithion ");
		int a = sc.nextInt();
		System.out.println("Pls enter second param for addithion ");
		int b = sc.nextInt();
		int addition = calculator.add(a, b);
		System.out.println("addition is " + addition);

		System.out.println("Pls enter first param for Subtraction");
		int c = sc.nextInt();
		System.out.println("Pls enter second param for Subtraction ");
		int d = sc.nextInt();
		int substraction = calculator.subtract(c, d);
		System.out.println("substraction is" + substraction);

		System.out.println("Pls enter first param for Multiplicaton");
		int e = sc.nextInt();
		System.out.println("Pls enter second param for Multiplicaton ");
		int f = sc.nextInt();
		int mul = calculator.multiplication(e, f);
		System.out.println("multiplication is" + mul);

		System.out.println("Pls enter first param for Division");
		int g = sc.nextInt();
		System.out.println("Pls enter second param for Multiplicaton ");
		int h = sc.nextInt();
		int division = calculator.multiplication(g, h);
		System.out.println("division is" + division);

	}

}
