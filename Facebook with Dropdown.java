package com.launchweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_example {

	public static void main(String[] args) throws InterruptedException {
		
		
		//        DROPDOWN CONCEPTS THROUGH FACEBOOK
		
		System.setProperty("webdriver.chrome.driver", "D:\\Seleni_openwebsite\\Driver2\\chromedriver.exe");
		
		WebDriver drop = new ChromeDriver();
		drop.manage().window().maximize();
		drop.get("https://www.facebook.com");
		drop.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(3000);
		
		drop.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ashf");
		drop.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Zari");
		drop.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("989865785");
		drop.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("yas@123");
		
		WebElement dropdown = drop.findElement(By.xpath("//select[@name='birthday_day']"));
		Select day = new Select(dropdown);    //select syntax
		//day.selectByValue("14");
		day.selectByIndex(13);
		
		WebElement dropdown2 = drop.findElement(By.xpath("//select[@name='birthday_month']"));
		Select month = new Select(dropdown2);    // select syntax
		//month.selectByValue("11");
		month.selectByValue("11");
		
		
		WebElement dropdown3 = drop.findElement(By.xpath("//select[@name='birthday_year']"));
		Select year = new Select(dropdown3);    //select syntax
	    //year.selectByValue("2022");
		year.selectByVisibleText("2021");
				
	    WebElement gender = drop.findElement(By.xpath("//label[text()='Male']"));
	    gender.click();
		
	   
	    WebElement signup = drop.findElement(By.name("websubmit"));
	    signup.click();
		
	    
	    
         		

		
		

		
		
	}
	
	
	
	
	
	
	
	
	
}
