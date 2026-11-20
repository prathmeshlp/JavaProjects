package com.studentresultcard;

public class Student {

	private int rollNo;
	private int marks1;
	private int marks2;
	private int marks3;
	private static int maxTotal = 300;
	private int graceMarks;
	private String graceSubject;

	public Student(int rollNo, int marks1, int marks2, int marks3) {
		this.rollNo = rollNo;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
		this.graceMarks = 0;
		this.graceSubject = "None";
	}

	public int getMarks1() {
		return marks1;
	}

	public int getMarks2() {
		return marks2;
	}

	public int getMarks3() {
		return marks3;
	}

	public int getRollNo() {
		return this.rollNo;
	}

	public int getTotal() {
		return marks1 + marks2 + marks3;
	}

	public int getMaxTotal() {
		return this.maxTotal;
	}

	public double getPercentage() {
		int totalMarks = getTotal();
		return (double) totalMarks / maxTotal * 100;
	}

	public char getGrade() {
		if (!isPass()) {
			return 'F';
		}

		if (getTotal() > 90 && getTotal() < 100) {
			return 'A';
		} else if (getTotal() >= 75 && getTotal() <= 89) {
			return 'B';
		} else if (getTotal() >= 60 && getTotal() <= 74) {
			return 'C';
		} else if (getTotal() >= 40 && getTotal() < 59) {
			return 'D';
		} else {
			return 'F';
		}
	}

	public boolean isPass() {
		if (marks1 < 40 || marks2 < 40 || marks3 < 40) {
			return false;
		}
		return true;
	}

//	7. Sample Result Card
//	text
//	======= RESULT CARD =======
//	Roll No : 101
//	Subject 1 : 78
//	Subject 2 : 85
//	Subject 3 : 66
//	Total : 229 / 300
//	Percentage : 76.33
//	Grade : B
//	Result : PASS
//	===========================
	public void showResultCard() {
		System.out.println("======= RESULT CARD =======");
		System.out.println("Roll No : " + this.rollNo);
		System.out.println("Subject 1 " + this.marks1);
		System.out.println("Subject 2 " + this.marks2);
		System.out.println("Subject 3 " + this.marks3);
		System.out.println("Total " + " " + getTotal() + "/" + getMaxTotal());
		System.out.println("Percentage :" + getPercentage());
		System.out.println("Grade :" + getGrade());
		System.out.println("Result :" + (isPass() ? "PASS" : "FAIL"));
		if (getGraceMarks() > 0) {
			System.out.println("Grace Marks : " + getGraceMarks() + " in " + getGraceSubject());
		}
		System.out.println("===========================");

	}

	public boolean applyGraceMarks() {

		// Already applied
		if (graceMarks > 0) {
			return false;
		}

		int failedSubjects = 0;
		int shortage = 0;
		int subjectNumber = 0;

		int[] marks = { marks1, marks2, marks3 };

		for (int i = 0; i < marks.length; i++) {

			if (marks[i] < 40) {

				failedSubjects++;

				shortage = 40 - marks[i];

				subjectNumber = i + 1;
			}
		}

		// Exactly one failed subject and maximum 5 marks shortage
		if (failedSubjects == 1 && shortage <= 5) {

			switch (subjectNumber) {

			case 1:
				marks1 = 40;
				break;

			case 2:
				marks2 = 40;
				break;

			case 3:
				marks3 = 40;
				break;
			}

			graceMarks = shortage;
			graceSubject = "Subject " + subjectNumber;

			return true;
		}

		return false;
	}

	public int getGraceMarks() {
		return graceMarks;
	}

	public String getGraceSubject() {
		return graceSubject;
	}

	protected void recordPracticalGrace(int marks) {
		this.graceMarks = marks;
		this.graceSubject = "Practical";
	}

	public String getRank(double classAverage) {

		if (getPercentage() > classAverage) {
			return "Above class average";
		} else if (getPercentage() < classAverage) {
			return "Below class average";
		} else {
			return "Equal to class average";
		}
	}

}
