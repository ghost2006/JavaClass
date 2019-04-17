package com.class21;

public class InstanceVariables {

	protected String name="John";// instance var-global can have access modifiers// instance has blue color
	
	public static void main(String[] args) {
		String name="Anna";
		System.out.println(name);//anna. local var has purple color
		System.out.println("---Changing value of local var---");
		name="Olga";
		System.out.println(name);//olga
						
// creating 1st obj
		InstanceVariables obj=new InstanceVariables();
		System.out.println(obj.name);//john
		System.out.println("---Changing value of instance var---");
		obj.name="Jack";
		System.out.println(obj.name);//jack
								
// creating 2d obj
		InstanceVariables obj1=new InstanceVariables();
		System.out.println(obj1.name);//john
		
	}
	public void hello() {
	System.out.println("Hello "+name); //referring to john our global var
}
}
