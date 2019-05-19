package com.class32;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class CollectionsClass {

	public static void main(String[] args) {
		
		ArrayList<Integer> integerList=new ArrayList<>();
		integerList.add(90);
		integerList.add(33);
		integerList.add(56);
		integerList.add(100);
		
		System.out.println("Collection before sorting "+integerList);
		Collections.sort(integerList);//'Collections' - utility class that works with Collections (List, Set, QUEUE)
//Utility class will have only static methods and you cannot create an Object(cannot instantiate because it has private constructor)
		
		System.out.println("Collection after sorting " +integerList);
		
		int [] integerArray= {12,67,989,1};
		System.out.println("Array before sorting");
		for (int num:integerArray) {
			System.out.print(num+" ");
		} 
		
		Arrays.sort(integerArray); // 'Arrays' our utility class, that have a static methods //This class contains various methods for manipulating arrays
// can use sort method for arrays to find the largest or min number in our array
		
		System.out.println("array after sorting");
		for (int num:integerArray) {
			System.out.print(num+" ");
		}
	}

}
