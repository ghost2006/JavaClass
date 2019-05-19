package com.class33;
import java.util.*; // can use a wildCard --import everything 

public class MapIntro {

	public static void main(String[] args) {
	
	  //Map<Key,     Value>, key is also an Object
		Map<Integer, String> map= new HashMap<>(); //map is a collection of entries
		
		//add entries(key+value) by using method put();
		map.put(101, "John"); //--> our first entry
		map.put(102, "Jane");
		map.put(103, "Kate");
		map.put(104, "James");
		
		//retrieve values
		System.out.println(map.get(102)); //jane
		
		// how to find the size of map
		System.out.println(map.size()); //4 --> returns the number of keys, how many entries we have
		
		//how to update value -- using method replace
		map.replace(103, "Bilal");
		System.out.println(map.get(103)); // to get the value using its key
		
		//remove the value
		map.remove(104);
		System.out.println(map.size());//3
		
		//how to check if there any values in the map
		System.out.println(map.isEmpty()); //false
		
		System.out.println(map); // {101=John, 102=Jane, 103=Bilal}
		
		//to check if specific key or value is there
		System.out.println(map.containsKey(102));
		System.out.println(map.containsValue("Bilal")); //true
		
		map.put(105, "Jane"); //can store duplicate values!!
		System.out.println(map); //101=John, 102=Jane, 103=Bilal, 105=Jane}
		
		map.put(101, "Shaban"); //can't have duplicate keys!!
		System.out.println(map);// value will be replaced--overriding the older value
	
		//adding null key with some value
		map.put(null, "Some value"); //can't duplicate key< they should be unique!!
		System.out.println(map);
		
		//adding null key with null value
		map.put(null,null);
		System.out.println(map);// {null=null, 101=Shaban, 102=Jane, 103=Bilal, 105=Jane}
	}

}
