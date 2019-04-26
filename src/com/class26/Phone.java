package com.class26;

public class Phone {

	public void makeCall() {
		System.out.println("Phone can make a call");
	}
	public void hasCamera() {
		System.out.println("Phone has a camera");
	}
}

class iPhone extends Phone{

	public void makeCall() {
		System.out.println("iphone has a face time");
	}
	public void hasCamera() {
		System.out.println("iPhone has a dual HD camera.");
	}
}

class Nokia extends Phone{
	public void cannotbeBrocken() {
		System.out.println("Nokia is unbreakable");
	}
}

class Samsung extends Phone{
	public void hasCamera() {
		System.out.println("Samsung Phone has a 3 lenses camera");
	}
}