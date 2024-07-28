package com.Practices_;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practices_websites {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//span[@role='button']")).click();
		
		WebElement grocery = driver.findElement(By.xpath("//img[@alt='Grocery']"));
		Actions gro = new Actions(driver);
		gro.contextClick(grocery).build().perform();
		
		Robot rob1 = new Robot();
		rob1.keyPress(KeyEvent.VK_PAGE_DOWN);
		rob1.keyPress(KeyEvent.VK_ENTER);
		
		
		WebElement mobil = driver.findElement(By.xpath("//img[@alt='Mobiles']"));
        Actions mob = new Actions(driver);
        mob.contextClick(mobil).build().perform();
        
        Robot rob2 = new Robot();
        rob2.keyPress(KeyEvent.VK_PAGE_DOWN);
		rob2.keyPress(KeyEvent.VK_ENTER);
		

       //	NEW TAB
		
		Robot robb = new Robot();
        robb.keyPress(KeyEvent.VK_CONTROL);
		robb.keyPress(KeyEvent.VK_T);
		
		
		
		// SWITCH TAB
		
		Robot rob3 = new Robot();
		//switch tab 1	
		rob3.keyPress(KeyEvent.VK_CONTROL);
		rob3.keyPress(KeyEvent.VK_TAB);
		//switch to tab 2       
		rob3.keyPress(KeyEvent.VK_CONTROL);
        rob3.keyPress(KeyEvent.VK_TAB);

        
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
