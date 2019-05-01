package com.class28;

public interface WebDriver extends TakeScreenshot, Executes{

	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElements();
}
class ChromeDriver extends Browser implements WebDriver, Report { // first extends-->implements!// Chrome is a defined or concrete class
	@Override
	public void openBrowser() { //we can call this method as a concrete method
		System.out.println("Chrome ob");	
	}
	@Override
	public void closeBrowser() {
		System.out.println("Chrome clb");	
	}
	@Override
	public void maximizeWindow() {
		System.out.println("Chrome can maximize the window");	
		}
	@Override
	public void findElements() {
		System.out.println("Chrome can find elements");	
	}
	@Override
	public void refreshBrowser() {
		System.out.println("refresh ChromeBrowser");
		
	}
	@Override
	public void getReport() {
		System.out.println("Report from FirefoxBrowser");		
	}
	@Override
	public void takeScreenshot() {
	System.out.println("ChromeBrowser takes a Screenshot");
	}
	@Override
	public void execute() {
		System.out.println("ChromeBrowser executes a code");
			
	}
}
class FirefoxDriver extends Browser implements WebDriver, Report{ //using interface we can achieve multiple inheritance
	@Override
	public void openBrowser() {
		System.out.println("Firefox ob");	
	}
	@Override
	public void closeBrowser() {
		System.out.println("Firefox cb");	
	}
	@Override
	public void maximizeWindow() {
		System.out.println("Firefox can maximize the window");	
	}
	@Override
	public void findElements() {
		System.out.println("Firefox can find elements");	
	}
	@Override
	public void refreshBrowser() {
		System.out.println("refresh firefoxBrowser");
	}
	@Override
	public void getReport() {
	System.out.println("Report from FirefoxBrowser");	
	}
	@Override
	public void takeScreenshot() {
		System.out.println("FireFox Browser takes a Screenshot");
	}
	@Override
	public void execute() {
		System.out.println("Firefox Browser executes a code");
	}
}