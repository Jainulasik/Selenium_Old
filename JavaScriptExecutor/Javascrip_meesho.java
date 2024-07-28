package com.JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascrip_meesho {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//driver.manage().window().maximize();
    driver.get("https://www.meesho.com");
    
    
    //SCROLL LEFT AND RIGHT 
    
    JavascriptExecutor meesho = (JavascriptExecutor)driver;
    meesho.executeScript("window.scrollTo(2000,0)");
    meesho.executeScript("window.scrollTo(-1000,0)");
    meesho.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    
    
}
}
