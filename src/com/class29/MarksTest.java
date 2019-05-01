package com.class29;

public class MarksTest {
	
	 public static void main(String[] args) {
	       
		 Marks studentA = new StudentA(60, 80, 70);
		 System.out.println("The Percentage of student A is " + studentA.getPercentage() +"%");
		 
		 Marks studentB = new StudentB(80,100, 99, 98);
	     System.out.println("The Percentage of student B is " + studentB.getPercentage()+"%");
	        
  }
	
}
