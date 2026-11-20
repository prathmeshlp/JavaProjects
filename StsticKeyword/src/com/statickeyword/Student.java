package com.statickeyword;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {

	int rNo;
	String nameString;
	static String collegeName = "DYP";

	public void m2() {
		System.out.println("===nom static method====");
		System.out.println(collegeName);
	}

	public static void dateFormatter() throws ParseException {

		String inputDate = "20260211";
		SimpleDateFormat inputFormat = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat outputFormat = new SimpleDateFormat("ddMMyyyy");

		// String: Date

		Date date = inputFormat.parse(inputDate);
		String outputDate = outputFormat.format(date);
		System.out.println("original date" + inputDate);
		System.out.println("after  convert" + outputDate);
		System.out.println(collegeName);
		Student s = new Student();

		System.out.println(s.rNo);
	}

	static {
		System.out.println("===static block===");
	}

}
