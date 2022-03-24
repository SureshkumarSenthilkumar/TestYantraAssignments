package com.tyss.inheritanceassignment;

public class Calculator {

	int number1;
	int number2;
	
	Calculator(int num1, int num2){
		this.number1 = num1;
		this.number2 = num2;
		System.out.println("Performing Calculations");
	}
	public void add(int number1, int number2) {
		System.out.println(number1 + number2);
	}
	public void sub(int number1, int number2) {
		System.out.println(number1 - number2);
	}
	
}
