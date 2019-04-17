package com.class22;

public class Task1 {
	
	/*Write a program that will have a constructor: one with parameters and second without any parameters.
	 *  Create a separate Test class where you will execute both of the constructors.*/

	public static String breed="Husky";
	public String name;
	public String color;
	public int weight;
	
	Task1( String a, String b, int c){
		name=a; 
		color=b;
		weight=c;
	}
	
	Task1 (){
		System.out.println("I am a constructor without any parameter");
	}
	
	public static void main(String[] args) {
		
	}
	public void getInfo() {
		System.out.println("I am a "+ breed+" and my name is "+name+ " my color is "+ color+ " my weight is "+weight);
	}
}
