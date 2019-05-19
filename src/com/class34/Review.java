package com.class34;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Review {

	public static void main(String[] args) {
		/*Store the following key value pairs in a Map
         * (Mon,1), (Tue, 2), (Wed, 3), (Thu, 4), (Fri,5), (Sun,7)
         * Write program to test if the map contains a mapping for the specified key(6).*/

        Map<String, Integer> map1 = new HashMap<String, Integer>();
        map1.put("Mon", 1);
        map1.put("Tue", 2);
        map1.put("Wed", 3);
        map1.put("Thu", 4);
        map1.put("Fri", 5);
        map1.put("Sun", 7);

        // print the map
        System.out.println("The Original map: " + map1);
        
        System.out.println("6 key 'Sat' exist?");
        if (map1.containsKey("Sat")) {  // key exists
            System.out.println("yes! - " + map1.get("Sat"));
        } else {
            System.out.println("no!"); // key does not exists
        }

        System.out.println("key 'Tue' exists?");
        if (map1.containsKey("Tue")) {
            System.out.println("yes!");
        } else {
            System.out.println(" no!");
        }

        ///////////////////////////////////////
        /*Write a program to Print in ascending order an element in a tree set which is greater than the given element 25 in ascending order.
          Print all elements in descending order*/

        TreeSet<Integer> tree_num = new TreeSet<Integer>(); // creating TreeSet

        tree_num.add(10); // Add numbers in the tree
        tree_num.add(22);
        tree_num.add(36);
        tree_num.add(25);
        tree_num.add(16);
        tree_num.add(70);
        tree_num.add(82);
        tree_num.add(89);
        tree_num.add(14);

        System.out.println("TreeMap in ascending order" + tree_num);

        for (Integer integer : tree_num) {
            if (integer >= 25) {
                System.out.print(integer + ", ");
            }
        }
        System.out.println("TreeMap in descending order " + tree_num.descendingSet());
	}

}
