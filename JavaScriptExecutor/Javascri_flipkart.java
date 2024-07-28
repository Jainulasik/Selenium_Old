package com.JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascri_flipkart {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com");
	
	JavascriptExecutor myn = (JavascriptExecutor)driver;
	
	//SCROLL DOWN 
	Thread.sleep(2000);
    myn.executeScript("window.scrollTo(0,5000)");
    
    //SCROLL UP
	Thread.sleep(2000);
    myn.executeScript("window.scrollTo(0,-1000)");
    
    //SCROLL BOTTOM
	Thread.sleep(2000);
    myn.executeScript("window.scrollTo(0,document.body.scrollHeight)");

    //SCROLL UP
    Thread.sleep(2000);
    myn.executeScript("window.scrollTo(0,0)");
    
    //SPECIFIC ELEMENT
	WebElement brands = driver.findElement(By.xpath("//h4[text()='Medal Worthy Brands To Bag']"));
    Thread.sleep(2000);
    myn.executeScript("arguments[0].scrollIntoView()",brands);
    
    //CLICK
//	 WebElement cl = driver.findElement(By.xpath("//img[@draggable='false']"));
//    Thread.sleep(2000);
//    myn.executeScript("arguments[0].click()",cl);

    
    
    
	
	
	
	

}
}
