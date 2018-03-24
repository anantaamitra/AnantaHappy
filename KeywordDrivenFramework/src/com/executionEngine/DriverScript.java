package com.executionEngine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DriverScript {

	private static WebDriver driver = null;
	
	@Test
	
	public void keywordDriven() throws Exception {
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
				
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.xpath(".//*[@id='login_Layer']")).click();
		
		Thread.sleep(5000);
		
		
        driver.quit();
        
	}
	
	
}
