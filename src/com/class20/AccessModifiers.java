package com.class20;
public class AccessModifiers {
public static void main(String []args) {
	
	Task2 obj=new Task2();
	obj.checkIfStringiIsPalindrome("madam");//accessing public method within same package
	
	obj.reverse("hello");//accessing protected method within same package
	
	obj.sayHello();//accessing default method within same package
	
	//obj.returnArray("Hello Students"); private method is not accessible
	
	
	
	System.out.println(obj.name1);//accessing default variable within same package
	
	System.out.println(obj.name2);//accessing protected variable within same package
	
	System.out.println(obj.name3);//accessing public variable within same package
}
}
	
	
