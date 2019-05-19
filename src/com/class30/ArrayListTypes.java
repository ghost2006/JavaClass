package com.class30;

import java.util.ArrayList;

public class ArrayListTypes {

	public static void main(String[] args) {
		
		//generic array that stores only string objects
		ArrayList<String>names=new ArrayList<String>(); //here we define the type of our objects- Strings
		names.add("Maria");
		names.add("Elena");
		names.add("Sofia");
		names.add("Katerina");
		names.add("Carol");
		//names.add(123); not valid because of generic arrayList of a type of String
		
		//non generic arrayList can store different types of Objects
		ArrayList alist=new ArrayList(); //by default it'll be accepting objects of any type
		alist.add("String"); // object of String type
		alist.add(100); //object of Integer
		alist.add(100.10);
		alist.add(true);
		alist.add('a');//Character
		
// type of Object!		
		for(Object value:alist) {
			System.out.println(value);
		}
	
		ArrayList <Boolean> booleanArrayList=new ArrayList(); //generic type-cause we specified the type of objects <Boolean>
		booleanArrayList.add(true);
		booleanArrayList.add(false);
		
		for (Object val:booleanArrayList){
			System.out.println(val);
		}
	}
		

}
