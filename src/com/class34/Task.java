package com.class34;
import java.util.*;
public class Task {
	public static void main(String[] args) {
		/* create a map from array of cities that will sort keys in alphabetical order. As a key store name of the city.
		If any city name is more than 7 characters -remove that city, ex (paris=5, moscow =6) */
		 
		 String[] cityArray= {"London", "Moscow", "Baku", "Berlin", "Istanbul", "Islamabad"};
			
			Map<String, Integer> cityMap=new TreeMap<>();
			
			for (String city: cityArray) {
				cityMap.put(city, city.length());
			}
			System.out.println(cityMap);
			
			Iterator<Map.Entry<String, Integer>> it=cityMap.entrySet().iterator();
			while(it.hasNext()) {
//				Map.Entry<String,Integer> entry=it.next();
//				if(entry.getValue()>7){
//					it.remove();
//				}
//				int num=it.next().getValue();
//				if (num>7) {
//					it.remove();
//				}
				String key=it.next().getKey();
				if (key.length()>7){
					it.remove();
				}
			}
			System.out.println(cityMap);
	}

}
