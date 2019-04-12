package com.class21;

public class Employee {

	public static String CEO="Sumair";
	int salary;
	int eID;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1= new Employee();
		emp1.salary=30000;
		emp1.eID= 2345;
		emp1.getEmployeeInfo();
		
		Employee emp2= new Employee();
		emp2.salary=25000;
		emp2.eID= 234895;
		CEO="Asel";
		emp2.getEmployeeInfo();
		emp1.getEmployeeInfo();
	}
 public void getEmployeeInfo() {
	 System.out.println("Employee's eID is "+eID+" and the salary is "+salary+ " the CEO is "+CEO);
 }
}
