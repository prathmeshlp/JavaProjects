package com.b;
import com.a.P;

public class Q {

	
	
	public int j;
	
	public Q() {
		
		j=200;
		
	}	
	
	
	public void m2() {
		
		System.out.println("====Q class m2 method called");
		P p =new P();
		System.out.println(p.i);
		p.m1();
		
		
		
	}
	
}
