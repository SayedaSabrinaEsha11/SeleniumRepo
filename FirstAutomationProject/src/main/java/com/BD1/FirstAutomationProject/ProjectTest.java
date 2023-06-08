package com.BD1.FirstAutomationProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProjectTest {
	@Test
	public void Test() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		
	}

}
