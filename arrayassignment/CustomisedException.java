package com.tyss.arrayassignment;

import java.util.Scanner;

public class CustomisedException {
	 
	
	public static void main(String[] args) throws CompileException {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the name");
		 String name = scan.nextLine(); 
			if (name.equals("Madan")) {
				System.out.println("You are eligible");
			} else {
				throw new CompileException("You are not permitted");
			}
		 } 
	}
 
