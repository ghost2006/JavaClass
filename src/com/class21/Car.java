package com.class21;

public class Car {

	public String color;//null
	public static int totalCars;//0  can use access mod!! usually make it as a public
	
	
	public static void main(String[] args) {
		Car car1=new Car();
		car1.color="white";
		car1.totalCars++; //or totalCars++ // or Car.totalCars
		
		Car car2=new Car();
		car2.color="black";
		car2.totalCars++;
		System.out.println("Total car we made is "+totalCars);
	}

}
