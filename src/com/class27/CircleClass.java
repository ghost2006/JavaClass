package com.class27;

public class CircleClass {

    /* 2.Write program: Shape class has a constructor that takes the radius and extend circle class. 
	 * Print area of circle while creating and Object of a child class. */
	
	double radius;
	
	public CircleClass(double radius) {
		this.radius=radius;
	}
}

class ShapeClass extends CircleClass {
	 double p;
	 
	ShapeClass(double radius, double p){
		super(radius);
		this.p=p;
		System.out.println("The area of circle is "+(p*radius*radius));
	}
}
