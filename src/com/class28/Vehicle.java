package com.class28;
public abstract class Vehicle {

	static int VehicleCount;
	
	Vehicle(){
		VehicleCount++;
	}
//	public abstract static void gps();--> can't have STATIC methods as ABSTRACT-->cause we can't override Static Methods!!!
//	private abstract static void speed(); can't inherit private methods, so ABSTRACT can't be as private
//	public abstract final void break(); --> can't override final methods-->so abstract can't be as final
	
	public abstract void start();
	public abstract void drive();
	public void stop() {
		System.out.println("Stop vehicle by pressing break");
	}
	public static void displayTotalVehicles() {
		System.out.println("Total vehicals we built = "+VehicleCount);
	}
}
abstract class Car extends Vehicle{
  /* Car(){
	 * super(); //by default compiler will create default constructor and by default inside of child constructor we call a parent class constructor
	 * }     */
	public String make;//instance variables are allowed in the abstract class
	//We can't create an Object of abstract class, but since we have an instance var inside the class we need someone to initialize them-->performed by constructor!!
	Car(String make){
		this.make=make;
	}
}
class BMW extends Car{ // java forces you to provide implementation only for abstract methods(start,drive)! but we can override the stop method
	/* BMW(){
	 * super(); //by default 
	 * }     */
	BMW(String make){
		super(make);
	}
	@Override
	public void start() {
	System.out.println("BMW car starts remote");
	}
	@Override
	public void drive() {
		System.out.println("BMW car drives fast");	
	}
}
class Toyota extends Car{
	Toyota(String make){
		super(make);
	}
	@Override
	public void start() {
		System.out.println("Toyota car starts with push button");
	}
	@Override
	public void drive() {
		System.out.println("Toyota car drives safe");	
	}
	
}