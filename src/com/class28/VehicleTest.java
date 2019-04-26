package com.class28;

public class VehicleTest {

	public static void main(String[] args) {
		
		Car car =new Toyota("Camry"); // Run time poly.
		car.stop();    
		car.drive();
		car.start();
		 
		System.out.println(Vehicle.VehicleCount);//1
	
		new BMW("bmw"); //+1 --> every time a new obj'll be created--> our VehicleCount++ 
		new Toyota("Toyota"); //+1
		System.out.println(Vehicle.VehicleCount);//3
	 
		Vehicle.displayTotalVehicles(); //accessing static method, using class name. Static met belongs to the class and applicable to all objects!!!
		BMW.displayTotalVehicles(); //all static methods get inherited!!
	}

}
