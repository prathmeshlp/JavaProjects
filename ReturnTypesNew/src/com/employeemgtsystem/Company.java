package com.employeemgtsystem;

public class Company {
public static void main(String[] args) {
	
	System.out.println("===main methos====");
	
	Department dpt=new Department();
	Employee e=dpt.addEmployee();
	System.out.println(e.eid + " "+e.ename + " "+e.salary);
	
	System.out.println("===All Employee===");
	AllEmployee all1=dpt.addAllEmployee();
	System.out.println(all1.emp1.eid + " " + all1.emp1.ename + " " + all1.emp1.salary);
	System.out.println(all1.emp2.eid + " " + all1.emp2.ename + " " + all1.emp2.salary);
	System.out.println(all1.emp3.eid + " " + all1.emp3.ename + " " + all1.emp3.salary);
	System.out.println(all1.emp4.eid + " " + all1.emp4.ename + " " + all1.emp4.salary);
}
}
