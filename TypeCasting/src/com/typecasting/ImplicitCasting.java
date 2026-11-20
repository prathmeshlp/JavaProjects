package com.typecasting;

public class ImplicitCasting {

	public static void main(String[] args) {

		int i = 127;

		double d = i;

		System.out.println(i);
		System.out.println(d);

		long l = i;
		System.out.println(l);

		byte b = 127;
		System.out.println(b);
		
		short s = b;
		System.out.println(s);

		int j = s;
		System.out.println(j);
	}

}
