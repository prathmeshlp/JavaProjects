package com.debugging;

public class Demo {

	int i = 10;
	int j;

	public Demo m1() {
		Demo demo = new Demo();
		demo.i = 100;
		demo.j = 200;
		demo.i = 1000;
		Demo demo2 = new Demo();
		demo2.i = 77;
		return demo2;
	}

	public static void main(String[] args) {
		Demo demo3 = new Demo();
		System.out.println(demo3.i + " " + demo3.j);

		Demo demo4 = demo3.m1();
		System.out.println(demo4.i + " " + demo4.j);
	}

}
