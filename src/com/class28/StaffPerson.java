package com.class28;

public abstract class StaffPerson {
	/* A university department consists of professors and secretaries. Each professor and each secretary has a name, a salary, and a hire date. 
	 * Use inheritance and polymorphism to create an application that represents the department and its professors and secretaries as objects, 
	 * and provides a test class that creates 3 professors and 2 secretaries, and then outputs the combined total of all of their salaries. */
 
	public String name;      //we can't do an Interface, cause we have instance variables!!! --> abstract class
	public String adress;
	public int salary;
	public String hireDate;
	public String department;
	public int tellNumber;
	
	public abstract String getName();
	public abstract String adress();
	public abstract int getSalary();
	public abstract String getHireDate();
	public abstract String department();
	
	public StaffPerson(String name, String adress, int salary, String hireDate, String department, int tellNumber) {
		super();
		this.name = name;
		this.adress = adress;
		this.salary = salary;
		this.hireDate = hireDate;
		this.department = department;
		this.tellNumber = tellNumber;
	}	
}

class Proffesor extends StaffPerson{
	public Proffesor(String name, String adress, int salary, String hireDate, String department, int tellNumber) {
		super(name, adress, salary, hireDate, department, tellNumber);
	}
	@Override
	public String getName() {
		return super.name;
	}
	@Override
	public String adress() {
		return super.adress;
	}
	@Override
	public int getSalary() {
		return super.salary;
	}
	@Override
	public String getHireDate() {
		return super.hireDate;
	}
	@Override
	public String department() {
		return super.department;
	}	
}

class Secretary extends StaffPerson{
	public Secretary(String name, String adress, int salary, String hireDate, String department, int tellNumber) {
		super(name, adress, salary, hireDate, department, tellNumber);
	}
	@Override
	public String getName() {
		return super.name;
	}
	@Override
	public String adress() {
		return super.adress;
	}
	@Override
	public int getSalary() {
		return super.salary;
	}
	@Override
	public String getHireDate() { 
		return super.hireDate;
	}
	@Override
	public String department() {
		return super.department;
	}
	
}