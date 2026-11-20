package com.methodOverride;

public class Product extends Object {

	int pid;
	String pname;
	double price;

	@Override
	public String toString() {
		return pid + " " + pname + " " + price;
	}

}
