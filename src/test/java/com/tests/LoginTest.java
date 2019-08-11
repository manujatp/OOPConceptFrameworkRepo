package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.LoginPage;

public class LoginTest extends BaseTest{
	HomePage homePage;
	@Test(priority = 1)
	public void verifyLoginPageTitleTest() {
		
		String title = page.getInstance(LoginPage.class).getLoginPageTitle();
		
		Assert.assertEquals(title, "Gumtree Australia | Free local classifieds.");
	}
	
	@Test(priority = 2)
	public void verifyLoginPageHeaderTest() {
		String header = page.getInstance(LoginPage.class).getLoginPageHeader();
		Assert.assertEquals(header, "Sign in");
	}
	
	@Test(priority =3)
	public void doLoginTest() {
	  homePage = page.getInstance(LoginPage.class).login("phmanuja@gmail.com", "Karunyam16#");
	//	homePage.logout();	
	}
	
	
}
