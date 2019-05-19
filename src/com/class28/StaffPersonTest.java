package com.class28;

public class StaffPersonTest {

	public static void main(String[] args) {
	
		Proffesor obj1=new Proffesor("Bob","177 Greenary Ln", 20000, "01.09.2015","IT",23845797);
		Proffesor obj2=new Proffesor("John", "177 Greenary Ln",22000, "01.11.2018","IT", 73878368);
		Proffesor obj3=new Proffesor("Emily","177 Greenary Ln", 18000, "01.03.2012","IT",23845797);

		Secretary obj4=new Secretary("Lili","177 Greenary Ln",19000, "12.31.2017", "ET",23845797);
		Secretary obj5=new Secretary("Mona","177 Greenary Ln", 19000,"10.01.2015","ET",23845797);
		
		System.out.println("The total salary of the StaffPerson department is "+(obj1.salary+obj2.salary+obj3.salary+obj4.salary+obj5.salary));
		
		//OR using method getSalary()
		System.out.println("The total salary of the StaffPerson department is "+(obj1.getSalary()+obj2.getSalary()+obj3.getSalary()+obj4.getSalary()+obj5.getSalary()));
		
		
	}

}
