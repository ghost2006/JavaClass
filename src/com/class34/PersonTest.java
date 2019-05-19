package com.class34;
import java.util.*;
import java.util.Map.Entry;

public class PersonTest {

	public static void main(String[] args) {
		
		Map<Integer, Person> personMap=new HashMap<>();
		
		personMap.put(1013, new Person("James", "Smith", 33, 98000)); 
		personMap.put(1513, new Person("Jasmin", "Kelly", 28, 96000));
		personMap.put(1017, new Person("Mike", "Strong", 37, 96700));
		personMap.put(1654, new Person("Camilla", "Parker", 35, 93000));
		
		for (Person person:personMap.values()) { //have to access values!
			person.printUserDetails();
		}
		
		//OR                Person obj
		for (Entry<Integer, Person> entry:personMap.entrySet()) { 
			entry.getValue().printUserDetails();
		}
		
	}

}
