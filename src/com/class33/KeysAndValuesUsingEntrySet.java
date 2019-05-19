package com.class33;
import java.util.*;

public class KeysAndValuesUsingEntrySet {

	public static void main(String[] args) {
		
		//Create map to store userDetails(name,salary, department, title);
		
		Map <String, String> userDetailsMap= new LinkedHashMap<>();
		userDetailsMap.put("Name", "Alex Smith"); // 1 Entry= Key=name + value="Alex Smith"
		userDetailsMap.put("Salary", "90000"); //2 entry
		userDetailsMap.put("Department", "IT");
		userDetailsMap.put("Title", "Automation Tester");// 4th entry

		System.out.println(userDetailsMap); //stores based on keys
		
		userDetailsMap.entrySet();// returns the set of entries. entries itself is an inner interface of a Map that lives inside of the collection(Map)
		//getKey() --> returns the object key of the entry 
		//getValue() --> returns  the object value of the entry
	
		//entries obj inside the Map            set
		for(Map.Entry<String, String> entry:userDetailsMap.entrySet()) { //can be specified or not --> Map.Entry entry:userDetailsMap.entrySet()
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		System.out.println("---Using Iterator---");
		Iterator<Map.Entry<String, String>>it =userDetailsMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry entry=it.next();  // can be also generic
			System.out.println(entry.getKey()+":"+ entry.getValue());
	}

}
}