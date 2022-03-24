package com.tyss.inheritanceassignment;

import java.util.Scanner;

public class SeriesNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a, b, c, result = 0;
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		for (int i = 0; i < c; i++) {
			result += Math.pow(2, i) * b;
			System.out.println(a+result);
		}
		

	}

}
