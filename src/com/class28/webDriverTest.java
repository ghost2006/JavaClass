package com.class28;

public class webDriverTest {

	public static void main(String[] args) {
	
			WebDriver obj=new ChromeDriver();
			obj.closeBrowser();
			obj.openBrowser();
			obj.findElements();
			obj.maximizeWindow();
			obj.m2();// default method of interface TakeScreenshot
			
			WebDriver obj1=new FirefoxDriver();
			obj1.closeBrowser();
			obj1.openBrowser();
			obj1.findElements();
			obj1.maximizeWindow();
			obj1.m2();//default method of interface TakeScreenshot
			
			WebDriver driver=new ChromeDriver();
			driver.closeBrowser();
			driver.takeScreenshot();
			driver.findElements();
			driver.m2();
			
			TakeScreenshot.m1(); //accessing static method in a static way by using class name/interface where this method was defined
			System.out.println(TakeScreenshot.fileExtention);//accessing static variable in a static way 
			

	}

}
