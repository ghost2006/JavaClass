package com.class31;
import java.util.ArrayList;
import java.util.Iterator;
public class Student1Test {

	public static void main(String[] args) {
		 
		ArrayList<Student1> al=new ArrayList<Student1>();
		
		Student1 obj=new Student1(11,"Mike",18);  //		al.add(new Student1(12,"Seana",23));
		Student1 obj1=new Student1(16,"Kate",28);
		Student1 obj2=new Student1(13,"Mila",21); //		al.add(new Student1(13, "Anna",28));
		al.add(obj);
		al.add(obj1);
		al.add(obj2);
	
		System.out.println(al.size());//3
		
		System.out.println(obj.roll_num+" "+obj.name+" "+obj.age);
		System.out.println(obj1.roll_num+" "+obj1.name+" "+obj1.age);
		System.out.println(obj2.roll_num+" "+obj2.name+" "+obj2.age);
		
		System.out.println(al.get(0).name);
		System.out.println(al.get(0).age);
		System.out.println(al.get(0).roll_num);
		
		obj.printAge();

		for (Student1 student:al) { //
			System.out.println(student.roll_num+" "+student.name+" "+student.age);; // getting the info of each student inside of the loop
		}
		
		Iterator<Student1> it=al.iterator();
		while(it.hasNext()) {
			Student1 student=it.next();
			System.out.println(student.roll_num+" "+student.name+" "+student.age); 
			student.printAge();
		}
	}

}
