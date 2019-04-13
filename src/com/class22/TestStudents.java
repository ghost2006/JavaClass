package com.class22;

public class TestStudents {

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

}
