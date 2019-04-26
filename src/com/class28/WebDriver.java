package com.class28;

public interface WebDriver {

	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElements();
}
class ChromeDriver implements WebDriver{
	@Override
	public void openBrowser() {
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
}

class FirefoxDriver implements WebDriver{
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
}