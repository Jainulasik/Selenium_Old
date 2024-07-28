package com.wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_ {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/waits.xhtml");
		WebElement clickbutton = driver.findElement(By.xpath("(//span[text()='Click'])[1]"));
		clickbutton.click();


		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement iam = driver.findElement(By.xpath("//span[text()='I am here']"));
		String text = iam.getText();
		System.out.println(text);
	}

}

















