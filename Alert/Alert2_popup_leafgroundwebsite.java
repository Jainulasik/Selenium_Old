package com.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2_popup_leafgroundwebsite {

	public static void main(String[] args) throws InterruptedException {



		// ALERT METHODS ; 

		System.setProperty("webdriver.chrome.driver", "D:\\Seleni_openwebsite\\Driver2\\chromedriver.exe");

		WebDriver dri = new ChromeDriver();
		dri.get("https://www.leafground.com/alert.xhtml");
		dri.manage().window().maximize();



		//-------------------------PROMPT - TYPE A NAME ---

		dri.findElement(By.xpath("//*[@id=\"j_idt88:j_idt104\"]/span[2]")).click();

		Alert alert2 = dri.switchTo().alert();
		alert2.sendKeys("AShfiya");
		Thread.sleep(3000);
		alert2.accept();


		//---------------- --    Alert (Simple Dialog)- OK ------

		dri.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']/span[2]")).click();

		Alert alert = dri.switchTo().alert();
		Thread.sleep(4000);
		alert.accept();


		//------------------------Sweet Alert  - DISMISS -------

		dri.findElement(By.xpath("//*[@id=\'j_idt88:j_idt95\']/span[2]")).click();
		Thread.sleep(4000);

		dri.findElement(By.xpath("//*[@id=\'j_idt88:j_idt98\']/span[2]")).click();



		// -----------------------Alert (Confirm Dialog)---- OK ---

		dri.findElement(By.xpath("//*[@id=\'j_idt88:j_idt93\']/span[2]")).click();
		Alert ok = dri.switchTo().alert();
		Thread.sleep(3000);
		ok.dismiss();

		//--------------------------Sweet Alert (Confirmation)--- YES ---

		dri.findElement(By.xpath("//*[@id=\'j_idt88:j_idt106\']/span[2]")).click();
		Thread.sleep(3000);

		dri.findElement(By.xpath("//*[@id=\'j_idt88:j_idt108\']/span[2]")).click();
		Alert YES = dri.switchTo().alert();
		Thread.sleep(3000);
		YES.accept();





	}




}
