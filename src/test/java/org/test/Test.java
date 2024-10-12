package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

public class Test{
	
	WebDriver driver;
	
	@Parameters({"browsername"})
	@org.testng.annotations.Test
	private void test01(String browser) {

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			
		}
		
		if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
			driver.get("https://www.amazon.in/");
		}
		
		if (browser.equals("edge")) {
			driver = new EdgeDriver();
			driver.get("https://www.facebook.com/");
		}
	}
}
