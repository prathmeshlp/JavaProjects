
package com.studentresultcard;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Number of students
		int totalStudents;

		do {

			System.out.print("Enter number of students: ");
			totalStudents = sc.nextInt();

			if (totalStudents <= 0) {

				System.out.println("Number of students must be greater than 0.");
			}

		} while (totalStudents <= 0);

		// Array of parent class references
		Student[] students = new Student[totalStudents];

		// Class summary variables
		int passCount = 0;
		int failCount = 0;

		double sumOfPercentages = 0;
		double highestPercentage = -1;

		int topperRoll = -1;

		int highestMarks1 = -1;
		int highestMarks2 = -1;
		int highestMarks3 = -1;

		// ================= STUDENT ENTRY =================

		for (int i = 0; i < totalStudents; i++) {

			System.out.println("\n===== ENTER STUDENT " + (i + 1) + " DETAILS =====");

			System.out.println("1. General Student");
			System.out.println("2. Science Student");

			int type;

			do {

				System.out.print("Select student type: ");
				type = sc.nextInt();

				if (type != 1 && type != 2) {

					System.out.println("Invalid student type!");
				}

			} while (type != 1 && type != 2);

			// Roll number
			int rollNo;

			do {

				System.out.print("Enter roll number: ");
				rollNo = sc.nextInt();

				if (rollNo <= 0) {

					System.out.println("Roll number must be greater than 0.");
				}

			} while (rollNo <= 0);

			// Read subject marks
			int m1, m2, m3;

			do {

				System.out.print("Enter subject 1 marks: ");
				m1 = sc.nextInt();

				if (m1 < 0 || m1 > 100) {
					System.out.println("Invalid marks! Enter marks between 0 and 100.");
				}

			} while (m1 < 0 || m1 > 100);

			do {

				System.out.print("Enter subject 2 marks: ");
				m2 = sc.nextInt();

				if (m2 < 0 || m2 > 100) {
					System.out.println("Invalid marks! Enter marks between 0 and 100.");
				}

			} while (m2 < 0 || m2 > 100);

			do {

				System.out.print("Enter subject 3 marks: ");
				m3 = sc.nextInt();

				if (m3 < 0 || m3 > 100) {
					System.out.println("Invalid marks! Enter marks between 0 and 100.");
				}

			} while (m3 < 0 || m3 > 100);

			if (type == 1) {

				students[i] = new Student(rollNo, m1, m2, m3);

			} else {

				int practical;

				do {

					System.out.print("Enter practical marks: ");
					practical = sc.nextInt();

					if (practical < 0 || practical > 100) {
						System.out.println("Invalid marks! Enter marks between 0 and 100.");
					}

				} while (practical < 0 || practical > 100);

				students[i] = new ScienceStudent(rollNo, m1, m2, m3, practical);
			}

			// Apply grace marks if eligible
			students[i].applyGraceMarks();

			// Show result card immediately
			students[i].showResultCard();
		}

		// ================= CLASS SUMMARY =================

		for (int i = 0; i < totalStudents; i++) {

			Student student = students[i];

			double percentage = student.getPercentage();

			sumOfPercentages += percentage;

			// Pass / Fail count
			if (student.isPass()) {

				passCount++;

				// Only passed students can be toppers
				if (percentage > highestPercentage) {

					highestPercentage = percentage;
					topperRoll = student.getRollNo();
				}

			} else {

				failCount++;
			}

			// Highest marks in each subject
			if (student.getMarks1() > highestMarks1) {
				highestMarks1 = student.getMarks1();
			}

			if (student.getMarks2() > highestMarks2) {
				highestMarks2 = student.getMarks2();
			}

			if (student.getMarks3() > highestMarks3) {
				highestMarks3 = student.getMarks3();
			}
		}

		// Calculate class average
		double classAverage = sumOfPercentages / totalStudents;

		// ================= DISPLAY SUMMARY =================

		System.out.println("\n======= CLASS SUMMARY =======");

		System.out.println("Total Students : " + totalStudents);
		System.out.println("Passed : " + passCount);
		System.out.println("Failed : " + failCount);

		System.out.printf("Average Percent : %.2f%%%n", classAverage);

		if (topperRoll != -1) {

			System.out.println("Topper Roll No : " + topperRoll);

			System.out.printf("Topper Percent : %.2f%%%n", highestPercentage);

		} else {

			System.out.println("Topper : No topper");
		}

		System.out.println("\n--- SUBJECT-WISE HIGHEST MARKS ---");

		System.out.println("Subject 1 : " + highestMarks1);
		System.out.println("Subject 2 : " + highestMarks2);
		System.out.println("Subject 3 : " + highestMarks3);

		System.out.println("==============================");

		// ================= RANK MESSAGES =================

		System.out.println("\n======= STUDENT RANK REPORT =======");

		for (int i = 0; i < totalStudents; i++) {

			Student student = students[i];

			System.out.println("Roll No: " + student.getRollNo() + " - " + student.getRank(classAverage));
		}

		System.out.println("===================================");

		sc.close();
	}
}
