package com.test1.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import com.test1.pages.HomePage;
import com.test1.util.DataDrivenHelper;

public class LoginTests  extends TestBase
{
	

  
  @Test(dataProvider="dataProvider")
  public void testSuccessfulLogin(String username, String password)
  {
	  
	  boolean testResult =  homePage.clickMyAccountLink()
									  .loginAs(username, password)
									  .isLoginSuccessful(username);
	  
	  Assert.assertTrue(testResult, "Login is not successful for user " + username);
  }

  

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

}
