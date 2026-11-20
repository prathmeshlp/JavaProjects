package com.dataset;

public class MainClass {

	
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		employee1.eid=1;
		employee1.name="Santosh";
		employee1.salary=23456.86;
		employee1.contact=985658545;
		employee1.grade='A';
		
		Employee employee2 = new Employee();
		employee2.eid=2;
		employee2.name="Anil";
		employee2.salary=4556.86;
		employee2.contact=985658545;
		employee2.grade='B';
		
		System.out.println(employee1.eid+" " + employee1.name+" "+employee1.salary+" "+employee1.contact+" "+employee1.grade);
		
	}
}
