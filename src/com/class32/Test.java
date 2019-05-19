package com.class32;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
public class Test {

	public static void main(String[] args) {
		
		HashSet <String> cities=new HashSet<>();
		
		cities.add("London");
		cities.add("Madrid");
		cities.add("Porto");
		cities.add("Amsterdam");
		cities.add("Rome");
		cities.add("Berlin");
		System.out.println(cities.size()); //6
		
		cities.add("Porto"); //adding duplicates
		cities.add("Rome");
		cities.add(" "); //adding null
		System.out.println(cities.size()); //7
		
		//cities.removeAll(cities); --> deletes all the elements of the specified collection 'cities'--> it'll print []
		//cities.clear(); --> removes the total # of element from the collection []
	
		// Converting a HashSet to an Array
		System.out.println("---Using Loop---");
		
		String [] ar=new String[cities.size()]; //created a new array of the hashSet size
		
		int i=0;
		for (String city : cities) { //adding hashSet elements to an array!!!!!
			ar[i]=city;
			i++;
		}
		// retrieving all elements using loops
		for (String city: ar) {
			System.out.println(city);
		} //or
		for (int j=0; j<ar.length; j++) {
			System.out.println(ar[j]);
		}
		
		System.out.println("---Using method toArray(arrayName)---");
	
		String[] array = new String[cities.size()]; //created a new array of the hashSet size
		
	     cities.toArray(array); //using method '.toArray(arr.name)' that returns an array containing all of the elements in this set
	  
	     System.out.println("Array elements: ");
	     for(String temp : array){
	        System.out.println(temp);
	     }
		
   }
		
}


