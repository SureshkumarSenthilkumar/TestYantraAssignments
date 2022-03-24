package com.tyss.abstractassignment3;

public class Area extends Shape{ 

	@Override
	void RectangeArea(int l, int b) {
		// TODO Auto-generated method stub
		System.out.println( l * b);
		
	}

	@Override
	void SquareArea(int a) {
		// TODO Auto-generated method stub
		System.out.println(4 * a);
		
	}

	@Override
	void CircleArea(int d) {
		// TODO Auto-generated method stub
		System.out.println(Math.PI * d * d);
		
	}
	
	public static void main(String[] args) {
		Area area = new Area();
		area.CircleArea(3);
		area.RectangeArea(2, 3);
		area.SquareArea(6);
		
	}

}
