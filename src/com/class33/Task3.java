package com.class33;

import java.util.*;

public class Task3 {

	public static void main(String[] args) {
		/*Create a map of Best Buy store. 
		 * Place item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
		 * Print all keys and values from a Best Buy map using EntrySet.*/

		Map <Integer, String> bestBuyItem= new HashMap<>();
		bestBuyItem.put(7664847, "Printer");
		bestBuyItem.put(7879885, "TV");
		bestBuyItem.put(7664897, "Camera");
		bestBuyItem.put(7600897, "Vacuum");
		
		System.out.println(bestBuyItem);
		
		for (Map.Entry<Integer, String> item:bestBuyItem.entrySet()) {
			System.out.println(item.getKey()+"="+item.getValue());
		}
		System.out.println("/////////////////////");
		Iterator<Map.Entry<Integer, String>>it=bestBuyItem.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry item=it.next();
			System.out.println(item.getKey()+":"+item.getValue());
		}
	}

}
