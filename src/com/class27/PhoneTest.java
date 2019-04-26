package com.class27;

public class PhoneTest {

	public static void main(String[] args) {
		
	//Phone obj=new Phone(); can't instantiate Phone class because it's an abstract class --> can't create an obj of Abstract class
	Phone phone1 =new iPhone();

	phone1.makeCall();
	phone1.sendText();// accessing parent methods
	phone1.unlockPhone();
	phone1.viewPictures();// accessing overriding m
	
	Phone phone2 =new Samsung();

	phone2.makeCall();
	phone2.sendText();
	phone2.unlockPhone();
	phone2.viewPictures();
	}

}
