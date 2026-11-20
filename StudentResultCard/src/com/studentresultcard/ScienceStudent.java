package com.studentresultcard;

public class ScienceStudent extends Student {

	private int practicalMarks;

	public ScienceStudent(int rollNo, int marks1, int marks2, int marks3, int practicalMarks) {

		super(rollNo, marks1, marks2, marks3);

		this.practicalMarks = practicalMarks;
	}

	// Getter
	public int getPracticalMarks() {
		return practicalMarks;
	}

//	● Constructor chaining: ScienceStudent calls super(rollNo, m1, m2, m3)
//	● Method overriding: getTotal(), getMaxTotal(), and isPass()
//	● Runtime polymorphism: a Student variable can hold a ScienceStudent object, so
//	one piece of code prints both types
//	● if - else if - else ladder for the grade
//	● do-while loop to ask marks again until the value is valid
//	● for loop over the number of students
//	● Variables such as highestPercentage, topperRoll, passCount, failCount, and
//	sumOfPercentages
//	● Casting percentage with (double) to avoid whole-number division

	@Override
	public int getTotal() {
		// TODO Auto-generated method stub
		return super.getTotal() + practicalMarks;
	}

	@Override
	public int getMaxTotal() {
		// TODO Auto-generated method stub
		return 400;
	}

	@Override
	public boolean isPass() {
		return super.isPass() && practicalMarks >= 40;
	}

	@Override
	public void showResultCard() {
		System.out.println("\n======= SCIENCE RESULT CARD =======");

		System.out.println("Roll No : " + getRollNo());

		System.out.println("Subject 1 : " + getMarks1());

		System.out.println("Subject 2 : " + getMarks2());

		System.out.println("Subject 3 : " + getMarks3());

		System.out.println("Practical : " + practicalMarks);

		System.out.println("Total : " + getTotal() + " / " + getMaxTotal());

		System.out.printf("Percentage : %.2f%%%n", getPercentage());

		System.out.println("Grade : " + getGrade());

		System.out.println("Result : " + (isPass() ? "PASS" : "FAIL"));
		if (getGraceMarks() > 0) {
			System.out.println("Grace Marks : " + getGraceMarks() + " in " + getGraceSubject());
		}

		System.out.println("===================================");
	}

	@Override
	public boolean applyGraceMarks() {

		if (getGraceMarks() > 0) {
			return false;
		}

		int failedSubjects = 0;
		int shortage = 0;
		int subjectNumber = 0;

		int[] marks = { getMarks1(), getMarks2(), getMarks3(), practicalMarks };

		for (int i = 0; i < marks.length; i++) {

			if (marks[i] < 40) {

				failedSubjects++;
				shortage = 40 - marks[i];
				subjectNumber = i + 1;
			}
		}

		if (failedSubjects != 1 || shortage > 5) {
			return false;
		}

		if (subjectNumber == 4) {

			practicalMarks = 40;

			recordPracticalGrace(shortage);

		} else {

			super.applyGraceMarks();
		}

		return true;
	}

}
