package com.class24;

public class TestEmployees {
	
	public static void main(String[] args) {
		
		
	Employee emp =new Employee();
	FulltimeEmployee ft=new FulltimeEmployee();
	Contructor contructor=new Contructor();
	
	emp.getPaid(); //Employee gets paid
	ft.getPaid(); //Full time employee gets paid salary and bonus
	contructor.getPaid();//Constructor gets paid hourly
}
}