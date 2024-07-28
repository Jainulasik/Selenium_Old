package com.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Selenium_Test {

	
	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		
		
		//GO TO FLIPKART 
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//span[@role='button']")).click();
		
		//SEARCH IPHONE
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(2000);
        search.sendKeys("Iphone"+Keys.ENTER);
      
        
        //SELECT IPHONE 14PLUS
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 Plus (Blue, 128 GB)']")).click();
		
		//UNABLE TO CLICK >ADD TO CART .SO USED NAVIGATION METHOD
		Thread.sleep(2000);
		driver.navigate().to("https://www.flipkart.com/apple-iphone-14-plus-blue-128-gb/p/itmac8385391b02b?pid=MOBGHWFHUYWGB5F2&lid=LSTMOBGHWFHUYWGB5F2RJNHBM&marketplace=FLIPKART&q=Iphone&store=tyy%2F4io&spotlightTagId=FkPickId_tyy%2F4io&srno=s_1_6&otracker=search&otracker1=search&fm=Search&iid=14c0c5eb-315e-44f5-b01d-7a73dbe2b8ad.MOBGHWFHUYWGB5F2.SEARCH&ppt=sp&ppn=sp&ssid=n12qatmi4g0000001696684314735&qH=29e0a89b3149a9af");
		
		//ADD TO CART
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_TAB);
		
		 //SCREENSHOT
        Thread.sleep(5000);
        TakesScreenshot flip = (TakesScreenshot)driver;
	    File source = flip.getScreenshotAs(OutputType.FILE);
	    File sourceb = new File ("C:\\Selenium\\Screenshot//cart.png");
	    FileHandler.copy(source, sourceb);
	    
		
		

        
	    
		
       
	   
		

	    
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
