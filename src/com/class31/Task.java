package com.class31;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task {

	public static void main(String[] args) {
		/* 1.Create an arrayList of cars and retrieve all the values using 4 different ways.*/
	
		ArrayList<String>cars=new ArrayList<String>();
		 cars.add("Toyota");
		 cars.add("BMW");
		 cars.add("Honda");
		 
		 for(Object car:cars) {
			 System.out.println(car);
		 }
		 
		 for( int i=0; i<cars.size(); i++) {
			 System.out.println(cars.get(i));
		 }
		 
		 int i=0;
		 while(cars.size()>i) {
			 System.out.println(cars.get(i));
			 i++;
		 }
		 
		 Iterator it=cars.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		 
		// 2.Create an arrayList of words. Remove every word that ends with “e”.	 
		  ArrayList<String>words=new ArrayList<String>();
		  words.add("Hello");
		  words.add("Bye");
		  words.add("How are you");
		  	
		  Iterator<String> iterator=words.iterator();
		  while (iterator.hasNext()) {
			  String str=iterator.next();
			if (str.endsWith("e")) {
				  iterator.remove();
			  }
		  }
		  System.out.println(words);
		 
		// 3.Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.*/
		   ArrayList <String>drinks=new ArrayList<>();
		   drinks.add("Coffee");
		   drinks.add("Tea");
		   drinks.add("Water");
		   drinks.add("Soda");
		   
		   for (int y=0; y<drinks.size(); y++) { //using for loop cause we should have the index to replace the word!!!
			  String drink= drinks.get(i);
			  if(drink.contains("a")|| drink.contains("e")) {
				  drinks.set(y, "water");
			  }
		   }
		   System.out.println(drinks);

		 // 4.Create an arrayList of even numbers from 1 to 50. Using Integer remove any number that is divisible by 5 from that arrayList.
		
		  List <Integer>list= new ArrayList<>();
		  for (int k=1; k<=50;k++) {
			if (k%2==0) {
			  list.add(k);
		}
		  }
//			for (int i=2; i<=50; i+=2) { or we can use this way
//				list.add(i);
//			}
//		
//		System.out.println(list);
		 
		Iterator<Integer> iter=list.iterator();
		 while(iter.hasNext()) {
			 int num=iter.next();
			 if (num%5==0) {
				 iter.remove();  
			 }
		 }

		  System.out.println(list);
	}
	
}


