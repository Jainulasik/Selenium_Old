package com.launchweb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2_letcodepractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleni_openwebsite\\Driver2\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letcode.in/dropdowns");
		
		WebElement Singledropdown = driver.findElement(By.id("fruits"));			
		Select single = new Select(Singledropdown);
		List<WebElement> options = single.getOptions();
		for (int i=0; i<options.size(); i++) {
			WebElement element = options.get(i);
			String text = element.getText();
			System.out.println(text);
		}
			
			single.selectByIndex(2);
			Thread.sleep(2000);
			single.selectByValue("3");
			Thread.sleep(2000);
            single.selectByVisibleText("Orange");
		}

		
		WebDriver driver = new ChromeDriver();
		driver.manage.window().maximize();
		driver.get("https://www.letcode.in/dropdowns");	
		WebElement multipledrop = driver.findElement(By.id("superheros"));
		Select multi = new Select(multipledrop);
		List<WebElement> options2 = multi.getOptions();
        for (int j=0; j<options2.size(); j++) {
    	
        	WebElement element2 = options2.get(j);
        	String text2 = element2.getText();
        	System.out.println(text2);
	
		

				
	
	
        }
        
}
        }

		


		
		
		
		
	