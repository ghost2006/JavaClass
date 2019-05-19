package com.class33;
import java.util.*;

public class Task {

	public static void main(String[] args) {
		/*Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..). 
		 * Insert 7 entries with duplicate keys and values. Check how many entries you have? Update company on a 4th  floor
         * Remove company on the 7th floor Print your map */

		Map<Integer, String> buildings = new HashMap<>();
		buildings.put(1, "Google");
		buildings.put(2, "Syntax");
		buildings.put(3, "Amazon");
		buildings.put(4, "Syntax");
		buildings.put(5, "Verizon");
		buildings.put(6, "BOA");
		buildings.put(2, "Ebay");
		buildings.put(7, "Farma");
		
		System.out.println(buildings);
	    System.out.println(buildings.size()); //7
		
		buildings.replace(4, "Occ");
		System.out.println(buildings);
		
		buildings.remove(7);
		System.out.println(buildings);
		
	}

}
