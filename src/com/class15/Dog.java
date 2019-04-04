package com.class15;

public class Dog {

	String breed, colorOfEyes, size;
	
	public static void main(String[] args) {
		
		Dog dog1=new Dog();
		
		dog1.breed="Husky";
		dog1.colorOfEyes= "blue";
		dog1.size="medium";
		dog1.Jump();
		dog1.Bark();
		dog1.Play();
		
		Dog dog2=new Dog();
		
		dog2.breed="Buldog";
		dog2.colorOfEyes= "yellow";
		dog2.size="medium";
		dog2.Jump();
		dog2.Bark();
		dog2.Play(); 
		
		Dog dog3=new Dog();
		
		dog3.breed="Labrador";
		dog3.colorOfEyes= "brown";
		dog3.size="large";
		dog3.Jump();
		dog3.Bark();
		dog3.Play();
		
	}
	void Jump() {
		System.out.println(breed+ " can jump");
	}
	void Bark() {
		System.out.println(breed+ " can bark loudly");
	}
	void Play() {
		System.out.println(breed +" can play with kids");
	}
}
