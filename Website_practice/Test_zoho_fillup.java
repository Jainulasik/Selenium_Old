package com.test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Test_zoho_fillup {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zoho.com");
		driver.findElement(By.xpath("(//a[text()='Sign up'])[2]")).click();
		
		
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("Asi@gmail.com");
		driver.findElement(By.id("password")).sendKeys("asafash@1258");
		driver.findElement(By.id("rmobile")).sendKeys("9856325789"+Keys.ENTER);
		
		Thread.sleep(2000);
		TakesScreenshot zoho = (TakesScreenshot)driver;
		File source = zoho.getScreenshotAs(OutputType.FILE);
		File sourceB = new File("C:\\Selenium\\Screenshot/zoho.png");
		FileHandler.copy(source, sourceB);
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
