package com.tyss.constructorassignment;

public class Student {

	String name;
	
	 Student(){
		System.out.println("the name is unkonwn");
	}
	
	 Student(String name){
		this.name = name;
		System.out.println(name + " is the name of the student");
	}
}
