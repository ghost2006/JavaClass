package com.class33;

import java.util.*;

public class EntrySet {

	public static void main(String[] args) {
		
		
		Map <String, Integer> classroomMap=new LinkedHashMap<>(); // preserve the insertion order
		classroomMap.put("Table", 20); //Entry<key, Value>
		classroomMap.put("Chairs", 60); //Entry<String, Integer>
		classroomMap.put("Screens", 3);
		classroomMap.put("Studsents", 60);
		classroomMap.put("Instractors",3);
		
		System.out.println(classroomMap);
		for(Map.Entry <String, Integer> entry :classroomMap.entrySet()) {
		System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
		System.out.println("---Using Iterator---");
		Iterator <Map.Entry<String, Integer>> classRoomIterator=classroomMap.entrySet().iterator(); //have to specify the type of iterator!!!
		while(classRoomIterator.hasNext()) {
			Map.Entry <String, Integer>me=classRoomIterator.next();//have to specify the type of me!!!
			System.out.println(me.getKey()+"="+me.getValue());
		}
	}

}
