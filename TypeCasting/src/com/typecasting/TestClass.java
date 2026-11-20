package com.typecasting;

public class TestClass {

	public P testMethod() {

//		P p = new P();
//		Q q = new Q();
		R r = new R();
//		return p;
//		return q;
		return r;
	}

	public static void main(String[] args) {

		TestClass tc = new TestClass();
		P p = tc.testMethod();
		System.out.println(p.i);
		p.m1();

		Q q = (Q) tc.testMethod();// P1
		System.out.println(q.i);
		System.out.println(q.j);
		q.m1();
		q.m2();

		R r = (R) tc.testMethod();
		// P+Q+R
		System.out.println(r.i);
		System.out.println(r.j);
		System.out.println(r.k);
		r.m1();
		r.m2();
		r.m3();
	}
}
