package com.Actions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Actions_with_mouse {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();

		                      // TO CLOSE LIKE POPUP
		WebElement closeoption = driver.findElement(By.xpath("//span[@role='button']"));
		Thread.sleep(2000);
		closeoption.click();

		                      // SINGLE CLICK
		WebElement mobileclick = driver.findElement(By.xpath("//img[@alt='Mobiles']"));
		Actions Acti = new Actions (driver);
		Thread.sleep(2000);
		Acti.click(mobileclick).build().perform();

		                      //MOVETOELEMENT
		WebElement Fash = driver.findElement(By.xpath("//span[text()='Men']"));
		Thread.sleep(2000);
		Acti.moveToElement(Fash).build().perform();

		                      //RIGHTCLICK
		WebElement rightclick = driver.findElement(By.xpath("//img[@alt='Realme']"));
		Thread.sleep(2000);
		Acti.contextClick(rightclick).build().perform();

		                      //DOUBLECLICK
		WebElement double_click = driver.findElement(By.xpath("//div[text()='APPLE']"));
		Thread.sleep(3000);
		Acti.doubleClick(double_click).build().perform();
		
		                      //DRAG AND DROP
		Thread.sleep(3000);
        driver.navigate().to("https://www.leafground.com/drag.xhtml");
        WebElement From = driver.findElement(By.xpath("//p[text()='Drag to target']"));
        WebElement TO = driver.findElement(By.xpath("//p[text()='Drop here']"));
		Thread.sleep(3000);
        Acti.dragAndDrop(From, TO).build().perform();
        
        driver.navigate().back();
        TakesScreenshot flip = (TakesScreenshot)driver;
        File source = flip.getScreenshotAs(OutputType.FILE);
        File Desti  =  new File ("C:\\Selenium\\Screenshot//flip.png");
        FileHandler.copy(source, Desti);


	}}
