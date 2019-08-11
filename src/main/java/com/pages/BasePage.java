package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends Page{
	
	public BasePage(WebDriver driver) {
		super(driver);
	}
	

	@Override
	public String getPageTitle() {
		
		return driver.getTitle();
	}
	@Override
	public String getHeader(By locator) {
		return getElement(locator).getText();
		 
	}

	@Override
	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
			waitForElement(locator);
			element = driver.findElement(locator);
			return element;
		}
		catch(Exception e) {
			System.out.println("Some error occured while creating elelement"+ locator.toString());
			e.printStackTrace();
		}
		return element;
	}
	

	@Override
	public void waitForElement(By locator) {
	
		try {
			wait.until(ExpectedConditions.elementToBeClickable(locator));
		}
		catch(Exception e) {
			
			System.out.println("Some exception/error occured while waiting for the element"+locator.toString());
		}
	}

	@Override
	public void waitForPageTitle(String title) {
		try {
			wait.until(ExpectedConditions.titleContains(title));
		}
		catch(Exception e) {
			
			System.out.println("Some exception/error occured while waiting for the element"+title);
		}
		
	}


}
