package com.class31;
import java.util.ArrayList;
import java.util.Iterator;
public class IteratorRemove {

	public static void main(String[] args) {
		// let's create an ArrayList of ints of 1-10. remove all odds using iterator
		 
		ArrayList <Integer>alist=new ArrayList<>();
		for (int i=1; i<=10; i++) {
			alist.add(i);
		}
		System.out.println(alist);
		
		Iterator <Integer> iterator=alist.iterator(); //ctrl+ shift+ o --> to import the iterator
		
		while(iterator.hasNext()) {
			int number=iterator.next();
			if(number%2!=0) {
				iterator.remove(); //removes all odd values
			}
		}
		System.out.println(alist);
	}

}
