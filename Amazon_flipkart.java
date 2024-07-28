package com.launchweb;

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

public class Pracamazonflipkart {
	
	
public static void main(String[] args) throws InterruptedException, IOException {
	
	
	      //LAUNCH AMAZON AND SEARCH ONEPLUS WITH SCREENSHOT---
	
	System.setProperty("webdriver.chrome.driver", "D:\\Seleni_openwebsite\\Driver2\\chromedriver.exe");
	WebDriver amazon = new ChromeDriver();
	amazon.manage().window().maximize();
	amazon.get("https://www.amazon.com");
	
	amazon.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus nord"+Keys.ENTER);
	amazon.findElement
	(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
	
	Thread.sleep(7000);
	
	TakesScreenshot tss = (TakesScreenshot)amazon;
	File Ab = tss.getScreenshotAs(OutputType.FILE);
    File Ac = new File ("D:\\Seleni_openwebsite\\TakeScreenshots//amazon2.png");
   FileHandler.copy(Ab, Ac);
	
	
	//      lAUNCH FLIPKART AND SEARCH PHONE WITH SCREENSHOT----
	
	
	System.setProperty("webdriver.chrome.driver", "D:\\Seleni_openwebsite\\Driver2\\chromedriver.exe");
	
	WebDriver flipk = new ChromeDriver();
	flipk.manage().window().maximize();
	flipk.get("https://www.flipkart.com");
	WebElement cancel = flipk.findElement(By.xpath("/html/body/div[3]/div/span"));
	cancel.click();
	WebElement search = flipk.findElement(By.name("q"));
	search.sendKeys("iphone14pro"+Keys.ENTER);
	
     flipk.findElement
     (By.xpath("//*[@id=\'container\']/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")).click();
     
    flipk.navigate().to("https://www.myntra.com");
    Thread.sleep(9000);
    
    TakesScreenshot ts = (TakesScreenshot)flipk;
    File xx = ts.getScreenshotAs(OutputType.FILE);
    File yy = new File ("D:\\Seleni_openwebsite\\TakeScreenshots//flipk2.png");
    FileHandler.copy(xx, yy);
    
    
    
	
	
	
}
}
