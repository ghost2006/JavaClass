package com.class32;

import java.util.*;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet <String> cities=new TreeSet<>();// TreeSet sorts the elements in ascending (alphabetical) order.
		cities.add("London");
		cities.add("Madrid");
		cities.add("Porto");
		cities.add("Porto");// dosn't store duplicate elements!!
		cities.add("Amsterdam");
		cities.add("Rome");
		cities.add("Berlin");
		cities.add("Berlin");
		System.out.println(cities.size()); //6 
		
		System.out.println(cities);// [Amsterdam, Berlin, London, Madrid, Porto, Rome]

		TreeSet<Integer> set = new TreeSet<Integer>();
		
		    set.add(99);
		    set.add(7);
		    set.add(0);
		    set.add(67);
		    set.add(89);
		    set.add(66);
		    System.out.println(set); //[0, 7, 66, 67, 89, 99]
		    
		    System.out.println(set.descendingSet());// [99, 89, 67, 66, 7, 0] Returns a reverse order view of the elements contained in this set. 
	}

}
