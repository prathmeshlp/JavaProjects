package com.Task;

public class Product {

	int productId;
	String productName;
	double productPrice;

	public double getDiscount(int discount) {
		double finalPrice = productPrice * (discount / 100);
		return finalPrice;
	}
	
	
	public void showDetails() {
		
		System.out.println("ProductName is :"+ productName);
		System.out.println("productId is :"+ productId);
		System.out.println("ProductPrice is :"+ productPrice);
	}
	

}
