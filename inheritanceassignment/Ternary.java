package com.tyss.inheritanceassignment;

import java.util.Scanner;

public class Ternary {
	static void ternary(int a) {
		String output = (a < 10) ? "number lesser than 10" : "number greater than 10";
		System.out.println(output);
	}

	public static void main(String[] args) {
		System.out.println("Ternary Operator");
		Scanner input = new Scanner(System.in);
		Ternary.ternary(input.nextInt());

	}

}
