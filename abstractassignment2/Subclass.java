package com.tyss.abstractassignment2;

public class Subclass extends Abstractclass{
	@Override
	void a_method(){
		System.out.println("this is abstract method");
	}
	
	public static void main(String[] args) {
		Abstractclass subclass = new Subclass();
		subclass.a_method();
		subclass.b_method();
		
	}
}
