package com.class29;	
/* 1. Create an Interface ‘Shape’ with undefined methods as calculateArea() and calculatePerimeter().
* Create 2 child classes: Circle & Square that should have an implementation of area and perimeter calculation. Test your code.*/

public class Circle implements Shape{
	int radius; 
	
	Circle(int radius){
		this.radius=radius;
	}
	
	@Override
	public void calculateArea() {
		  System.out.println("Area of the radius " + radius + " is " + 3.14*radius*radius);	
	}
	@Override
	public void calculatePerimeter() {
		  System.out.println("Perimeter of the radius " + radius + " is " + 3.14*2*radius);	
	} 
}

class Square implements Shape{
    int length;
    
    Square(int length){
        this.length = length;
    }
    
    @Override
    public void calculateArea() {
        System.out.println("Area of the Sqaure is " + length*length ); 
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Area of the Sqaure is " + 4*length );  
    }
    
}