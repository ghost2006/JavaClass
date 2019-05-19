package com.class32;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
public class HashSetTask {

	public static void main(String[] args) {
		// 3. Create an HashSet of cities and add duplicates into it.
				
		HashSet <String> cities=new HashSet<>();
		
		cities.add("London");
		cities.add("Madrid");
		cities.add("Porto");
		cities.add("Amsterdam");
		cities.add("Rome");
		cities.add("Berlin");
		System.out.println(cities.size()); //6
		System.out.println(cities);
		
		cities.add("Porto"); //adding duplicates
		cities.add("Rome");
		cities.add(""); //adding null
		System.out.println(cities.size()); //7
		
		// ● Retrieve all values from hashSet in 2 different ways
		
		//retrieving by using Advanced for loop
		for (String city:cities) {
			System.out.println(city);
		}
		
		//retrieving by using Iterator
		Iterator<String>it=cities.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		// ● Retrieve all values in alphabetical order
		//sorting of HashSet is not possible -->  the elements of the HashSet can be sorted indirectly by converting into List 
		
		List <String> convertedHashSet =new ArrayList<String>(cities); //new ArrayList<String>(cities) -- converting to List in order to use sort function
		System.out.println("Before sorting "+convertedHashSet);
		
		Collections.sort(convertedHashSet);
		System.out.println("HashSet elements in sorted (alphabetical) order by using List: "+ convertedHashSet); 
	    
	    
	    // Sorting HashSet using TreeSet 
        TreeSet<String> treeSet = new TreeSet<>(cities); 
  
        // Print the sorted elements of the HashSet 
        System.out.println("HashSet elements in sorted order using TreeSet: "+ treeSet); 
	}

}
