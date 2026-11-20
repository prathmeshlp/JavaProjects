package com.empBonusMgtSystem;

public class Manager extends Employee {



	@Override
	double calculateSalary() {
		
		return salary + 20000;
	}

}
