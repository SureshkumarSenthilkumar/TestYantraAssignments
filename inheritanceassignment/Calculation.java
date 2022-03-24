package com.tyss.inheritanceassignment;

public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewCalculator a = new NewCalculator(2,3,4,5); 
		a.div(100, 3, 5, 6);
		a.mul(2, 5, 5);
		a.pow(1, 2, 3, 4);
		System.out.println(a.number1);
	}

}
