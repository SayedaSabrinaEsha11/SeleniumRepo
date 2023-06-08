package com.BD1.FirstAutomationProject;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyProject {
	@Test
	public void testPageTilte() {
			WebDriver driver = new ChromeDriver();
			
			driver.manage(). window ().maximize();
			
			driver.get("https://www.google.com");
			
			assertEquals(driver.getTitle(),"Google");		
			System.out.println();
			
			driver.close();
	
		}

}
