package com.home;

public class Retiree extends Person{
	public String seniorActivity;
	
	public Retiree(String name, String lastName, int age, String seniorActivity) {
		 super(name, lastName, age);
		 this.seniorActivity=seniorActivity;
		 System.out.println(super.name+" "+super.lastName+" "+super.age+" "+seniorActivity);
	}
}
