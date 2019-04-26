package com.class26;

public class Car {

	public void drive() {
		System.out.println("Car drives");
	}
	public void drive(int speed) { //overloading method DRIVE
		System.out.println(" Car drives with speed "+speed);
	}
}

class BMW extends Car{
	public void drive() {
		System.out.println("BMW car drives fast");
	}
}

class Toyota extends Car{
	public void drive() {
		System.out.println("Toyota drives safe");
	}
}
