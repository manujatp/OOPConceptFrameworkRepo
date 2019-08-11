package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.pages.BasePage;
import com.pages.Page;

public class BaseTest {
	
	WebDriver driver;
	public Page page;
	
	
	@BeforeMethod
	@Parameters(value = {"browser"})
	public void setUpTest(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/resource/java/driver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("ff")) {
			System.setProperty("webdriver.gecko.driver", "./src/resource/java/driver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("No browser is defined in the testng file");
		}
		
		driver.get("https://www.gumtree.com.au/t-login-form.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		page = new BasePage(driver);
	}

	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
