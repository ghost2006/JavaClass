package com.class32;

public abstract class Insurance {
 /*Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance. 
  * Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute.
  * Create 3 objects of the sub classes and store them in ArrayList. Using 1 reference variable access methods from different classes. */
	
	public String insuranceName;
	
	public Insurance(String insuranceName) {
		this.insuranceName=insuranceName;
	}
	public abstract void getQuote();
	
	public abstract void cancelInsurance();
}

class Car extends Insurance{
	public  String carModel;
 
	public Car(String insuranceName, String carModel) {
		super(insuranceName);
		this.carModel=carModel;
	}
	@Override
	public void getQuote() {
	System.out.println("Car gets a Quote");
	}
	@Override
	public void cancelInsurance() {
		System.out.println("Car cancelInsurance");
	}	
}
class Pet extends Insurance{
 public String petType;
 
	public Pet(String insuranceName, String petType) {
		super(insuranceName);
		this.petType=petType;
	}
	@Override
	public void getQuote() {
		System.out.println("Pet gets a Quote");
	}
	@Override
	public void cancelInsurance() {
		System.out.println("Pet cancelInsurence");
	}
}
class Health extends Insurance{

	public Health(String insuranceName) {
		super(insuranceName);
	}
	@Override
	public void getQuote() {
		System.out.println("health gets a quote");
	}
	@Override
	public void cancelInsurance() {
		System.out.println("health cancelInsurence");
	}
	
}