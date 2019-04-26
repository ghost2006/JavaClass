package com.class27;

public class Student {
	
	/*Write program as a student class  that has instance variables name and address. 
	Create a constructor that will initialize those variables. 
	Print name & address of given  student by the displayInfo method.*/
	
	String name;
	String adress;
	
	Student (String name, String adress) {
		this.name=name;
		this.adress=adress;
	}	
		
	public void displayInfo() {
			System.out.println("Student name is "+name+" and his adress is "+adress);
		}
	public static void main(String[] args) {
		Student obj=new Student("John Murphy", "177 Halpine road, Rockville, MD");
		obj.displayInfo();
	}
	}
	
	
	
	

