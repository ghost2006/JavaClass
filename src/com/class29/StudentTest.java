package com.class29;

public class StudentTest {

	public static void main(String[] args) {
		
		Student obj=new Student();
		
		obj.setName("Alex");
		obj.setAge(17);
		
		System.out.println(obj.getName()+" and his age is "+obj.getage()); //alex and 0--> it's less than 18, we won't be able to initialize our variable
	}

}
