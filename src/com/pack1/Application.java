package com.pack1;

public class Application {

	public static void main(String[] args) {
		
		Human person1 =new Human();//created obj of the class human
			
		person1.print();
		person1.eyeColour="pink";
		
		person1.print();
		
			System.out.println(person1.eyeColour);//pink
			System.out.println(person1.height);
			System.out.println(person1.weight);
			System.out.println(person1.gender);//we'll get the exact values of the variables initialized in class Human
		
			Human person2 =new Human();//created obj of the class human
			
			person2.eyeColour="orange";
			person2.print();
			
				System.out.println(person2.eyeColour); //orange
				System.out.println(person2.height);
				System.out.println(person2.weight);
				System.out.println(person2.gender);
			}
		}




