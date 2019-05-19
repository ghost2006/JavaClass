package com.class33;
import java.util.*;
public class AllkeysAndValuesFromMap {

	public static void main(String[] args) {
		
		Map<Integer, String>map = new HashMap<>();
		map.put( 1, "A");
		map.put( 2, "AA");
		map.put( 3, "B");
		map.put( 3, "C");
		map.put( 4, "D");
		System.out.println(map); // {1=A, 2=AA, 3=C, 4=D}
		
		//---How to get all KEYS---
		Set <Integer>keys=map.keySet(); //keySet() method--> will return the SET of keys from the map!
		
		//to print all keys using Advanced loop:
		for (Integer key:keys) {
			System.out.println(key+":"+map.get(key));
		}
		//to print all keys using Iterator:
				Iterator<Integer>keysIt=keys.iterator();
					while(keysIt.hasNext()) {
						Integer key=keysIt.next();
						System.out.println(key+":"+map.get(key));
					}
				
		// ---How to get all Values---
		Collection <String>valCol=map.values(); //values() method --> returns Collection of values from a map!!!
		
		//to print all values using Advanced loop:
				for (String value:valCol) {
					System.out.print((value+ ", "));
				}
				
		//to print all values using Iterator:
				Iterator<String>itValues=valCol.iterator();
					while(itValues.hasNext()) {
						System.out.print(itValues.next()+", ");
					}
}
}