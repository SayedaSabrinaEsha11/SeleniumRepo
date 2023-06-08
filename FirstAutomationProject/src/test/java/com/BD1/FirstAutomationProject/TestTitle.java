package com.BD1.FirstAutomationProject;

//import static org.testng.Assert.assertEquals;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import NewProject.DriverSetup;
import static org.testng.Assert.assertEquals;
public class TestTitle extends DriverSetup {

	@Test
	public void testPageTilte() {

		
		driver.get("https://www.google.com");
		
		
		assertEquals(driver.getTitle(), "Googles");
		
		System.out.println("Current page url:" + driver.getCurrentUrl());
		

	}
}
