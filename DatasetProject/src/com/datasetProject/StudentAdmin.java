package com.datasetProject;

public class StudentAdmin {

	public static void main(String[] args) {
		Student student = new Student();
		student.sid=101;
		student.batch.bid = 23;
		student.batch.faculty.fid= 25;
		student.batch.faculty.course.cname="Java";
		student.batch.faculty.course.cid=204;
		System.out.println(student.sid);
		System.out.println(student.batch.bid);
		System.out.println(student.batch.faculty.fid);
		System.out.println(	student.batch.faculty.course.cname);
		System.out.println(student.batch.faculty.course.cid);
	
	}

}
