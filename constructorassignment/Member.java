package com.tyss.constructorassignment;

public class Member {

	 String name;
	 int age;
	 long phoneNumber;
	 String address;
	 int salary;
	 
	 public Member(String name, int age, long phoneNumber, String address, int salary) {
		 this.salary = salary;
		 this.name = name;
		 this.age = age;
		 this.phoneNumber = phoneNumber;
		 this.address = address;
	 }

	public Member() {
		// TODO Auto-generated constructor stub
	}
	public void printSalary() {
		System.out.println("The salary is "+ salary);
	}
}
