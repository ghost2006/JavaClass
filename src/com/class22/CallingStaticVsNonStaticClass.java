package com.class22;

public class CallingStaticVsNonStaticClass {

	public static void main(String[] args) {
		
		StaticVsNonStatic obj=new StaticVsNonStatic();//it's referencing the obj of the class StaticVsNonStatic
		
		//accessing non static members using obj
		System.out.println(obj.name);
		obj.getInfo();
		
		//accessing static members by using ClassName they belong to!
		StaticVsNonStatic.getInfo1();// static M
		System.out.println(StaticVsNonStatic.lastName);// access static members by using class name they belong to!!!
	}

}
