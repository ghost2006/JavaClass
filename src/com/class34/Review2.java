package com.class34;

import java.util.*;

public class Review2 {

	public static void main(String[] args) {
		 /*Store and Print the following elements using a HashSet "Red" "Green" "Black" "White" "Pink" "Yellow" */

        HashSet<String> colorsSet = new HashSet<String>();
        
        // use add() method to add values in the hash set
        colorsSet.add("Red");
        colorsSet.add("Green");
        colorsSet.add("Black");
        colorsSet.add("White");
        colorsSet.add("Pink");
        colorsSet.add("Yellow");

        // set Iterator
        Iterator<String> p = colorsSet.iterator();
        // Iterate the hash set
        while (p.hasNext()) {
            System.out.println(p.next());
        }
        /* ReStore and Print the above hashSet in a TreeSet */
                
            Set<String> tree_set = new TreeSet<String>(colorsSet); //storing HashSet elements in TreeSet
            
           // Display TreeSet elements
              System.out.println("TreeSet elements: ");
                for(String element : tree_set){
                  System.out.println(element);
                 }
	}

}
