package com.switch_case_project;

import java.util.Scanner;

public class StudentDetails {

	Student student = new Student();
	
	public void setStudentDetails() {

		
		Scanner sc = new Scanner(System.in);

		System.out.println("Pls Enter Valid Student Name and Marks Of Subjects");

		System.out.println("Pls Enter Name:");
		student.name = sc.next();
		System.out.println("Pls Enter Math Marks:");
		student.math = sc.nextInt();
		System.out.println("Pls Enter Science Marks:");
		student.science = sc.nextInt();
		System.out.println("Pls Enter English Marks:");
		student.english = sc.nextInt();
		System.out.println("Pls Enter Physics Marks:");
		student.physics = sc.nextInt();
		System.out.println("Pls Enter Chemistry Marks:");
		student.chemistry = sc.nextInt();


	}
	
	
	float calculatePercentage() {
		
//		StudentDetails sd = new StudentDetails();
//		
//		Student student
		
		float percentage= (student.math+student.science+student.english+student.physics+student.chemistry)/500.0f*100;
		
		return percentage;
	}

	
	void showStudentDetails() {
		
		System.out.println(student.name);
		System.out.println(student.math);
		System.out.println(student.science);
		System.out.println(student.english);
		System.out.println(student.chemistry);
		System.out.println(student.physics);
		
	}
}
