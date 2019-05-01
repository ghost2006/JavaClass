package com.class31;
import java.util.ArrayList;
import java.util.Iterator;
public class StudentTest {

	public static void main(String[] args) {
		
		Student st1=new Student("John", 101);
		st1.printStudentDetails(); // calling the method
		System.out.println(st1.name);// accessing the variable name
		
		Student st2=new Student("James",102);
		Student st3=new Student("Anna", 103);
		Student st4=new Student("Katy",104);
		
		ArrayList<Student>alist=new ArrayList<>();
		alist.add(st1);
		alist.add(st2);
		alist.add(st3);
		alist.add(st4);
		
		for (Student student:alist) {
			student.printStudentDetails(); // using our method inside of the loop
			System.out.println(student.name); // getting the name of each student inside of the loop
		}
		
		System.out.println("---Using an iterator---");		
		Iterator<Student>it=alist.iterator();
		while(it.hasNext()) {
		Student obj=it.next();
		obj.printStudentDetails();
		}
		
	}

}
