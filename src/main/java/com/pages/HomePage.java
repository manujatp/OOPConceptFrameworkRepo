package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage{

	By userLinkElement = By.xpath("//div//span[@class='header__my-gumtree-trigger-text']");
	By signOutLink = By.xpath("//span[text()='Sign Out']");


	public HomePage(WebDriver driver) {
		super(driver);
	}

	public WebElement getUserLinkElement() {
		return getElement(userLinkElement);
	}



	public WebElement getSignOutLink() {
		return getElement(signOutLink);
	}
	public LoginPage logout() {
		Actions a = new Actions(driver);
		getUserLinkElement().click();
		a.moveToElement(getSignOutLink()).click().perform();
		return getInstance(LoginPage.class);
	}


}
