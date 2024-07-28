package com.Frame_;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_letcode {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letcode.in/frame");

		driver.switchTo().frame("firstFr");
        WebElement entername = driver.findElement(By.xpath("//input[@name='fname']"));	
        entername.sendKeys("Jainulasik");
        
        driver.switchTo().frame("");
        WebElement lastname = driver.findElement(By.xpath("//input[@name='lname']"));		
        lastname.sendKeys("Asi");
}

	
	
}
