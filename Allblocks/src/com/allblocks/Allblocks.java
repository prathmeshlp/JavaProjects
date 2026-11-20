package com.allblocks;

public class Allblocks {

	/**
	 * static block main methods block non-static or Instance Block, default
	 * constructor --> depends on object creation normal method
	 * 
	 * @a ---> annotations
	 * @author prathmesh
	 * 
	 */

	static {
		System.out.println("===static block====");
		Allblocks all = new Allblocks();
		all.m1();
	}

	public Allblocks() {

		System.out.println("===Default Constructor====");
	}

	{
		System.out.println("===non static method====");
	}

	public void m1() {
		System.out.println("====m1 method called===");
		Allblocks allblocks = new Allblocks();
	}

	public static void main(String[] args) {
		System.out.println("===main method===");
		Allblocks allblocks = new Allblocks();
		allblocks.m1();
	}

}
