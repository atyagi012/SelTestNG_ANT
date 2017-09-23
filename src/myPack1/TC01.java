package myPack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC01 {
	WebDriver driver;
	String url;
	
	@BeforeMethod
	public void atStart(){
		//driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Projects\\Selenium_Files\\Chrome_Driver_New\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		url = "http://www.google.com";
	}
	
	@Test
	public void atTestGoogle(){
		driver.get(url);
		
		System.out.println(driver.getTitle());
	}
	
	@AfterMethod
	public void atAfter(){
		driver.quit();
	}
}
