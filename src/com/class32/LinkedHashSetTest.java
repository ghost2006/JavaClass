package com.class32;

import java.util.LinkedHashSet;
public class LinkedHashSetTest {
	public static void main(String[] args) {
		
	// LinkedHashSet of String Type
    LinkedHashSet<String> lhset = new LinkedHashSet<String>(); //Elements gets sorted in the same sequence in which they have been added to the Set.

    // Adding elements to the LinkedHashSet
    lhset.add("Z");
    lhset.add("PQ");
    lhset.add("N");
    lhset.add("N");//doesn't store duplicate elements
    lhset.add("O");
    lhset.add("O");//doesn't store duplicate elements
    lhset.add("KK");
    lhset.add("FGH");
    System.out.println(lhset);
   
 
    // LinkedHashSet of Integer Type
    LinkedHashSet<Integer> lhset2 = new LinkedHashSet<Integer>();

    // Adding elements
    lhset2.add(99);
    lhset2.add(7);
    lhset2.add(0);
    lhset2.add(67);
    lhset2.add(89);
    lhset2.add(66);
    System.out.println(lhset2);
  
    
}
}
