package com.wait;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_ {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letcode.in/waits");

		WebElement let = driver.findElement(By.xpath("//button[text()='Simple Alert']"));
		let.click();

		WebDriverWait Wait = new WebDriverWait(driver, 5);
		Wait.until(ExpectedConditions.alertIsPresent());

		Alert ale = driver.switchTo().alert();
		ale.accept();

	}}
















