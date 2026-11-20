package com.conditionalStatements;

public class IfElseLadder {

	
	public static void main(String[] args) {
		
		int num=15;
//		int num=27;
//		int num=5;
		
		
		if(num%3==0 && num%5==0) {
			System.out.println("BIZZFIZZ");
		} else if (num%3==0) {
			System.out.println("FIZZ");
		}else if (num%5==0) {
			System.out.println("BIZZ");
		} else {
			System.out.println("no is not divisible by 3 and 5 ");
		}
		
		
	}
	
	
}
