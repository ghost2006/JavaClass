package com.class29;

public class CarTest {

	
	public static void main(String[] args) {
       
		Sedan sedan = new Sedan();
		
		sedan.carPrice = 30000;
		sedan.length = 30;
		System.out.println("The price of sedan is "+ sedan.calculateSalePrice());
		
        
		Truck truck = new Truck();
		
        truck.weight = 400;
        truck.carPrice = 60000;
        System.out.println("The price of truck is " + truck.calculateSalePrice());
    }
}
