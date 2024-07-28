package com.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_w3school {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
        System.out.println("*************ALL DATA**************");
		
		List<WebElement> alldta = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
		for (int i=0;i<alldta.size(); i++) {
		WebElement all = alldta.get(i);
		String text = all.getText();
		System.out.println(text);
		}
		
		System.out.println("*******PARTICULAR DATA**********");
		
        List<WebElement> partic = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[3]/td[3]"));
        for (int a=0; a<partic.size(); a++) {
        	WebElement part = partic.get(a);
        	String texts = part.getText();
        	System.out.println(texts);
        	
        }
		
		 System.out.println("*************ROW DATA**************");
		
		List<WebElement> Rowdata = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[5]/td[3]"));
		for (int j=0; j<Rowdata.size();j++) {
			WebElement row = Rowdata.get(j);
			String text2 = row.getText();
			System.out.println(text2);
		}
			
         System.out.println("*************COLOUMN DATA**************");
			
            
		List<WebElement> coloumn = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
		for (int k=0; k<coloumn.size(); k++) {
			WebElement colo = coloumn.get(k);
			String text3 = colo.getText();
			System.out.println(text3);
		}
			
	    System.out.println("***********HEADER DATA*******************");
	    
	    List<WebElement> header = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
	    for (int l=0; l<header.size(); l++) {
	    	WebElement head = header.get(l);
	    	String text4 = head.getText();
	    	System.out.println(text4);
	    }
	    
	       System.out.println("*********PARTICULAR HEADER DATA*****************"); 
	    
	    List<WebElement> header2 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th[1]"));
	    for (int b=0; b<header2.size(); b++) {
	    	WebElement head2 = header2.get(b);
	    	String text3 = head2.getText();
	    	System.out.println(text3);
	    }
         
	       System.out.println("*********PARTICULAR COLOUMN*****************"); 
	    
	    List<WebElement> partirow = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[7]/td[2]"));
	    for (int c=0; c<partirow.size();c++) {
	    	WebElement partroww = partirow.get(c);
	    	String text4 = partroww.getText();
	    	System.out.println(text4);
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
           	    }
	    	
		}
		
	
	    	
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
			
	

