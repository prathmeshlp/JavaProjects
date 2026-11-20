package com.employeemgtsystem;

public class Department {
	public Employee addEmployee() {
		Employee emp=new Employee();
		emp.eid=101;
		emp.ename="Rushikesh";
		emp.salary=500.00;
		
		
		  
		return emp;//emp1 or emp2
	}
	
	public AllEmployee addAllEmployee() {
		AllEmployee all=new AllEmployee();
		all.emp1 .eid=99;
		all.emp1.ename="NANDINI";
		all.emp1.salary=350.400;
				
		all.emp2.eid=22;
		all.emp2.ename="MANISHA";
		all.emp2.salary=450.00;
		
		all.emp3.eid=42;
		all.emp4.ename="AISHWARYA";
		all.emp3.salary=420.00;
		
		all.emp4.eid=52;
		all.emp4.ename="LAXMI";
		all.emp4.salary=720.00;


		return all;
				
		
		
		
	}

}
