package com.tyss.arrayassignment;

import java.util.Scanner;

public class ContinuosInput {
	static int number;
	static int sum = 0;
	static void add(int number) {
		sum += number;
		System.out.println("The sum is "+ sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the limit");
		int count = scan.nextInt();
		for (int i = 0; i < count; i++) {
			add(number = scan.nextInt());
		} 

	}

}
