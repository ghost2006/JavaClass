package com.class30;

import java.util.ArrayList;

public class IntegerArrayList {

	public static void main(String[] args) {
		
		ArrayList <Integer> numbers=new ArrayList<Integer>();
	           // <Integer> is our wrapper integer class	
		
		numbers.add(10); //adding our objects to the collection
		numbers.add(20);
		numbers.add(33);
		numbers.add(100);
	
	//to change the value of 3d element-->use method 'set'
		numbers.set (2,          333);
	//  	 index of element, new value

		for (int num:numbers) { // or for(Integer num:numbers){ it'll work both ways cause of unboxing
			System.out.println(num);
		}
	}

}
