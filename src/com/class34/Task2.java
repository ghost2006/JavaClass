package com.class34;
import java.util.*;
public class Task2 {

	public static void main(String[] args) {
		/* Write the program to check which employee gets highest salary use hashMap
		 * employee name as a key and salary amount as the value, ex: John Smith=100000. */

		Map<String, Integer> salaryMap=new HashMap<>();
		
		salaryMap.put("John", 70000);
		salaryMap.put("James", 80000);
		salaryMap.put("Frank", -900000);
		salaryMap.put("David", 50000);
		salaryMap.put("Jordan", -100000);
		
		//int maxSalary=Integer.MIN_VALUE;
		int maxSalary=0;
		String key=null;
				
				for (Map.Entry<String, Integer> entry:salaryMap.entrySet()) {
					if (entry.getValue()>maxSalary){
						maxSalary=entry.getValue();
						key=entry.getKey();
					}
				}
				System.out.println(maxSalary+" belongs to "+key);
	}

}
