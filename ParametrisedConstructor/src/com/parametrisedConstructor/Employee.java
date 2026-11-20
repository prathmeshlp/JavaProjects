package com.parametrisedConstructor;

public class Employee {

	int eid;
	String eName;
	double salary;

	public Employee(int emp_id, String empName, double empSalary) {

		eid = emp_id;
		eName = empName;
		salary = empSalary;
	}
}
