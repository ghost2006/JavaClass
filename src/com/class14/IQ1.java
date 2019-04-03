package com.class14;

public class IQ1 {

	public static void main(String[] args) {
	 //1. Write a program to swap 2 numbers without a temporary variable? 

		int a=10; 
		int b=20;
		a=a+b;//30
		b=a-b;//10
		a=a-b;//20
		
		System.out.println(a);
		System.out.println(b);

//1. Write a program to swap 2 String without a temporary variable? 
		
		String str1= "hello";
		String str2="world"; //5
		
		str1=str1+str2;//"helloworld"--10
		str2=str1.substring(0, str1.length()-str2.length());//hello
		str1=str1.substring(str2.length());
		System.out.println("the value of str1 "+ str1 + " and the value of str2 " +str2);
		
// 2d Way	
		String st1= "hello";
		String st2="world"; //5
		
		st1=st1+st2;// helloworld
		
        st2=st1.replaceAll(st2,"");//world
        st1=st1.replaceAll(st2, "");
       
        System.out.println("the value of str1 "+ st1);
        System.out.println("the value of str2 "+ st2);
        System.out.println("the value of str1 "+ st1 + " and the value of str2 " +st2);
        
        
	}

}
