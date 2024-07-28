package com.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions_with_keyboard2_FB {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		username.sendKeys("Asik");
		
		Robot fb = new Robot();
		fb.keyPress(KeyEvent.VK_CONTROL);
		fb.keyPress(KeyEvent.VK_A);
		fb.keyPress(KeyEvent.VK_CONTROL);
		fb.keyPress(KeyEvent.VK_C);
		fb.keyRelease(KeyEvent.VK_CONTROL);
		fb.keyRelease(KeyEvent.VK_A);
		fb.keyPress(KeyEvent.VK_TAB);
		fb.keyRelease(KeyEvent.VK_TAB);
		fb.keyPress(KeyEvent.VK_CONTROL);
		fb.keyPress(KeyEvent.VK_V);
		
		
		
		
		
		
		
		
		
	}
}
