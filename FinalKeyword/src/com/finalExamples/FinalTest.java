package com.finalExamples;

public class FinalTest {

	
	final int x; //developer
	
	
	public FinalTest() {
		x=100;
	}
	
	
	public void m1(final int i,final int j) {
		
//		i=1000;
//		j=2000;
		System.out.println(i + " " + j);
	}
	
	public static void main(String[] args) {
		
		
		FinalTest fTest1 = new FinalTest();
		fTest1.m1(100,200); 
		
		final FinalTest fTest2 = new FinalTest();
//		fTest2 = new FinalTest();
//		fTest2 = new FinalTest();
	}
	
	
}
