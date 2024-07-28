package com.Miniproject;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Miniproject_hotelapp {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.adactinhotelapp.com");

		// LOGIN

		driver.findElement(By.id("username")).sendKeys("Asik232425");
		driver.findElement(By.id("password")).sendKeys("1234567"+Keys.ENTER);

		WebElement location = driver.findElement(By.id("location"));
		Select loca = new Select(location);
		Thread.sleep(1000);
		loca.selectByVisibleText("Paris");

		WebElement hotels = driver.findElement(By.id("hotels"));
		Select hotel = new Select(hotels);
		Thread.sleep(1000);
		hotel.selectByIndex(2);

		WebElement roomtype = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select ro = new Select(roomtype);
		Thread.sleep(1000);
		ro.selectByIndex(4);


		WebElement rooms = driver.findElement(By.id("room_nos"));
		Select room = new Select(rooms);
		Thread.sleep(1000);
		room.selectByIndex(3);

		WebElement date = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		date.sendKeys("05/10/2023");
		Thread.sleep(1000);
		date.click();

		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_A);
		Thread.sleep(1000);
		date.sendKeys("05/10/2023");

		WebElement outdate = driver.findElement(By.name("datepick_out"));
		outdate.sendKeys("08/10/2023");

		Thread.sleep(1000);
		outdate.click();

		Robot outda = new Robot();
		outda.keyPress(KeyEvent.VK_CONTROL);
		outda.keyPress(KeyEvent.VK_A);
		Thread.sleep(1000);
		outdate.sendKeys("08/10/2023");


		WebElement adults = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select adult = new Select(adults);
		Thread.sleep(1000);
		adult.selectByIndex(2);

		WebElement child = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select chil = new Select(child);
		Thread.sleep(1000);
		chil.selectByIndex(1);

		driver.findElement(By.xpath("//input[@id='Submit']")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();

		driver.findElement(By.xpath("//input[@id='continue']")).click();

		Thread.sleep(1000);
		driver.findElement(By.id("first_name")).sendKeys("Asiafi");

		Thread.sleep(1000);
		driver.findElement(By.id("last_name")).sendKeys("Ashfi");

		Thread.sleep(1000);
		driver.findElement(By.id("address")).sendKeys("2/11,North_street_paris");

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='text'])[13]")).sendKeys("5649846285137892");

		WebElement cards = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select card = new Select(cards);
		Thread.sleep(1000);
		card.selectByIndex(1);

		WebElement expirydate = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select expiry = new Select(expirydate);
		Thread.sleep(1000);
		expiry.selectByValue("8");

		WebElement year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select yr = new Select(year);
		Thread.sleep(1000);
		yr.selectByIndex(18);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys("254");

		driver.findElement(By.xpath("//input[@id='book_now']")).click();



		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("my_itinerary")).click();


		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='check_all']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Cancel Selected']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Logout']")).click();

  
		
		
		TakesScreenshot mini = (TakesScreenshot)driver;
		File a = mini.getScreenshotAs(OutputType.FILE);
		File b = new File("C:\\Selenium\\Screenshot/miniproject.png");
		FileHandler.copy(a, b);
  


	}













}
