package com.class15;

public class Computer {

	Boolean mouse, keyboard;
	int screen, ram;
	String os,brand;  //we declare our variables
	public static void  main (String [] args) {
		
		Computer comp1 = new Computer();
		comp1.keyboard=true;
		comp1.mouse=true;
		comp1.screen=2;
		comp1.ram=8;
		comp1.os= "Windows";
		comp1.brand= "HP";
				
		comp1.watchMovie();  //define the behavior of our object
		comp1.doJavaCoding();
		comp1.playMusic();
		
		System.out.println("--------Second object-------");	
		Computer comp2 = new Computer();  //creating the object of computer class
		comp2.keyboard=false; //creating the attributes
		comp2.mouse=false;//can call them as state, fields or attribute
		comp2.screen=4;
		comp2.ram=6;
		comp2.os= "Mac OS";
		comp2.brand="Apple";
		
		comp2.watchMovie();  //define the behavior of our object
		comp2.doJavaCoding(); // when we calling our M it will execute it and print our statement!
		comp2.playMusic();
	
	}
	
	void watchMovie() {
		System.out.println("We can watch movie on a computer "+brand); // it's executable only if we have our main method!!! without it it's only readable!!
	}
	void doJavaCoding() {
		System.out.println("We can do Java coding on our computer "+brand);// we added the brand to specify the brand of our object
	}
	void playMusic() {
		System.out.println("We can play music on our computer "+brand);
	}
}
