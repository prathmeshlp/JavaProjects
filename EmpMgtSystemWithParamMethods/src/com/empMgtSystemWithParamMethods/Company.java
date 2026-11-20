package com.empMgtSystemWithParamMethods;

public class Company {

	public void displayEmployee(Employee e) {

		System.out.println(e); // printed using toString method
//		System.out.println(e.emp_id);
//		System.out.println(e.name);
//		System.out.println(e.salary);
	}

	public void displayAllEmployees(AllEmployee all) {
		System.out.println(all);// printed using toString method

//		System.out.println(all.rohan.emp_id+" "+all.rohan.name+" "+ all.rohan.salary);
//		System.out.println(all.sakshi.emp_id+" "+all.sakshi.name+" "+ all.sakshi.salary);
//		System.out.println(all.laxmi.emp_id+" "+all.laxmi.name+" "+ all.laxmi.salary);
//		System.out.println(all.sauraksha.emp_id+" "+all.sauraksha.name+" "+ all.sauraksha.salary);

	}

	public static void main(String[] args) {

		Department department = new Department();
		department.deptId = 401;
		department.deptName = "IT";
		System.out.println(department);
		department.addEmployee();
		department.addAllEmployees();

	}

}
