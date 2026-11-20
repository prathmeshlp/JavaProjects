package com.dataset;

public class ProductDetails {

	
	
	public static void main(String[] args) {
		
		Product product = new Product();
		product.pid=123;
		product.pname = "WaterBottle";
		product.order.oid=24;
		product.order.name="xyz";
		
		product.order.customer.cid=89;
		product.order.customer.name="Akshay";
		product.order.customer.address="PCMC";
		
		
		System.out.println(product.pid + " " + product.pname + " " + product.order.oid + "  "+ product.order.name+" " + product.order.customer.cid+" "+product.order.customer.name+" "+product.order.customer.address);
		
	}
}
