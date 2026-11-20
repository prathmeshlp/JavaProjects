package com.empMgtSystemWithParamMethods;

public class Department {

	int deptId;
	String deptName;
	

	Company company = new Company();

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}


	public void addEmployee() {

		Employee e1 = new Employee();
		e1.emp_id = 101;
		e1.name = "Om";
		e1.salary = 45100.50f;

		System.out.println("Single employee detail");
		company.displayEmployee(e1);
	}
	
	
	public void addAllEmployees() {
		
		AllEmployee allEmployee = new AllEmployee();
		allEmployee.laxmi.emp_id=101;
		allEmployee.laxmi.name="LAXMI";
		allEmployee.laxmi.salary=50202.20f;
		allEmployee.rohan.emp_id=102;
		allEmployee.rohan.name="Rohan";
		allEmployee.rohan.salary=40202.20f;
		allEmployee.sakshi.emp_id=103;
		allEmployee.sakshi.name="Sakshi";
		allEmployee.sakshi.salary=30202.20f;
		allEmployee.sauraksha.emp_id=104;
		allEmployee.sauraksha.name="SAURAKSHA";
		allEmployee.sauraksha.salary=60202.20f;
		System.out.println("All employee detail");
		company.displayAllEmployees(allEmployee);
		
	}

}
