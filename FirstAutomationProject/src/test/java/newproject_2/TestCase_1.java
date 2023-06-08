package newproject_2;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import NewProject.DriverSetup;
@Test
public class TestCase_1 extends DriverSetup{
	@Test
	public void nevigateToAPage() throws InterruptedException {
		driver.get ("https://search.yahoo.com/search?fr");
		driver .navigate().to("https://www.youtube.com/");
		driver .navigate().back();
		driver.navigate().forward();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			driver.navigate().refresh();
			Thread.sleep(2000);
		}
		//driver.navigate().refresh();
		//Thread.sleep(2000);
		
	}
	
    @Test
	private void handleBrowserWindow() {
		driver .navigate().to("https://www.youtube.com/");
		System.out.println(driver.getTitle());
		driver . switchTo().newWindow(WindowType.TAB);
		driver.get ("https://search.yahoo.com/search?fr");
		System.out.println(driver.getTitle());
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver .navigate().to("https://linkdln.com/");
		System.out.println(driver.getTitle());
		
		//Thread.sleep(5000);
	}
    @Test
	private void BrowserWindow () throws InterruptedException {
		driver .navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("opentab")) .click ();
		driver.findElement(By.id("openwindow")) .click ();
		System.out.println(driver.getTitle());
		
    }	
}