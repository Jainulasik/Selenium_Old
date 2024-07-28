package com.WindowHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_handling_flipkart {

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

		WebElement travel = driver.findElement(By.xpath("//img[@alt='Travel']"));
		Actions tra = new Actions(driver);
		tra.contextClick(travel).build().perform();
		
		Robot rob3 = new Robot();
		rob3.keyPress(KeyEvent.VK_PAGE_DOWN);
		rob3.keyPress(KeyEvent.VK_ENTER);
		
		//SWITCH TO ALL TAB
		Set<String> flipkart = driver.getWindowHandles();
		System.out.println("flipkart");
		
		for (String ac : flipkart) {
			System.out.println(ac);
			driver.switchTo().window(ac);
			String title = driver.getTitle();
			System.out.println(title);
		}
		
		Robot switc = new Robot();
		switc.keyPress(KeyEvent.VK_CONTROL);
		switc.keyPress(KeyEvent.VK_TAB);
		switc.keyPress(KeyEvent.VK_CONTROL);
		switc.keyPress(KeyEvent.VK_H);
		
		
		
//		
//		String Specifictitle = "Mobile Phones Online at Best Prices in India";
//		for (String ac : flipkart) {
//			driver.switchTo().window(ac);
//			String title = driver.getTitle();
//         if (Specifictitle.equals(title)) {
//        	 break;
        }
				
}
		
		
		
	
	
	
	
	
	
	
	
	
	

