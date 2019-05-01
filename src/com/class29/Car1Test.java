package com.class29;

public class Car1Test {

	public static void main(String[] args) {
		
		Car1 car;
	  
		car = new Sedan1("blue", 25000, 3000);
		double carPrice1 = car.calculateSalePrice();
		System.out.println(carPrice1);

		car = new Truck1("blue", 25000, 3000);
		double carPrice = car.calculateSalePrice();
		System.out.println(carPrice);
			
	}

}
