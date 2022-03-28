package com.tyss.arrayassignment;

import java.util.Scanner;

public class Array4 {
	static boolean checking(int b[]){//1,3,1,3,1,3
		int count = 0;
		for (int i = 0; i < b.length - 1; i++) {
			if (b[i] == 3 && b[i+1] != 3) {
				count +=1;
				System.out.println(count);
			} 
		} if (count == 3 | (count == 2 && b[b.length-1] == 3)) {
			return true;
		} 
		return false;
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
		System.out.println(checking(b));
	}

}
