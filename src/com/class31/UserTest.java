package com.class31;
import java.util.ArrayList;
import java.util.List;

public class UserTest {
	
	public static void main(String[] args) {
		
 // create an ArrayList of user defined objects + encapsulation
		
		User obj1=new User("John",25);//created an object
		User obj2=new User("Jake",15);
		User obj3=new User("Mike",33);
		
		List<User> users = new ArrayList<>();
        users.add(obj1); //added an object to users list
        users.add(obj2); 
        users.add(obj3); 
        users.add(new User("Maria", 34)); // added a new object to our user list using a shortcut
        users.add(new User("Steve", 29));
        users.add(new User("Elena", 18));
        System.out.println(users.size());//6
       
       for (User user:users) {
       System.out.println("Name : " + user.getName() + ", Age : " + user.getAge());
       }
}
}