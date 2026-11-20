package com.studentMgtSystem;

public class College {

	
	public Student addStudent() {
		
		System.out.println("===add student method===");
		Student s1= new Student();
		s1.sid=22;
		s1.name="amol";
		s1.address="pcmc";
		
		Student s2 =new Student();
		s2.sid= 23;
		s2.name="Akshay";
		s2.address="Pune";
		
		return s2;
				
	}
	
	public AllStudent addAllStudent() {
		
		AllStudent all = new AllStudent();
		all.nitin.sid=45;
		all.nitin.name="NITIN";
		all.nitin.address="PCMC";
		
		all.santosh.sid=46;
		all.santosh.name="SANTOSH";
		all.santosh.address="Mumbai";
		
		all.pankaj.sid=42;
		all.pankaj.name="Pankaj";
		all.pankaj.address="Chennai";
		
		return all;
		
	}
	
	
	
}
