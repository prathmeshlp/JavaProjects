package com.c;

import com.b.Q;

public class R {

	
	public int k;
	
	
	public R() {
		k=300;
	}
	
	
	public void m3() {
		
		System.out.println("=== R class m3 method called===");
		
		Q q = new Q();
		System.out.println(q.j);
		q.m2();
		
	}
	
	
	
	
}
