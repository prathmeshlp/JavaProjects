package com.empMgtSystParamConstru;

public class Company {

	
	public void displayEmployee(Employee e) {
		System.out.println(e.eid);
		System.out.println(e.ename);
		System.out.println(e.salary);
	}
	
	
	public void displayAllEmployees(AllEmployee all) {
		
		System.out.println(all.rohan.eid+" "+all.rohan.ename+" "+ all.rohan.salary);
		System.out.println(all.sakshi.eid+" "+all.sakshi.ename+" "+ all.sakshi.salary);
		System.out.println(all.laxmi.eid+" "+all.laxmi.ename+" "+ all.laxmi.salary);
		System.out.println(all.sauraksha.eid+" "+all.sauraksha.ename+" "+ all.sauraksha.salary);
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("Department Details");
		Department department =  new Department(401,"IT");
		System.out.println(department.deptId);
		System.out.println(department.deptName);
		department.addEmployee();
		department.addAllEmployees();

 	}
	
	
}
