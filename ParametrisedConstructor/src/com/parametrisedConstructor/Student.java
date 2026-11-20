package com.parametrisedConstructor;

public class Student {

	int rno;
	String name;
	String address;
	double marks;
	long contact;
	char grade;

	Student(int rollNo, String stdName, String stdAddress, double stdMarks, long stdContact, char stdGrade) {
		rno = rollNo;
		name = stdName;
		address = stdAddress;
		marks = stdMarks;
		contact = stdContact;
		grade = stdGrade;
	}

}