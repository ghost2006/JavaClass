package com.class31;
import java.util.ArrayList;
import java.util.Iterator;
public class Recap {

	public static void main(String[] args) {
		 
		ArrayList<Integer> numbers= new ArrayList<Integer>();//generic-storing only homogeneous values
		numbers.add(12);//comes from collection
		numbers.add(0, 13);//specific to all list objects
		numbers.add(0, 14);
		System.out.println(numbers.size());
		System.out.println(numbers.get(2)); //12 has index 2 
		
		numbers.set(1, 33);
		System.out.println(numbers.get(1));
		
		System.out.println(numbers.contains(33)); // true--> contains number 33
		
		// 1.way using for loop
		for (int i=0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		// 2 way using advanced for loop
		for(Integer num:numbers) { // or for (Object num:numbers){
			System.out.println(num);
		}
		
		//3d way using advanced iterator --> a method applicable for all collections
		Iterator<Integer> it=numbers.iterator();// we can specify the type <>, or may not!!
		//hasNet(); next(); remove(); --> each class of collection can access these methods
		while(it.hasNext()) {
			//int number=it.next();//returns the object
			System.out.println(it.next());
		}
		
		// 4th way using while loop 
		int i=0;
		while(numbers.size()>i) {
			System.out.println(numbers.get(i));
			i++;
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}

