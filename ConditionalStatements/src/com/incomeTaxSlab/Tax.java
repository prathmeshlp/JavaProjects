package com.incomeTaxSlab;

import java.util.Scanner;

public class Tax {

	public void calculatetax() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your salary :");

		double salary = sc.nextDouble();

		if (salary > 0 && salary <= 400000) {
			System.out.println("No Tax");
		} else if (salary > 40000 && salary <= 800000) {
			double tax = (salary - 400000) * 0.05;
			System.out.println("You have to pay" + " " + tax);
		}else if (salary > 800000 && salary <= 1200000) {
		double tax = (salary - 800000) * 0.10 + 20000;
		System.out.println("You have to pay" + " " + tax);
			
		}else if (salary >1200000 & salary <=1800000) {
			double tax = (salary - 1200000) * 0.15 + 60000;
			System.out.println("You have to pay" + " " + tax);
		}
		else if (salary > 1800000 && salary<=2500000) {
			double tax = (salary - 1800000) * 0.20 + 150000;
			System.out.println("You have to pay" + " " + tax);
			
		} else {
			double tax = (salary - 2500000) * 0.30 + 750000;
			System.out.println("You have to pay" + " " + tax);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tax tax = new Tax();
		tax.calculatetax();
	}

}
