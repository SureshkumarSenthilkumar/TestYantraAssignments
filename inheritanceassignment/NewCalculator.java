package com.tyss.inheritanceassignment;

public class NewCalculator extends OldCalculator{
	
	int number4 ;
	NewCalculator(int number1, int number2, int num3, int num4) {
		super(number1, number2);
		this.number4 = num4;
		System.out.println("NewCalculator");
		// TODO Auto-generated constructor stub
	}

	public void pow(int number1, int number2, int number3, int number4) {
		System.out.println(number1 * number2 * number3 * number4);
	}

	public void rem(int number1, int number2, int number3, int number4) {
		System.out.println(number1 % number2 % number3 % number4);
	}
	
}
