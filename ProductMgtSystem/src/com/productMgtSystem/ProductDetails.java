package com.productMgtSystem;

public class ProductDetails {

	public Product addProduct() {

		Product product = new Product();
		product.pid = 101;
		product.pname = "Iphone";
		product.price = 10125.12;
		return product;

	}

	public Order addOrder() {

		Order order = new Order();
		order.oid = 102;
		order.name = "#123";
		order.address = "Pune";
		return order;

	}

	public Customer addCustomer() {

		Customer customer = new Customer();
		customer.cid = 120;
		customer.cname = "Sushant";
		customer.contact = 860019679;
		return customer;
	}

}
