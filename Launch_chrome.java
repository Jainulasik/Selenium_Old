package com.launchweb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Launch_chrome {

	public static void main(String[] args) {
		
		// Open chrome and google page.
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_\\Driver\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://www.google.com");

		
		
		//Type a name something in search box and find out.
		
		chrome.findElement(By.name("q")).sendKeys("IPHONE"+Keys.ENTER);
		
		
		
		// Click link what we need .
		
		//chrome.findElement(By.partialLinkText("iPhone - Apple (IN)")).click();
		chrome.findElement(By.partialLinkText("Buy Apple iPhones online at Best Prices in INDIA ... - Flipkart")).click();	
		
		
        
        
        
        		
        		
        		
        		

	}
	

    	

		
		


		
	}
		

