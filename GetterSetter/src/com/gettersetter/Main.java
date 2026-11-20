package com.gettersetter;

public class Main {

	
	
public static void main(String[] args) {
		
		Student s = new Student();
		byte b=01;
		s.setRollNo(b);
		short sc = 2502;
		s.setCode(sc);
		s.setStudentName("Prathmesh");
		s.setStudentId(425);
		s.setStudentsMarks(85.5f);
		s.setStudentContactNumber(8600196796l);
		s.setIsPresent(true);
		s.setGrade('A');
		
		
		System.out.println("sId"+""+s.getStudentId());
		System.out.println("sName"+""+s.getStudentName());
		System.out.println("sRollNumber"+""+s.getRollNo());
		System.out.println("studentCode"+""+s.getScode());
		System.out.println("studentmarks"+""+s.getStudentsMarks());
		System.out.println("studentContactNumber"+""+s.getStudentContactNumber());
		System.out.println("uisStudentPresent"+""+s.checkIsPresent());
		System.out.println("grade"+""+s.getGrade());
		
		
		
	}
}
