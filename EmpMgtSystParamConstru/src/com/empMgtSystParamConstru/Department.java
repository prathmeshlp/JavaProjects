package com.empMgtSystParamConstru;

public class Department {

	int deptId;
	String deptName;

	Company company = new Company();

	public Department(int dId, String dName) {

		deptId = dId;
		deptName = dName;
	}

	public void addEmployee() {

		Employee e = new Employee(101, "Rohit", 20000.20);
		System.out.println("Single employee detail");
		company.displayEmployee(e);
	}

	public void addAllEmployees() {

		Employee rohan = new Employee(01, "rohan", 41024.20);
		Employee laxmi = new Employee(02, "laxmi", 4124.20);
		Employee sauraksha = new Employee(03, "sauraksha", 4104.20);
		Employee sakshi = new Employee(04, "sakshi", 414.20);

		AllEmployee allEmployee = new AllEmployee(rohan, laxmi, sauraksha, sakshi);
		company.displayAllEmployees(allEmployee);
	}

}
