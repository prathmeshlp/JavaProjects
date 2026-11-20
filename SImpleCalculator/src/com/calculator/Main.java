
package com.calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Calculator calculator = new Calculator();

		int choice;

		while (true) {

			System.out.println("\n===== SIMPLE CALCULATOR =====");
			System.out.println("1. Add two numbers");
			System.out.println("2. Add three numbers");
			System.out.println("3. Subtract");
			System.out.println("4. Multiply");
			System.out.println("5. Divide");
			System.out.println("6. Remainder");
			System.out.println("7. Power");
			System.out.println("8. Square");
			System.out.println("9. Show last result and operation count");
            System.out.println("\n--- EXTENSIONS ---");

            System.out.println("10. Factorial");
            System.out.println("11. Check Even or Odd");
            System.out.println("12. Check Prime Number");
            System.out.println("13. Add using Last Result (Memory)");
            System.out.println("0. Exit");


			System.out.print("\nEnter your choice: ");
			choice = sc.nextInt();

			try {

				switch (choice) {

				case 1: {
					System.out.print("Enter first number: ");
					double a = sc.nextDouble();

					System.out.print("Enter second number: ");
					double b = sc.nextDouble();

					System.out.println("Result: " + calculator.add(a, b));
					break;
				}

				case 2: {
					System.out.print("Enter first number: ");
					int a = sc.nextInt();

					System.out.print("Enter second number: ");
					int b = sc.nextInt();

					System.out.print("Enter third number: ");
					int c = sc.nextInt();

					System.out.println("Result: " + calculator.add(a, b, c));
					break;
				}

				case 3: {
					System.out.print("Enter first number: ");
					double a = sc.nextDouble();

					System.out.print("Enter second number: ");
					double b = sc.nextDouble();

					System.out.println("Result: " + calculator.subtract(a, b));
					break;
				}

				case 4: {
					System.out.print("Enter first number: ");
					double a = sc.nextDouble();

					System.out.print("Enter second number: ");
					double b = sc.nextDouble();

					System.out.println("Result: " + calculator.multiply(a, b));
					break;
				}

				case 5: {
					System.out.print("Enter first number: ");
					double a = sc.nextDouble();

					System.out.print("Enter second number: ");
					double b = sc.nextDouble();

					System.out.println("Result: " + calculator.divide(a, b));
					break;
				}

				case 6: {
					System.out.print("Enter first whole number: ");
					int a = sc.nextInt();

					System.out.print("Enter second whole number: ");
					int b = sc.nextInt();

					System.out.println("Result: " + calculator.remainder(a, b));
					break;
				}

				case 7: {
					System.out.print("Enter base: ");
					int base = sc.nextInt();

					System.out.print("Enter exponent: ");
					int exponent = sc.nextInt();

					System.out.println("Result: " + calculator.power(base, exponent));
					break;
				}

				case 8: {
					System.out.print("Enter a number: ");
					double number = sc.nextDouble();

					System.out.println("Result: " + calculator.square(number));
					break;
				}

				case 9: {
					System.out.println("Last Result: " + calculator.getLastResult());

					System.out.println("Operation Count: " + calculator.getOperationCount());
					break;
				}
				   // Extension 1: Factorial
                case 10: {
                	System.out.print("Enter a number: ");
                    int number = sc.nextInt();

                    System.out.println("Factorial: " + calculator.factorial(number));
                    break;
                }
                // Extension 2: Even or Odd
                case 11: {
                	System.out.print("Enter a number: ");
                    int number = sc.nextInt();

                    if (calculator.isEven(number)) {
                        System.out.println(number + " is Even");
                    } else {
                        System.out.println(number + " is Odd");
                    }

                    break;
                }
                // Extension 3: Prime Number
                case 12: {
                	System.out.print("Enter a number: ");
                    int number = sc.nextInt();

                    if (calculator.isPrime(number)) {
                        System.out.println(number + " is a Prime Number");
                    } else {
                        System.out.println(number + " is not a Prime Number");
                    }

                    break;
                }
                // Extension 4: Memory Feature
                case 13: {
                    double lastResult = calculator.getLastResult();

                    System.out.println("Last Result: " + lastResult);
                    System.out.print("Enter another number: ");
                    double number =  sc.nextInt();

                    System.out.println(
                        "Result: " + calculator.add(lastResult, number)
                    );

                    break;
                }



				case 0: {
					System.out.println("Thank you for using Calculator!");
					sc.close();
					return;
				}

				default: {
					System.out.println("Invalid choice");
				}
				}

			} catch (IllegalArgumentException e) {

				System.out.println("Error: " + e.getMessage());

			}
		}
	}
}
