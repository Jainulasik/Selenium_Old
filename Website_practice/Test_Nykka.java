package com.test;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Test_Nykka {

	public static void main(String[] args) throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver", "C://Selenium//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/sp/new-customers/new-customers?utm_content=ads&utm_source=GooglePaid&utm_medium=search&utm_campaign=Search_Nykaa_NCA&gclid=EAIaIQobChMI_-GZwJPkgQMV_6NmAh1fDQ8hEAAYASAAEgJv8vD_BwE");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='men']")).click();

		Set<String> windowHand = driver.getWindowHandles();
		for ( String allwindow : windowHand) {
			driver.switchTo().window(allwindow);
		}

		driver.findElement(By.xpath("(//div[@class='outline-wrapper'])[19]")).click();

		driver.findElement(By.xpath("//span[text()='Discount']")).click();
		driver.findElement(By.xpath("//span[text()='70% and above']")).click();
		driver.findElement(By.xpath("//span[text()='Sort By : popularity']")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		driver.findElement(By.xpath("//div[text()='Bombay Shaving Company Charcoal Peel Off Mask']")).click();

		Set<String> windowhand2 = driver.getWindowHandles();
		for (String allwindow2 : windowhand2) {
			driver.switchTo().window(allwindow2);

		}
		driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();


		Thread.sleep(3000);
		TakesScreenshot nykk = (TakesScreenshot)driver;
		File source = nykk.getScreenshotAs(OutputType.FILE);
		File sourceB = new File ("C:\\Selenium\\Screenshot/nykka.png");
		FileHandler.copy(source, sourceB);























	}}










