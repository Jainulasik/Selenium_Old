package com.launchweb;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Practice_ {
public static void main(String[] args) throws InterruptedException, IOException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Seleni_openwebsite\\Driver2\\chromedriver.exe");
	
	
	WebDriver Netflix = new ChromeDriver();
	Netflix.get("https://www.netflix.com");
	Netflix.findElement(By.name("email")).sendKeys("Asik2324@gmail.com");
	Netflix.manage().window().maximize();
	Netflix.navigate().to("https://www.google.com");
	Netflix.navigate().back();
	
	
	WebDriver Insta = new ChromeDriver();
	Insta.get("https://www.instagram.com");
	Insta.manage().window().maximize();
	Thread.sleep(3000);
	
	Insta.findElement(By.xpath("//*[@id=\'loginForm\']/div/div[1]/div/label/input")).sendKeys("jainulasik");
	Insta.findElement(By.xpath("//*[@id=\'loginForm\']/div/div[2]/div/label/input")).sendKeys("9566444"+Keys.ENTER);
	
	TakesScreenshot ins = (TakesScreenshot) Insta ;
	File Source = ins.getScreenshotAs(OutputType.FILE);
	File destination = new File ("D:\\Seleni_openwebsite\\TakeScreenshots//insta.png");
	FileHandler.copy(Source, destination);
	

	
     
     
     
     
     
	
	
	
	
	
	
	
	
}
	
	
	
}
