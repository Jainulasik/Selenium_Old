package com.launchweb;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {

	// Take Screenshot what i need .
	
	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "D:\\Seleni_openwebsite\\Driver2\\chromedriver.exe");
	WebDriver Ss = new ChromeDriver();
		Ss.get("https://www.myntra.com");
		
	TakesScreenshot Scree = (TakesScreenshot)Ss;
		File A = Scree.getScreenshotAs(OutputType.FILE);
		File B = new File ("D:\\Seleni_openwebsite\\TakeScreenshots//Myntra.png");
		FileHandler.copy(A, B);
		
		
		;

		
		
		
		
	}
}
