package com.class28;

public class webDriverTest {

	public static void main(String[] args) {
	
		WebDriver obj=new ChromeDriver();
			obj.closeBrowser();
			obj.openBrowser();
			obj.findElements();
			obj.maximizeWindow();
			
			WebDriver obj1=new FirefoxDriver();
			obj1.closeBrowser();
			obj1.openBrowser();
			obj1.findElements();
			obj1.maximizeWindow();


	}

}
