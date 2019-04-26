package com.class27;

public abstract class Phone {
 
		public void makeCall() {
			System.out.println("Phone can make a call");
		}
		
		public void sendText() {
			System.out.println("Phone can send a text");
		}
		public abstract void unlockPhone(); // we don't know how to implement this behavior;
		public abstract void viewPictures();//here we providing only general information
}
class iPhone extends Phone{ //concrete class- is a class that is inherited from an Abstract class or 
	                       // implemented by interface and providing complete implementation of all unimplemented/abstract classes
// Java forces all child classes to provide the implementation of all abstract behaviors
	@Override
	public void unlockPhone() {
		System.out.println("To unlock iPhone we can use FaceId or FingerPrint");
	}

	@Override
	public void viewPictures() {
		System.out.println("To view pictures on iPhone you can go to Images");	
	}
}

class Samsung extends Phone{ //concrete class

	@Override
	public void unlockPhone() {
		System.out.println("To unlock Samsung we need to enter password");
	}

	@Override
	public void viewPictures() {
		System.out.println("To view pictures on Samsung you can go to gallery");
	}
}