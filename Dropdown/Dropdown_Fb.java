package com.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Fb {

public static void main(String[] args) throws InterruptedException {
		
		               //DROPDOWN >>>> FACEBOOK SIGNUP
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));	
		username.sendKeys("Hafiz");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("95664444645");
		//password.click();
		
		WebElement createnew = driver.findElement(By.xpath("//a[text()='Create new account']"));
		createnew.click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("jainul");
		driver.findElement(By.name("lastname")).sendKeys("asik");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("s.jainul@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("638292137");
		
		WebElement date = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		//Syntax//
		Select da = new Select(date);
		da.selectByIndex(24);
		
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select mon = new Select(month);
		mon.selectByValue("7");
		
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select yr = new Select(year);
		yr.selectByVisibleText("2021");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.name("websubmit")).click();
		
		
		
		
		
		
	}
	
}
