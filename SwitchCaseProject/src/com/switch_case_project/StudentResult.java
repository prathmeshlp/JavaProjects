package com.switch_case_project;

public class StudentResult {

	public static void main(String[] args) {

		StudentDetails studentDetails = new StudentDetails();

		studentDetails.setStudentDetails();

		studentDetails.showStudentDetails();

		float percentage = studentDetails.calculatePercentage();
		System.out.println("percentage" + percentage);

		int p = (int) percentage;
		System.out.println(p);

		switch (p / 10) {
		case 10: {
			System.out.println("Grade: A");
			break;
		}
		case 9:
			System.out.println("Grade: A");
			break;
		case 8:
			System.out.println("Grade: B");
			break;
		case 7:
			System.out.println("Grade: C");
			break;

		default:
		System.out.println("Fail");
		break;
		}

//	
	}

}
