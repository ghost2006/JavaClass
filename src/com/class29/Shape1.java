package com.class29;

public interface Shape1 {
	
	void calculateArea(double num);
	void calculatePerimiter(double num);
}
class Circle1 implements Shape1 {

	@Override
	public void calculateArea(double num) { //passed our parameter inside method!
		double area= 3.14*(num*num); // double area --> because we multiply by 3.14
		System.out.println(area);
	}
	@Override
	public void calculatePerimiter(double num) {
		double perimiter=2*(num*3.14);
		System.out.println(perimiter);
	}
	
	public void whoAmI() {
		System.out.println("I am a circle");
	}
}

class Square1 implements Shape1{

	@Override
	public void calculateArea(double num) {
		double area=num*num;
		System.out.println(area);
	}
	@Override
	public void calculatePerimiter(double num) {
		double perimiter =4*num;
		System.out.println(perimiter);
	}
}

