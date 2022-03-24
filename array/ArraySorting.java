package com.tyss.array;

import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a[];
		System.out.println("Enter the size of the Array");
		int size = scanner.nextInt();
		a = new int[size]; 
		int num;
		//Storing the array
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the number");
			num = scanner.nextInt();
			a[i] = num;
		}
		
		//Sorting the array
		//{1,5,7,2,9}
		
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if(a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		//Reading the array
				
				for (int i = 0; i < a.length; i++) {
					num = a[i];
					System.out.print(num);
				}

	}

}
