package com.class22;

public class Students {

	/*Write a java program of Class Students that takes students name and 3 subject grades. 
	 * Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students with different marks. Your program should print an average mark of each students name.
	 * NOTE: please male different names for instance and local variables. */
	
	public String studentName;
	public int grade1, grade2, grade3;
	
	public Students(String name, int a, int b, int c){
		studentName= name;
		grade1=a;
		grade2=b;grade3=c;
	}
	public static void main(String[] args) {
		Students student1 =new Students("Anna",30,50,15);
		Students student2 =new Students("Bill", 35,68,13);
		Students student3 =new Students("John",30,59,13);
		Students student4 =new Students("Kelly", 0,0,15);
		Students student5 =new Students("Kristina", 30,0,45);
		
		student1.calculateAverageGrade();
		student2.calculateAverageGrade();
		student3.calculateAverageGrade();
		student4.calculateAverageGrade();
		student5.calculateAverageGrade();
		
	}
 public void calculateAverageGrade() {
	 int avarage=(grade1+grade2+grade3)/3;
	 System.out.println("My name is "+studentName + " and my average garde is "+avarage);
 }
}
