package com.Frame_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2_demoqa {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		
		//2
		driver.switchTo().frame("frame1");
		
		//1
		WebElement single = driver.findElement(By.id("sampleHeading"));
		String text = single.getText();
		System.out.println(text);
		
	
		
		
		
		
		
		
	}
	
	
}
