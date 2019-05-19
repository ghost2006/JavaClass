package com.class34;

public class Car {

	public String model;
	public String make;

	public Car(String model, String make) {
		this.model= model;
		this.make=make;
	}
	
	public void printCarDetails() {
		System.out.println("Make is "+make+ " and model is "+ model); 
		// have access for static & non static instances!!! if method static can't access Non static Variables!
	}
}
