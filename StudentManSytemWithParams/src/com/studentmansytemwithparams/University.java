package com.studentmansytemwithparams;

public class University {

	public void displayStudent(Student s) {
		System.out.println(s.rollNo + " " + s.name + " " + s.address);
	}

	public void displayAllStudent(AllStudent allStudent) {
		System.out.println(allStudent.rohan.rollNo + " " + allStudent.rohan.name + " " + allStudent.rohan.address);
		System.out.println(allStudent.prakash.rollNo + " " + allStudent.prakash.name + " " + allStudent.prakash.address);
		System.out.println(allStudent.gayatri.rollNo + " " + allStudent.gayatri.name + " " + allStudent.gayatri.address);
		System.out.println(allStudent.laxmi.rollNo + " " + allStudent.laxmi.name + " " + allStudent.laxmi.address);
	}

	public static void main(String[] args) {
		College college = new College();
		college.addStudent();
		college.addAllStudent();

	}
}
