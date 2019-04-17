package com.class23;

public class CalculatingArea {
	
	/*Create 1 class in which create a methods that will calculate the area of
	 * Rectangle
	 * Square
	 * Box
	Use separate class to test your code*/
	

	public void CalculateTheArea(int a, int b) {
		System.out.println("The area of a rectangle is "+a*b);
	}
	
	
	public void CalculateTheArea(int a) {
		System.out.println("The area of a square is "+a*a);
	}
	
	public void CalculateTheArea(int a,int b,int c) {
	System.out.println("The area of a box is "+a*b*c);
	
//	public int CalculateTheArea(int a, int b) {
//		System.out.println("The area of a rectangle is "+a*b);
//		return a*b; --> compiler gives an error-->             Overloading method can't have the return Type
//	}
}
	
}
