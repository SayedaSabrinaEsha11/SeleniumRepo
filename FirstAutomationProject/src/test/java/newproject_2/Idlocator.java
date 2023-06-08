package newproject_2;
//import org.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import NewProject.DriverSetup;
//import org.openqa.
//import org.openqa.selenium.remote.service.DriverService;

public class Idlocator extends DriverSetup {
	@Test
	public void testoption1 () {
		
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	//String title = driver. findElement(By.cssSelector("h1")).getText();
	String title = driver. findElement(By.xpath("//h1")).getText();
	System.out.println(title);
	
	//String title = driver. findElement(By.tagName("h1")).getText();
	//System.out.println(title);
	
	WebElement optiona1 = driver.findElement(By.id("checkBoxOption1"));
	optiona1.click();
	
	WebElement optiona2 = driver. findElement(By.name("checkBoxOption1"));
	optiona2.click();
	
	WebElement radioBtn1 = driver . findElement(By.className("radioButton"));
	radioBtn1.click();
	
}
}