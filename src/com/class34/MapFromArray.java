package com.class34;
import java.util.*;

public class MapFromArray {

	public static void main(String[] args) {
		
		                // 1          2       3       4        5        6    - keys
		String [] names= {"Mehmet", "Asha", "Amina", "Omar", "Siyar", "Danny"};
		
		Map <Integer, String> nameMap=new LinkedHashMap<>();
		
		int key=1; //starting with 1 --> key=1
		for (String name:names) {
			nameMap.put(key,  name);
			key++;
		}
		System.out.println(nameMap); // {1=Mehmet, 2=Asha, 3=Amina, 4=Omar, 5=Siyar, 6=Danny}
		
		for (Integer nameKey:nameMap.keySet()){
			System.out.println(nameKey+":"+ nameMap.get(nameKey));
	}
		System.out.println("/////LOOP///////");
		// Print key and values using entrySet (loop & iterator)
		
		for (Map.Entry <Integer, String> entry:nameMap.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		System.out.println("/////ITERATOR///////");
		Iterator<Map.Entry<Integer, String>>it=nameMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> entry=it.next(); 
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}
}
}