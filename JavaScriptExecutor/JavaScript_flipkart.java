package com.JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_flipkart {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(0,3000)");

		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(0,-1500)");

		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");

		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(0,0)");

		WebElement laptop = driver.findElement(By.xpath("//h2[text()='Shop Laptops & Tablets']"));
		Thread.sleep(2000);
		jse.executeScript("arguments[0].scrollIntoView()", laptop);
		
		jse.executeScript("arguments[0].click()",laptop);
		






	}
}
