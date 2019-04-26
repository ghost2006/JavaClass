package com.class26;

public class ThisKeyword {

	int num1, num2; //num1=10; num2=20;

	ThisKeyword() {
		System.out.println("No parameters here");
	}

	ThisKeyword(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public void sum(int num1, int num2) {
		System.out.println("The sum of local variables = " + (num1 + num2)); //accessing local variables
		System.out.println("The sum of instance variables = " + (this.num1 + this.num2));//accessing instance variables
	}

	public static void main(String[] args) {
		
		ThisKeyword obj = new ThisKeyword(10, 20); //here we are not printing but only assigning the values for instances num1=10 and num2=20
		
		obj.sum(100, 200);//called method sum and printed 
		                 // 1.sum of 100+200
						//2. sum 10 and 20

		ThisKeyword obj1 = new ThisKeyword(); // No parameters here
		obj1.sum(12, 13); /* The sum of local variables = 25
                             The sum of instance variables = 0*/
		
	}
}
