package com.class29;

public class Shape1Test {
	
	 public static void main(String[] args) {
	       
		 Circle1 circle=new Circle1();
	        circle.calculateArea(20.5);
	        circle.calculatePerimiter(40);
	        circle.whoAmI();
	        
	        Shape1 obj1=new Circle1();
	        obj1.calculateArea(10);
	        obj1.calculatePerimiter(20);
	        //obj1.whoAmI(); not available for shape class, it's unique method of circle
	      
	 
}
}