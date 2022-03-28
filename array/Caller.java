package com.tyss.array;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Caller {
	static void task(File file) throws IOException, ArithmeticException {
		FileReader b = new FileReader(file);
		int i = b.read();
		while(i > 0) {
			System.out.println((char) i);
			i = b.read();
		}
		System.out.println(i/0);
	}
	public static void main(String[] args) throws IOException   {
		// TODO Auto-generated method stub 
		File file = new File("file12");
		try {
		Caller.task(file);
		} catch (ArithmeticException e) {
			System.out.println("Number is not divisble");
		} catch (IOException e) {
			System.out.println("Input Output Exception");
		}
		

	}
	 

}
