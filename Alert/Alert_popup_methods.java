package com.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup_methods {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");

		//                  LETCODE WEBSITE :
		        //************SIMPLE ALERT :***********

		WebElement simplealert = driver.findElement(By.xpath("//button[@id='accept']"));
		simplealert.click();
		Alert Simple = driver.switchTo().alert();
		Thread.sleep(2000);
		Simple.accept();
		String text = simplealert.getText();
		System.out.println(text);
		

		              //***********CONFIRM ALERT:*************

		WebElement Confirm = driver.findElement(By.xpath("//button[@id='confirm']"));
		Confirm.click();
		Alert con = driver.switchTo().alert();
		Thread.sleep(2000);
		con.dismiss();
		String text2 = Confirm.getText();
		System.out.println(text2);

		

	               	//***********MODERN ALERT:******************

		driver.findElement(By.xpath("//button[@id='modern']")).click();
		Thread.sleep(2000);
		driver.findElement
		(By.xpath("/html/body/app-root/app-alert/section[1]/div/div/div[1]/div/div/div[5]/button")).click();
		
		

                      //************PROMPT ALERT:****************

		driver.findElement(By.xpath("//button[@id='prompt']")).click();
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("Jainulasik");
		prompt.accept();     




	}
}
