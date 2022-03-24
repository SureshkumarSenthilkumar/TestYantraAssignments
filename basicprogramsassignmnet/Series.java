package com.tyss.basicprogramsassignmnet;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		double out; 
		int l;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		a = input.nextInt();
		System.out.println("Enter a number");
		b = input.nextInt();
		System.out.println("Enter a limit");
		l = input.nextInt(); 
		for (int i = 0; i < l ; i++) { 
			int sum = 0;
			for (int j = 0; j < i; j++) {  
				sum = (int) (sum + Math.pow(2, j) * b);
			}
			System.out.println(a+sum);
		}
		}
		
	}

