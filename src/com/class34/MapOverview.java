package com.class34;
import java.util.*;
public class MapOverview {
public static void main(String[] args) {
	//Create the map of grocery products and it's quantity

	Map <String, Integer>groceryMap=new LinkedHashMap<>();
	groceryMap.put("Milk", 1);
	groceryMap.put("Bread", 2);
	groceryMap.put("Eggs", 12);
	groceryMap.put("Coffee", 2);
	groceryMap.put("Potato", 2);
	groceryMap.put("Cookies", 3);
	
	System.out.println(groceryMap);
	groceryMap.put("Cheese", 1);
	System.out.println(groceryMap.size()); //7
	
	groceryMap.replace("Eggs", 18);
	System.out.println(groceryMap);
	
	groceryMap.remove("Cheese");
	System.out.println(groceryMap);
	
	//retrieving all keys+values using keySet();
//	Set<String>keySet= groceryMap.keySet(); RETURNS THE KEY SET 
//	for (String key: keySet) {
//		System.out.println("Key is "+key+" and value is "+groceryMap.get(key));
//	}
//	Iterator <String>keyIt=keySet.iterator();
//	while(keyIt.hasNext()) {
//		String key=keyIt.next();
//		System.out.println(key+":"+groceryMap.get(key));
	
		//OR     
		for(String key:groceryMap.keySet()) {
			System.out.println("Key is "+key+" and value is "+groceryMap.get(key));
		}
		Iterator <String>keyIt=groceryMap.keySet().iterator();
		while(keyIt.hasNext()) {
			String key=keyIt.next();
			System.out.println(key+":"+groceryMap.get(key));
	}
		//retrieving all values using .values() method
//		Collection<Integer> vallCollection=groceryMap.values();
//		for (Integer value :vallCollection) {
//			System.out.println(value);
//		} OR do it Directly
		
		for (Integer value:groceryMap.values()) {
		System.out.println(value);
		}
		
		Iterator <Integer>valueIt=groceryMap.values().iterator();
		while(valueIt.hasNext()) {
			System.out.println(valueIt.next());
		}
		//retrieving all keys+values using entrySet();
		//Set<Entry<String, Integer>> setOfEntries=groceryMap.entrySet();

		for (Map.Entry<String, Integer>entry:groceryMap.entrySet()) { //Entry-our inner interface of the Map
			//System.out.println(entry.getKey()+"="+entry.getValue()); OR
			String mapValue=entry.getKey()+"="+entry.getValue();
			System.out.println(mapValue);
		}
		//map-->using EntrySet() --> we'll get Set --> any collection has an iterator() method --> returns Iterator obj
		Iterator <Map.Entry<String, Integer>>it=groceryMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer> entry=it.next(); // or can do it like --> Entry entry=it.next()
			String valueFromMap=entry.getKey()+":"+entry.getValue();
			System.out.println(valueFromMap);
			//OR System.out.println(entry.getKey()+":"+entry.getValue());
		}
		}
}
