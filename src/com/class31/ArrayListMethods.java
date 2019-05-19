package com.class31;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ArrayListMethods {

	public static void main(String[] args) {
		//Creating an ArrayList from another collection
		List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);

        // Creating an ArrayList from another collection
        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);

        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);

        // Adding an entire collection to an ArrayList
        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);

        System.out.println(firstTenPrimeNumbers);
//-------------------------------------------------------------------------------------------------------------------------------------------------------------
/*Check if an ArrayList contains a given element.  Find the index of the first occurrence of an element in an ArrayList | indexOf()
 * Find the index of the last occurrence of an element in an ArrayList  */
	
        List<String> names = new ArrayList<>();
     names.add("John");
     names.add("Alice");
     names.add("Bob");
     names.add("Steve");
     names.add("John");
     names.add("Steve");
     names.add("Maria");

     // Check if an ArrayList contains a given element
     System.out.println("Does names array contain \"Bob\"? : " + names.contains("Bob"));

     // Find the index of the first occurrence of an element in an ArrayList
     System.out.println("indexOf \"Steve\": " + names.indexOf("Steve"));
     System.out.println("indexOf \"Mark\": " + names.indexOf("Mark")); //-1 if we doesn't have this element

     // Find the index of the last occurrence of an element in an ArrayList --> using method lastIndexOf()
     System.out.println("lastIndexOf \"John\" : " + names.lastIndexOf("John")); 
     System.out.println("lastIndexOf \"Bill\" : " + names.lastIndexOf("Bill"));
     
/* Sort an ArrayList using Collections.sort() method-----------------------------------------------------------------------------------------------*/
     
     List<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(7);
        numbers.add(18);
        numbers.add(5);
        numbers.add(2);

        System.out.println("Before : " + numbers);

        // Sorting an ArrayList using Collections.sort() method
        Collections.sort(numbers); //have to import Collections 

        System.out.println("After : " + numbers);
 }
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	


