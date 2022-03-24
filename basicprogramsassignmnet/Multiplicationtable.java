package com.tyss.basicprogramsassignmnet;

import java.util.Scanner;

public class Multiplicationtable {
	int num;
	
	public static void mul(int num) {
		System.out.println("enter the number");
		Scanner number = new Scanner(System.in);
		num = number.nextInt();
		for (int i = 1; i <= 10; i++) {
			int out = num * i;
			System.out.println(num + " * " + i + " = " + out);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiplicationtable.mul(4);
		
		

	}

}
