package com.typecasting;

public class ExplicitCasting {

	public static void main(String[] args) {

		double d = 126.78;

		int i = (int) d;

		System.out.println(d);
		System.out.println(i);

		short s = (short) i;
		byte b = (byte) s;

		char c = 'A';
		int k = c;
		System.out.println(k);

		int l = 97;

		char c1 = (char) l;
		System.out.println(c1);
	}
}
