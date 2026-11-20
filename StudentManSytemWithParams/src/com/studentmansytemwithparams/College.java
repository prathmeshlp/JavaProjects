package com.studentmansytemwithparams;

public class College {
	University u = new University();
	
	public void addStudent( ) {
		Student s = new Student();
		s.rollNo=101;
		s.name="Ramesh";
		s.address="Pune";
		System.out.println("Single Student Details");
		u.displayStudent(s);
		
 	}
	
	public void addAllStudent() {
		AllStudent allStudent = new AllStudent();
		allStudent.gayatri.name="GAYATRI";
		allStudent.gayatri.rollNo=01;
		allStudent.gayatri.address="Nagpur";
		
		allStudent.laxmi.rollNo=02;
		allStudent.laxmi.name="LAXMI";
		allStudent.laxmi.address="Pune";
		
		allStudent.prakash.rollNo=03;
		allStudent.prakash.name="Prakash";
		allStudent.prakash.address="Pune";
		
		allStudent.rohan.rollNo=04;
		allStudent.rohan.name="ROHAN";
		allStudent.rohan.address="MumBai";
		System.out.println("All Student Details");
		u.displayAllStudent(allStudent);
	}
}
