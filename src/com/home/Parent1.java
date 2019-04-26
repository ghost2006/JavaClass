package com.home;

	/*write the logic to perform the addition the parent variables, 
	 * class variables and local variables  
	 * for this in main method call the method which you created in the child class pass the parameters in method values as 50,60
Output:
110
70
30
	 * 
	 */
public class Parent1 {

	int a = 10;
	int b = 20;
}

class Child1 extends Parent1 {
	int a=30;
	int b=40;

//	Child1(int a, int b){ // a=30 and b=40
//		this.a = a;// we just assigned local variables
//		this.b = b;
//	}

	public void getAddition(int a, int b) { // should pass 50 and 60
		System.out.println(super.a + super.b); // "The sum of parent variables
		System.out.println(this.a + this.b);// The sum of instance variables
		System.out.println(a + b);// The sum of locaL variables

	}
}
