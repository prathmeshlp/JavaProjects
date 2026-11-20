package com.empBonusMgtSystem;

public class Developer extends Employee {
	

	@Override
	double calculateSalary() {
	
		return salary + 10000;
	}

}
