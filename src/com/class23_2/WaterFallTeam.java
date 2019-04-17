package com.class23_2;

import com.class23.Employee;

public class WaterFallTeam extends Employee{ // have to import the class Employee

	public static void main(String[] args) {
		
		//trying to access our variables
		WaterFallTeam wt=new WaterFallTeam();
		
		wt.salary1=90000;// can access protected values from different packages ONLY through inheritance
		
		//wt.salary-->  can't be accessed this instance in different package, cause it's default
		
		// Employee.workDEFAULT(); giving the error when M is default,  it's NOT available for us
		
		Employee.workPROTECTED();// can access protected M, it's available for us
		Employee.work();
	}
}
