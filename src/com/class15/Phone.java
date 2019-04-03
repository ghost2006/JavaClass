package com.class15;

public class Phone {

	Boolean camera, keyboard;
	int screenSize;
	String brand, color; 
	
	public static void  main (String [] args) {
		Phone ph1 = new Phone();	
		
		ph1.brand= "Iphone";
		ph1.keyboard= false;
		ph1.camera=true;
		ph1.screenSize= 5;
		ph1.color= "golden";
		
		ph1.call();
		ph1.sendMessage();
		ph1.takeApicture();
		
       Phone ph2 = new Phone();	
		
		ph2.brand= "Nokia";
		ph2.keyboard= true;
		ph2.camera=true;
		ph2.screenSize= 4;
		ph2.color= "black";
		
		ph2.call();
		ph2.sendMessage();
		ph2.takeApicture();
		Phone ph3 = new Phone();	
		
		ph3.brand= "Pixel";
		ph3.keyboard= false;
		ph3.camera=true;
		ph3.screenSize= 5;
		ph3.color= "pink";
		
		ph3.call();
		ph3.sendMessage();
		ph3.takeApicture();
}
	void call() {
		System.out.println("We can use our phone " +brand+ " to call");
	}
	void sendMessage() {
		System.out.println("We can send messages from our " +brand);
	}
	void takeApicture() {
		System.out.println("Wecan take pictures on our "+brand+ "'s camers");
	}
}