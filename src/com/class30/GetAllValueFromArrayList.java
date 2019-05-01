package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class GetAllValueFromArrayList {
	
	public static void main(String[] args) {
	
		ArrayList<String>names=new ArrayList<String>();
		names.add("Maria");
		names.add("Elena");
		names.add("Sofia");
		names.add("Katerina");
		names.add("Carol");
		
		System.out.println("--1st way - using For Loop--");
		for (int i=0; i< names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		System.out.println("--2d way - using Advanced For Loop--");
		for (Object name:names) {
			System.out.println(name);
		}	
		
		System.out.println("--3d way - using While Loop--");
		int i=0;
		while (names.size()>i) { 
		 System.out.println(names.get(i));
		 i++;
		}
		
	// 4th way - using special method- Iterator() method--will return 1 iterator object
		System.out.println("--4th way - using Iterator--");	
		
	Iterator <String> it=names.iterator(); // 1st - we have to import the Iterator class from java.util.Iterator, which is available only for Collections!!
	//goes inside of our collection and check if it has any elements
		while (it.hasNext()) { // while it's true --> print me the next element
			System.out.println(it.next());
		}
		
		/* Iterator's methods:
		 *  public boolean hasNext() – It returns true if iterator has more elements.
        
         *  public object next() – It returns the element and moves the cursor pointer to the next element.
     
         *  public void remove() – It removes the last elements returned by the iterator.*/
		
			
		
		
		
		
		
}
}
