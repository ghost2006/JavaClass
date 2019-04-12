package com.class21;

public class Dog {

	static String breed="Husky";//static var--class var - type of global-inside the class but outside the M
	static int paws=4;
	String name;
	int weight;
	int height;
	
	public static void main(String[] args) {
	
		Dog dog1=new Dog();
		Dog dog2=new Dog();
		Dog dog3=new Dog();
	//1st dog
		dog1.name="Mardy";
		dog1.weight=60;
		dog1.height=40;
		dog1.getDogProperties();
	//2st dog
		dog2.name="Waffle";
		dog2.weight=100;
		dog2.height=90;
		dog2.getDogProperties();
	//3st dog
		breed="Pug";
		dog3.name="Lucy";
		dog3.weight=20;
		dog3.height=30;
		dog3.getDogProperties();
		
		dog1.getDogProperties();//affected the breed of 1st and 2 dogs by changing the breed of 3d one
		dog2.getDogProperties();
	//3 ways how to access the static var	
		System.out.println(breed);//access by it's name
		System.out.println(Dog.breed);//access by class's name
		System.out.println(dog3.breed);//access by obj reference,-->not preferred--giving the warning-->The static field Dog.breed should be accessed in a static way
		
	}
	public void getDogProperties() {
		System.out.println(name+" is a breed of "+breed+" her weight is "+weight+ " and height is "+height);
	}
}
