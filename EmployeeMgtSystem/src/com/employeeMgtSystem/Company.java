package com.employeeMgtSystem;

public class Company {

	
	public static void main(String[] args) {
		
		Department dept=new Department();
		Employee e1 = dept.addEmployee();
		System.out.println(e1); // Called via toString() method
//		System.out.println("==addEmployee Method==");
//		System.out.println(e1.eid+" "+e1.name+" "+e1.salary);
		
		
		AllEmployee all = dept.addAllEmployee();
		System.out.println(all); // Called via toString() method
//		System.out.println("addAllemployee Method");
//		System.out.println(all.jayesh.eid + " "+all.jayesh.name+" "+all.jayesh.salary);
//		System.out.println(all.ramesh.eid + " "+all.ramesh+" "+all.ramesh.salary);
//		System.out.println(all.john.eid + " "+all.john.name+" "+all.john.salary);
	}
	
}
