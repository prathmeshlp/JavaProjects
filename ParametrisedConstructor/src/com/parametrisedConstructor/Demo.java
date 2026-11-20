package com.parametrisedConstructor;

public class Demo {

	public static void main(String[] args) {

		Student student = new Student(35, "Rohan", "Pune", 45.85, 8600196786l, 'A');
		System.out.println("Student Details");
		System.out.println(student.rno);
		System.out.println(student.name);
		System.out.println(student.address);
		System.out.println(student.marks);
		System.out.println(student.contact);
		System.out.println(student.grade);

		
		Employee employee = new Employee(124, "Laxmi", 42125.25);
		System.out.println("===emp details==");
		System.out.println(employee.eid);
		System.out.println(employee.eName);
		System.out.println(employee.salary);
	}
}
