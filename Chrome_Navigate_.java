package com.launchweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Chrome_navigation {

	public static void main(String[] args) {
		
		// Navigation > all methods:
		
		System.setProperty("webdriver.chrome.driver", "D:\\Seleni_openwebsite\\Driver2\\chromedriver.exe");
		WebDriver navi = new ChromeDriver();
		navi.get("https://www.google.co.in");
		
		String title = navi.getTitle();
		System.out.println(title);
		
		navi.navigate().to("https://www.facebook.com");
		
		navi.manage().window().maximize();
		
		navi.navigate().back();
		
		navi.navigate().forward();
		
		navi.navigate().refresh();
		
		String currentUrl = navi.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		
	}
}
