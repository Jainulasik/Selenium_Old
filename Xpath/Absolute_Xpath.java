package com.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {

	                      //INSTAGRAM
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
        Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[1]/div/label/input")).sendKeys("Asik");
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[2]/div/label/input")).sendKeys("9586"+Keys.ENTER);

                          //NETFLIX
	    
        driver.navigate().to("https://www.netflix.com");
        driver.findElement(By.id("signIn")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[1]/form/div[1]/div[1]/div/label/input")).sendKeys("Asik");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[1]/form/div[2]/div/div/label/input")).sendKeys("8595545"+Keys.ENTER);
        








	}


























}
