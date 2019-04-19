package com.class25;

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal obj=new Monkey();// we are not overriding static methods--but we'll achieve only method hiding!!
		obj.whoAmI();//I am an animal (parent's method) --> it's method hiding!
		

	}

}
