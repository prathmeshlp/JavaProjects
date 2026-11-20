package com.studentMgtSystem;

public class Universiity {

	
	public static void main(String[] args) {
		
		System.out.println("====main method======");
		
		College college = new College();
		Student student = college.addStudent();
		System.out.println(student);//printed using toString method
//		System.out.println(student.sid+" "+student.name+" "+student.address);
		
		
		
		AllStudent allStudent =college.addAllStudent();
		System.out.println("ALL Students");
		System.out.println(allStudent);//printed using toString method
		
//		System.out.println(allStudent.nitin.sid+" "+allStudent.nitin.name+" "+allStudent.nitin.address);
//		System.out.println(allStudent.pankaj.sid+" "+allStudent.pankaj.name+" "+allStudent.pankaj.address);
//		System.out.println(allStudent.santosh.sid+" "+allStudent.santosh.name+" "+allStudent.santosh.address);
	}
	
	
}
