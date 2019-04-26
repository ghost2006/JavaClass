package com.class26;

public class Task {
	/* 1. Create a class in which you will have overloaded constructors. 
	 * Create and instance of the class that will execute both constructors. */
	
	int num1; int num2;
	String str;
	
	Task(){
		System.out.println("Constructor without any parameter");
	}  
	
	Task(int num1){
		this();
		this.num1=num1;
		System.out.println("Constructor with 1 int parameter "+num1);
	}
	
	Task(int num1, int num2){
		this(num1,"a");
		this.num1=num1;
		this.num2=num2;
		System.out.println("Constructor with 2 parameters "+num1+" , "+num2);
	}
	
	Task(int num2, String str){
		this(num2);
		this.num2=num2;
		this.str=str;
		System.out.println("Constructor with 2 parameters "+num2+" , "+str);
	}

	public static void main(String[] args) {
		Task obj=new Task(1);
		
		Task obj1=new Task(8,11);
		
		Task obj2=new Task (8, "String");
	}
}
