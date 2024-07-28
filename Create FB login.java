package com.launchweb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", "D:\\Seleni_openwebsite\\Driver2\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	
		
		WebElement createaccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
        createaccount.click();
		
		Thread.sleep(2000);

	    driver.findElement(By.name("firstname")).sendKeys("afi");
		driver.findElement(By.name("lastname")).sendKeys("zari");
	    driver.findElement(By.name("reg_email__")).sendKeys("95664444645");
		driver.findElement(By.name("reg_passwd__")).sendKeys("asiafiashfi@123");
		
		WebElement male = driver.findElement(By.className("_58mt"));
	   male.click();
	   
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(2000);
	    driver.navigate().refresh();
		
		
	   
	   
	  
	
	   

		
		
		
		
	}
	
	
	

}
