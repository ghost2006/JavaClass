package com.class29;

public class Car1 {

	double carPrice;
	String color;

	public Car1(String color, double carPrice) { // using constructor to initialize the instances
		this.color = color;
		this.carPrice = carPrice;
	}

	public double calculateSalePrice() {
		return carPrice;
	}
}

class Truck1 extends Car1 {
	int weight;

	public Truck1(String color, double carPrice, int weight) {
		super(color, carPrice); // super() has to be our First line inside the constructor!!!!
		this.weight = weight;
	}

	public double calculateSalePrice() {
		if (weight > 2000) {
			carPrice -= carPrice * 0.1;
		} else {
			carPrice -= carPrice * 0.2;
		}
		return carPrice;
	}
}

class Sedan1 extends Car1 {
	int length;

	public Sedan1(String color, double carPrice, int length) {
		super(color, carPrice);
		this.length = length;
	}

	public double calculateSalePrice() {
		if (length > 20) {
			carPrice -= carPrice * 0.05;
		} else {
			carPrice -= carPrice * 0.1;
		}
		return carPrice;

	}
}