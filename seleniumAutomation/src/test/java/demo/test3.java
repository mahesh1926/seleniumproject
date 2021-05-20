package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class test3 {
	
	public WebDriver driver;
	@Parameters({"browsername"})
	@Test
	public void demo(String browser) {
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else {
			driver=new FirefoxDriver();
		}
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("mahesh.shashittal@facebook.com");
		driver.findElement(By.id("pass")).sendKeys("2385677");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();
		Reporter.log(title,true);
		 	
	}
	
}
