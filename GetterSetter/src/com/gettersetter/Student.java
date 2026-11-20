package com.gettersetter;

public class Student {

	private byte rollNo;
	private short studentCode;
	private int studentId;
	private String studentName;
	private float studentsMarks;
	private long studentContactNumber;
	private boolean isStudentPresent;
	private char studentGrade;
	
	
	public byte getRollNo() {
		return rollNo;
	}
	
	public void setRollNo(Byte sRollNo) {
		rollNo=sRollNo;
	}
	
	public short getScode() {
		return studentCode;
	}
	
	public void setCode(short sCode) {
		studentCode=sCode;
	}
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int sId) {
		studentId=sId;
	}
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String sName) {
		studentName=sName;
	}
	
	public float getStudentsMarks() {
		return studentsMarks;
	}
	
	public void setStudentsMarks(float sMarks) {
		studentsMarks=sMarks;
	}
	
	public long getStudentContactNumber() {
		return studentContactNumber;
	}
	
	public void setStudentContactNumber(long sContactNumber) {
		studentContactNumber=sContactNumber;
	}
	
	
	public boolean checkIsPresent() {
		return isStudentPresent;
	}
	
	public void setIsPresent(boolean isPresent) {
		isStudentPresent=isPresent;
	}
	public char getGrade() {
		return studentGrade;
	}
	
	public void setGrade(char sGrade) {
		studentGrade=sGrade;
	}
	
	
	
	
	
}
