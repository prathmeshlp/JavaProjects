package com.employeeMgtSystem;

public class Department {

	
	public Employee addEmployee() {
		Employee e1 = new Employee();
		e1.eid=101;
		e1.name="praksah";
		e1.salary=42005.0;
		return e1;
	}
	
	public AllEmployee addAllEmployee() {
		AllEmployee allEmployee = new AllEmployee();
		allEmployee.jayesh.eid=102;
		allEmployee.jayesh.name="JAYESH";
		allEmployee.jayesh.salary=20203.20;
		allEmployee.john.eid=103;
		allEmployee.john.name="JOHN";
		allEmployee.john.salary=20403.20;
		allEmployee.ramesh.eid=104;
		allEmployee.ramesh.name="RMESh";
		allEmployee.ramesh.salary=20803.20;
		return allEmployee;
	}
	
}
