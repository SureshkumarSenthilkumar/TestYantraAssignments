package com.tyss.arrayassignment;

import java.util.Scanner;

public class Fibonacci {
	static int n1 = 0, n2 = 1, n3 = 0;
	static void fibonacci(int count) {
		if (count > 2) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(n3 + " ");
			fibonacci(--count);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the limit");
		////using recursion
//		int n1 = 0, n2 = 1, n3, i, count;
//		count = scan.nextInt();
//		System.out.println(n1);
//		System.out.println(n2);
//		for (i = 2; i < count; i++) {
//			n3 = n1 + n2;
//			System.out.println(n3);
//			n1 = n2;
//			n2 = n3;
//		}
		int count = scan.nextInt(); 
		System.out.print(n1 + " " + n2 + " ");
		fibonacci(count);
			
	}
}
