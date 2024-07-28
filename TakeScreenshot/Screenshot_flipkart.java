package com.TakeScreenshot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_flipkart {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {

		//  lAUNCH FLIPKART AND SEARCH PHONE WITH SCREENSHOT----


		System.setProperty("webdriver.chrome.driver", "D:\\Seleni_openwebsite\\Driver2\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		WebElement cancel = driver.findElement(By.xpath("/html/body/div[3]/div/span"));
		cancel.click();
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("iphone14pro"+Keys.ENTER);

		Thread.sleep(2000);
		driver.findElement
		(By.xpath("//div[text()='APPLE iPhone 14 Pro (Silver, 128 GB)']")).click();

	
	    TakesScreenshot ts = (TakesScreenshot)driver;
		File xx = ts.getScreenshotAs(OutputType.FILE);
		File yy = new File ("C:\\Selenium\\Screenshot//flipk2.png");
		FileHandler.copy(xx, yy);
		
		






	}
}


