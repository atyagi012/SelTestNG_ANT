package myPack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC03 {
	WebDriver driver;
	String url;
	
	@BeforeMethod
	public void atStart(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "http://www.cricinfo.com";
	}
	
	@Test
	public void atTestCricinfo(){
		driver.get(url);
		
		System.out.println(driver.getTitle());
	}
	
	@AfterMethod
	public void atAfter(){
		driver.quit();
	}
}
