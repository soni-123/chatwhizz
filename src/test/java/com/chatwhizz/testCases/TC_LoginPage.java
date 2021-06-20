package com.chatwhizz.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.chatwhizz.pageObjects.LoginPage;
import com.chatwhizz.testCases.BaseClass;


public class TC_LoginPage extends BaseClass {
	@Test
	public void loginPage() throws  IOException, InterruptedException{

		logger.info("open URL");
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered Username");
		lp.setPassword(password);
		logger.info("Entered Password");
		Thread.sleep(5000);
		lp.loginBtn();
		Thread.sleep(5000);
		if(driver.getTitle().equals("Admin Dashboard")) 
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else {
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
	}
}
