package com.class32;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetIntro {
	
	public static void main(String[] args) {
		
	HashSet<Integer> hset=new HashSet<>();// can be also generic or non generic
	hset.add(12);
	hset.add(32);
	hset.add(34);
	System.out.println(hset.size());

	//Set doesn't keep the order
	System.out.println(hset);
	System.out.println(hset.contains(32));
	
	// it doesn't store duplicates
	hset.add(12);
	hset.add(32);
	System.out.println(hset.size()); //3 --> 12, 32 already present in our hashSet
	
	// to retrieve all values we can use 9Only advanced for loop and Iterator
	for (Integer num:hset) {
		System.out.println(num);
	}
	System.out.println("---Using iterator---"); 
	Iterator <Integer> it= hset.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());
	}
	
	
}
}