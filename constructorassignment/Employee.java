package com.tyss.constructorassignment;

public class Employee extends Member {

	String specialization;

	public Employee(String specialization) {
		super();
		this.specialization = specialization;
	}
	
	public Employee(String name, int age, long phoneNumber, String address, int salary, String specialization, String department) {
		super(name, age, phoneNumber, address, salary);
		this.specialization = specialization;
	}

}
