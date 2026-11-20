package com.parameterizedmethods;

public class DemoClass {

	
	public void m1(int i) {
		System.out.println("single parameter method");
	}
	
	public void m2(int i,int j) {
		System.out.println("two parameter method");
	}
	public void m3(int i,int j,int k,int l) {
		System.out.println("four parameter method");
	}

	public void m6(byte b,String s) {
		System.out.println("two param method with byte and string");
	}
	public void displayStudent(Student std) {
		
		System.out.println(std.rollNo+" "+std.name+ " "+std.address);
	}
	
	public void displayStudentAndCollege(Student s,College c) {
		System.out.println(s.rollNo+" "+s.name+ " "+s.address);
		System.out.println(c.collegeId+" "+c.collegeName);
	}
	
	public void m7(boolean b,char c) {
		System.out.println("method with boolean and char"+ b +" "+ c );
		
	}
	
	public static void main(String[] args) {
		DemoClass dc = new DemoClass();
		dc.m1(10);
		
		int k=90;
		
		dc.m2(20,50);
		
		dc.m3(20, 40, 60, 80);
		
		byte b = 20;
		dc.m6(b, "Hello");
		
		dc.m7(false, 'A');
		
		
		Student student = new Student();
		student.rollNo=101;
		student.name="PM";
		student.address="Pune";
		
		dc.displayStudent(student);
		
		College college = new College();
		college.collegeId=01;
		college.collegeName="PRMCEAM";
		dc.displayStudentAndCollege(student, college);
		
		
	}
}
