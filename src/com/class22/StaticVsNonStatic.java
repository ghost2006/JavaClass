package com.class22;

public class StaticVsNonStatic {

	public String name= "John";// instance
	public static String lastName="Snow"; //static
	
	public static void main(String[] args) {
		
		StaticVsNonStatic obj=new StaticVsNonStatic();
		obj.getInfo();
		
		getInfo1();// calling a static M  -> within same class we can call it by using method/var name
		System.out.println(lastName);
		System.out.println(obj.name);
	}
	public void getInfo() { // non static M can access both instance and static variables!!
	System.out.println("My name is "+ name+ " my last name is "+ lastName);
	//getInfo1(); we can access static M within non static!!
}
	public static void getInfo1() { //static M has access only to STATIC variables!!!!
		//System.out.println("My name is "+ name+ " my last name is "+ lastName); --> get an error--> Cannot make a static reference to the non-static field name
		System.out.println("I am a static Method");
		// getInfo();we can not access non static M within static!!
	}
	
	
	
	
}
