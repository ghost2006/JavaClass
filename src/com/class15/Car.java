package com.class15;

public class Car {
//class consists of attributes and actions/behaviours!
	//first features/attributes
	String make,model, color;
	int door, wheels;
	//then actions-Methods
	public static void main(String[] args) {
		//need to create the object
		// ClassName variableName = new ClassName();
		Car car1= new Car();// we specified our class
   //type-car	  the object of the class new Car()
		
		
	car1.make= "Honda";
	car1.model="Civic";
	car1.color="black";
	car1.door=4;
	car1.wheels=4; //we created the objects using features;
	// car honda has 4wheels
	System.out.println("Car "+car1.make+ " has "+car1.wheels+ " wheels");//to access the attribute/behaviour of our object we should use our object variable and its attribute
	//define behaviour
	car1.drive();// it goes inside of the M drive -execute it and print the syso message-line 47!!
	car1.reverse();
	car1.stop();
	
System.out.println("---------Second object-----------");	
//2 object
	Car car2=new Car();
	car2.make="Tesla";
	car2.model="X";
	car2.color="blue";
	car2.door=4;
	car2.wheels=4;
	
	//My car is blue Tesla
	System.out.println("My car is " +car2.color+ " "+car2.make);
	car2.drive();
	car2.reverse();
	car2.stop();
	}
	
	// how we create our methods(behav.)1. void-->name of M starts with lower case and then body()
	
	void drive() {
		System.out.println("Car can drive");
	}
	void reverse() {
		System.out.println("Car can reverse");
	}
	void stop() {
		System.out.println("Car can stop");
	}
}
