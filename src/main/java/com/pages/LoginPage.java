package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
	//page locators
	private By userTextElement = By.id("login-email");
	private By passTextElement = By.id("login-password");
	private By loginBtnElement = By.id("btn-submit-login");
	private By headerElement = By.xpath("//span[@class='login-text c-hide login__header-text']");
	
	// Gumtree Australia | Free local classifieds
		public LoginPage(WebDriver driver) {
			super(driver);
		}
	//public getters	
	public WebElement getUserTextElement() {
		return getElement(userTextElement);
	}
	
	public WebElement getPassTextElement() {
		return getElement(passTextElement);
	}
	
	public WebElement getLoginBtnElement() {
		return getElement(loginBtnElement);
	}
	
	public WebElement getHeaderElement() {
		return getElement(headerElement);
	}
	
	public String getLoginPageTitle() {
		return getPageTitle();
	}
	public String getLoginPageHeader() {
		return getHeader(headerElement);
	}
	
	public HomePage login(String user,String pass) {
		getUserTextElement().sendKeys(user);
		getPassTextElement().sendKeys(pass);
		getLoginBtnElement().click();
		return getInstance(HomePage.class);
		
	}
	

	
	
	

}
