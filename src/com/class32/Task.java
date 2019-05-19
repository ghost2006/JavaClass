package com.class32;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task {
// 1. Create an ArrayList of Strings and using Collections class sort the values of that ArrayList.

	public static void main(String[] args) {
		
		ArrayList<String> cities=new ArrayList<>();
		cities.add("Paris");
		cities.add("London");
		cities.add("Kyiv");
		cities.add("Moscow");
		cities.add("New York");
		cities.add("Tokio");
		
		System.out.println("Collection before sorting "+cities);
		
		Collections.sort(cities);
		System.out.println("Collection after sorting "+cities); // it'll sort in alphabetical order!
		
		// 2. Create an array of Strings and using Arrays class sort the values of that array of Strings.

		String [] arrayOfCities= {"Paris", "London", "Kyiv", "Moscow", "New York", "Tokio"};
		
		System.out.println("Array befor sorting");
		for (String ar:arrayOfCities) {
			System.out.print(ar+" ");
		} 
		
		Arrays.sort(arrayOfCities);
		
		System.out.println("Array after sorting");
		for (String ar:arrayOfCities) {
			System.out.print(ar+" ");
		}

}
}