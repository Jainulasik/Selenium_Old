package com.Frame_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_multiple_gettext {
	
	public static void main(String[] args) {
		
	
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.letcode.in/frame");

			//step3
			WebElement outer = driver.findElement(By.id("firstFr"));
			driver.switchTo().frame(outer);

			//step2
			WebElement inner = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
			driver.switchTo().frame(inner);

			//Default-step1
			WebElement email = driver.findElement(By.name("email"));
			email.sendKeys("Asik@gmail.com");

			driver.switchTo().defaultContent();

			//Step4
			WebElement St = driver.findElement(By.xpath("//li[text()='switchTo()']"));
			String text = St.getText();
			System.out.println(text);



		}

}
