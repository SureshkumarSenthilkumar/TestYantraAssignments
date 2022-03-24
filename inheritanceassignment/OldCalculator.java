package com.tyss.inheritanceassignment;

public class OldCalculator extends Calculator {

	int number3; 
	
	OldCalculator(int number1, int number2, int num3){
		super(number1, number2);
		this.number3 = num3; 
		System.out.println("Old Constructor"); 
	}

	public OldCalculator(int number1, int number2) {
		// TODO Auto-generated constructor stub
		super(number1, number2);
	}

	public void mul(int number1, int number2, int number3) {
		System.out.println(number1 * number2 * number3 );
	}

	public void div(int number1, int number2, int number3, int number4) {
		System.out.println(number1 / number2 / number3 / number4);
	}

}
