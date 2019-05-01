package com.class30;

import java.util.ArrayList;

public class Task1 {
	/*Create a generic ArrayList that will store 5 names into it. */

	public static void main(String[] args) {
		
		ArrayList<String>names=new ArrayList<String>();
		names.add("Maria");
		names.add("Elena");
		names.add("Sofia");
		names.add("Katerina");
		names.add("Carol");
		//names.add(123); not valid because of generic arrayList of a type of String
		
		//Find out whether the given ArrayList is empty or not?
		System.out.println(names.isEmpty());
		//Check whether the specific name is present in an ArrayList or not?
		System.out.println(names.contains("Sofia"));
		
		// Find the size of your arrayList and print all values from that 
		System.out.println(names.size());
		
		for (String name:names) {
			System.out.println(name);
		}
		
		for (int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
	}

}
