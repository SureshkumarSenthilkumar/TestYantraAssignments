package com.tyss.constructorassignment;

public class Manager extends Member {

	String department; 

	public Manager(String department) {
		super();
		this.department = department;
	}

	public Manager(String name, int age, long phoneNumber, String address, int salary, String specialization, String department) {
		super(name, age, phoneNumber, address, salary);
		this.department = department;
	}

	
	
	
	

}
