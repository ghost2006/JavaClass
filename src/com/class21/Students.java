package com.class21;

public class Students {

	public String studentName;
	public int studentID;
	public static int numberOfStudents; //0
	
	public static void main(String[] args) {
		/* Create a Class called Students
		 * Create three  variables  studentName , studentID  and  numberOfStudents
		 * Create three objects of the Students Class
		 * Set the value for  studentName , studentID and increment  the numberOfStudents for each object
		 * Print out  total number of students*/
		
		Students student1=new Students();
		student1.studentName= "John";
		student1.studentID=123456;
		numberOfStudents++;
		
		Students student2=new Students();
		student2.studentName= "Douglaa";
		student2.studentID=123465;
		Students.numberOfStudents++;
		
		Students student3=new Students();
		student3.studentName= "Bill";
		student3.studentID=123467;
		student3.numberOfStudents++;
		
		System.out.println("The total number of students is "+numberOfStudents);
	}
}
