package com.class33;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RetrieveOneValueOfSet {

	public static void main(String[] args) {

		Set<String>cars=new LinkedHashSet<>();
		
		cars.add("Toyota");
		cars.add("Honda");
		cars.add("Audi");
		cars.add("BMW");
		cars.add("Ford");
		
		// 1 way to access one value -convert to the ArrayList 
		//a. add collection into ArrayList by passing collection into Constructor of out list
	
		List<String>list=new ArrayList<>(cars); //()-constructor
		System.out.println("List collection:" +list);
		System.out.println(list.get(2)); // getting one value from HashSet, which doesn't have indexes
		
		// b. we add the entire collection into ArrayList using method addAll();
		List<String>list2=new ArrayList<>();
		list2.addAll(cars);
		list2.add("Ford");
		System.out.println("List2 collection:" + list2);
		
		//2 way convert to Array
		Object[] array=cars.toArray(); // using method toArray[] --> returns the object
		System.out.println(array[1]);
		
	}

}
