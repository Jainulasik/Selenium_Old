package com.JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_executo_Flipkart {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//span[@role='button']")).click();
		
		driver.findElement(By.xpath("//img[@alt='Appliances']")).click();
		
		JavascriptExecutor appliances = (JavascriptExecutor)driver;
		
		
		//SCROLL DOWN
		Thread.sleep(2000);
        appliances.executeScript("window.scrollTo(0,1000)");
		
        //SCROLLUP
        Thread.sleep(2000);
		appliances.executeScript("window.scrollTo(0,-200)");
		
		//SCROLL BOTTOM
		Thread.sleep(2000);
		appliances.executeScript("window.scroll(0,document.body.scrollHeight)");

		//SCROLL HEIGHT
		Thread.sleep(2000);
		appliances.executeScript("window.scrollTo(0,0)");
		
		//SCROLL ELEMENT
	    WebElement wash = driver.findElement(By.xpath("//img[@alt='Front Load Washing Machines (Buy Now)']"));
		Thread.sleep(2000);
		appliances.executeScript("arguments[0].scrollIntoView()",wash);
		
		//SCROLL POSITION
		Thread.sleep(2000);
		appliances.executeScript("arguments[0].click()",wash);
		
		Thread.sleep(1000);
	    driver.navigate().to("www.meesho.com");
	    
		
		
		
	}
}
