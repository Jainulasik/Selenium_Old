package com.openwebsite;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Chrome_launch {
public static void main(String[] args) throws IOException {
	
	
	
	
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium_\\Driver\\chromedriver.exe");
	WebDriver yus = new ChromeDriver();
	yus.get("https://www.google.co.in");
	
	yus.findElement(By.linkText("iPhone - Apple Official Site"));
}
	
	
	
//	System.setProperty("webdriver.chrome.driver", "D:\\Selenium_\\Driver\\chromedriver.exe");
//	WebDriver As = new ChromeDriver();
//	As.get("https://www.facebook.com");
//	As.findElement(By.id("email")).sendKeys("s.jainulasik@gmail.com");
//	As.findElement(By.id("pass")).sendKeys("9976267567"+Keys.ENTER);
//	
//	TakesScreenshot yas = (TakesScreenshot)As;
//	File Source = yas.getScreenshotAs(OutputType.FILE);
//	File Destination = new File ("D:\\Selenium_\\Screenshot\\facebook.png");
//	FileHandler.copy(Source, Destination);
//	As.quit();	
	
	
//	As.findElement(By.name("q")).sendKeys("Al hamdulilah"+Keys.ENTER);
	
	
	
	
	
//	System.setProperty("webdriver.chrome.driver", "D:\\Selenium_\\Driver\\chromedriver.exe");
//	
//	WebDriver driver = new ChromeDriver();
//	
//	driver.get("https://www.facebook.com");
//driver.findElement(By.id("email")).sendKeys("s.jainulasik@gmail.com");
//driver.findElement(By.id("pass")).sendKeys("9976267567"+Keys.ENTER);
	
//	-------------------------------------------------------------
	
//driver.get("http://www.google.com");
//driver.findElement(By.name("q")).sendKeys("Alhamdulilah"+Keys.ENTER);
	
//	----------------------------------------------------------------

//	driver.get("https://www.dell.com");
//	TakesScreenshot as = (TakesScreenshot)driver;
//	File asfi = as.getScreenshotAs(OutputType.FILE);
//	File afi = new File ("D:\\Selenium_\\Screenshot\\dell.png");
//	FileHandler.copy(asfi, afi);
	
//   --------------------------------------------------------------------------	

	//	driver.get("https://www.samsung.com");
//	TakesScreenshot as = (TakesScreenshot)driver;
//	File asi = as.getScreenshotAs(OutputType.FILE);
//	File afi = new File ("D:\\Selenium_\\Screenshot\\samsung.png");
//	FileHandler.copy(asi, afi);
	
	
}

