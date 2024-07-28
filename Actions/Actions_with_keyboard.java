package com.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_with_keyboard {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		
		        // OPEN GOOGLE,NEW TAB,NEW WIN ,NEW INCOGNITO WITH KEYBORAD ACTION:
		
		System.setProperty("webdriver.chrome.driver", "C:\\Project\\Selenium_SIT_\\Driver_\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		
		Actions gma = new Actions(driver);
		gma.contextClick(gmail).build().perform();
		
        //SYNTAX
		Robot pagedown = new Robot();

		//NEW TAB
		pagedown.keyPress(KeyEvent.VK_PAGE_DOWN);
		pagedown.keyRelease(KeyEvent.VK_PAGE_DOWN);

		//NEW WINDOW	
		// pagedown.keyPress(KeyEvent.VK_PAGE_DOWN);
		//pagedown.keyRelease(KeyEvent.VK_PAGE_DOWN);

		Thread.sleep(3000);
		pagedown.keyPress(KeyEvent.VK_ENTER);
		pagedown.keyPress(KeyEvent.VK_ENTER);


		driver.navigate().to("https://www.google.com");

		WebElement gmail2 = driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions gma2 = new Actions(driver);
		gma2.contextClick().build().perform();

		Robot pagedown2 = new Robot();

		pagedown2.keyPress(KeyEvent.VK_PAGE_DOWN);
		pagedown2.keyRelease(KeyEvent.VK_PAGE_DOWN);
		pagedown2.keyPress(KeyEvent.VK_PAGE_DOWN);
		pagedown2.keyRelease(KeyEvent.VK_PAGE_DOWN);
		pagedown2.keyPress(KeyEvent.VK_PAGE_DOWN);
		pagedown2.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(6000);
		pagedown2.keyPress(KeyEvent.VK_ENTER);
		pagedown2.keyPress(KeyEvent.VK_ENTER);






	}


}
