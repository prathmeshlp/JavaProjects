package com.productMgtSystem;

public class ProductAdmin {

	
	public static void main(String[] args) {
		ProductDetails productDetails = new ProductDetails();
		
		Product product = productDetails.addProduct();
		System.out.println(product);//printed using toString method
//		System.out.println(product.pid);
//		System.out.println(product.pname);
//		System.out.println(product.price);

		Customer customer = productDetails.addCustomer();
		System.out.println(customer);//printed using toString method
//		System.out.println(customer.cid);
//		System.out.println(customer.cname);
		
		Order order = productDetails.addOrder();
		System.out.println(order);//printed using toString method
//		System.out.println(order.oid);
//		System.out.println(order.name);
//		System.out.println(order.address);
	}
}
