package com.chatwhizz.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver Idriver;
	 public LoginPage(WebDriver rdriver)
	 {
		 Idriver=rdriver;
		 PageFactory.initElements(rdriver, this);
	 }
	 
	 @FindBy(how=How.XPATH, using="//input[@placeholder='Username']") 
	 @CacheLookup 	
	 WebElement txtUserName;
		
	 @FindBy(how=How.XPATH, using="//input[@placeholder='Password']") 
	 @CacheLookup 	
	 WebElement txtPassword;
		
		@FindBy(how=How.XPATH,using="//button[contains(text(),'Login Now')]") 
		@CacheLookup 	
		WebElement btnLogin;
		
		
		
		public void setUserName(String uname)
		{
			txtUserName.sendKeys(uname);
		}
		
		public void setPassword(String pwd)
		{
			txtPassword.sendKeys(pwd);
		}
		
		public void loginBtn()
		{
			btnLogin.click();
		}
		
		
		
		
}
