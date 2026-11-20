package com.methodOverride;

public class MainClasss {

	public static void main(String[] args) {

		Product product = new Product();

		product.pid = 33;
		product.pname = "bike";
		product.price = 85624.20;

		System.out.println(product.toString());

	}

}
