package com.TakeScreenshot;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_using_website {
	
	public static void main(String[] args) throws InterruptedException, IOException {

	           //LAUNCH AMAZON AND SEARCH ONEPLUS WITH SCREENSHOT---

	System.setProperty("webdriver.chrome.driver", "D:\\Seleni_openwebsite\\Driver2\\chromedriver.exe");
	WebDriver amazon = new ChromeDriver();
	amazon.manage().window().maximize();
	amazon.get("https://www.amazon.com");

	amazon.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus nord"+Keys.ENTER);
	amazon.findElement
	(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();

	Thread.sleep(7000);

	TakesScreenshot tss = (TakesScreenshot)amazon;
	File Ab = tss.getScreenshotAs(OutputType.FILE);
	File Ac = new File ("C:\\Selenium\\Screenshot//amazon2.png");
	FileHandler.copy(Ab, Ac);


	




	}}
