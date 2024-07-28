package com.Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_FB {

public static void main(String[] args) {
		
		// Navigation > all methods:
		
		System.setProperty("webdriver.chrome.driver", "D:\\Seleni_openwebsite\\Driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.navigate().to("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		
	}
	
	
	
	
	
	
	
	
}
