package com.tyss.arrayassignment;

import java.util.Scanner;

public class Array3 {

	static int c[] = new int[2];
	static void add(int b[]) {
		if (b.length < 2) {  
			c[0] = 0;
			c[1] = 0;
		}
		else {
			c[0] = b[0];
			c[1] = b[1]; 
		} 
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number"); 
		
		int len = scan.nextInt();
		int b[] = new int[len];
		//for getting
		for (int i = 0; i < len; i++) {
			b[i] = scan.nextInt();
		}
		add(b);
		
		//for printing
		for (int j = 0; j < 2; j++) {
			System.out.println(c[j]);
		}
		
		
		
	}

}
