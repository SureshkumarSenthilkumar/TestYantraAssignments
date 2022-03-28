package com.tyss.array;

import java.util.Scanner;

public class ArraySorting {
	static int num;
	static int a[];
	protected int g = 8;
	static Scanner scanner = new Scanner(System.in);
	
	static int[] arraysizing(){	
		System.out.println("Enter the size of the Array");
		int size = scanner.nextInt();
		a = new int[size];  
		return a;
	}
	
	//printing the array
	static void printing(){
		System.out.println("\nSorted output is");
		for (int i = 0; i < a.length; i++) {
			num = a[i];
			System.out.print(num);
		}
	}
	
	//getting the array
	static void getting() {
	for (int i = 0; i < a.length; i++) {
		System.out.println("Enter the number");
		num = scanner.nextInt();
		a[i] = num;
	}
	}
	
	//descending order
	static void sortingdescending(){
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
	}
	
	//ascending order
	static void sortingascending(){
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if(a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	 
	

	public static void main(String[] args) {
		 
		 arraysizing();
		 getting();
		 sortingascending();
		 printing();
		 sortingdescending();
		 printing();
		 			
	}

}
