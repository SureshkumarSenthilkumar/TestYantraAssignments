package com.tyss.constructorassignment;

public class Worker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Manager manager1 = new Manager("Sureshkumar", 23, 8610708255l, "Pollachi",55000,  "Designer", "Management");
	System.out.println(manager1.name);
	System.out.println(manager1.age);
	System.out.println(manager1.phoneNumber);
	System.out.println(manager1.address);
	System.out.println(manager1.department); 
	manager1.printSalary();
	
	Employee manager2 = new Employee("Naveenkumar", 26, 8173273737l, "Anaimalai",6000 , "Coordinator", "Accounting");
	System.out.println(manager2.name);
	System.out.println(manager2.age);
	System.out.println(manager2.phoneNumber);
	System.out.println(manager2.address);
	System.out.println(manager2.specialization); 

	}

}
