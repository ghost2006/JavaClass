package com.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class EncapStaffPersonTest {
	
	    public static void main(String[] args) {

	        ArrayList<StaffPerson1> department = new ArrayList(); //created an ArrayList to add all our objects of two classes

	        department.add(new Professor("John Snow", "123 abs st", 9600, "Benz", "12/10/2010", 1234567878));// added our objects of professor class
	        department.add(new Professor("Arias Snow", "123 abs st", 9600, "Benz", "12/10/2010", 1234567878));
	        department.add(new Professor("Tom Snow", "123 abs st", 9600, "Benz", "12/10/2010", 1234567878));

	        department.add(new Secretary1("Anna Snow", "123 abs st", 9600, "Benz", "12/10/2010", 1234567878));//added our objects of secretary class
	        department.add(new Secretary1("More Snow", "123 abs st", 9600, "Benz", "12/10/2010", 1234567878));

//	        System.out.println("Accessing the salary of all department using Iterator");
//	        Iterator<StaffPerson1> it = department.iterator(); //using iterator 

	        double departmentSalary = 0;

//	        while (it.hasNext()) {
//	            departmentSalary += it.next().getSalary();
//	        }
	        
	        System.out.println("Accseesing the salary of all department using Advanced for loop");
 // or using Advanced for loop	        
	        
	        for (StaffPerson1 abc : department) {
	            departmentSalary += abc.getSalary(); //calling our getter getSalary
	        }

	        System.out.println("Department salary total = " + (departmentSalary));

	    }

	
}
