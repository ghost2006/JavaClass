package com.class15;

public class Dog {

	String breed, fur, size;
	
	public static void main(String[] args) {
		
		Dog dog1=new Dog();
		
		dog1.breed="Husky";
		dog1.fur= "long";
		dog1.size="medium";
		
		
		Dog dog2=new Dog();
		
		dog2.breed="Buldog";
		dog2.fur= "short";
		dog2.size="medium";
		
		Dog dog3=new Dog();
		
		dog3.breed="Labraqdor";
		dog3.fur= "short";
		dog3.size="large";
	
	}
	void Jump() {
		System.out.println(breed+ " can jump");
	}
	void Bark() {
		System.out.println(breed+ " can bark loudly");
	}
	void Play() {
		System.out.println(breed +" can play with us");
	}
}
