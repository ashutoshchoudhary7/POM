package com.test1.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test1.pages.HomePage;

public class ShopPageTests extends TestBase
{

	  
	  @Test(dataProvider="dataProvider")
	  public void testApplyingSortOrder(String sortOrder)
	  {
		  
		  String actualSortOrder =  homePage.clickShopLink()
							  			.setSortOrder(sortOrder)
							  			.getSortOrder();
		  
		  Assert.assertTrue(actualSortOrder.equals(sortOrder), 
				  				"Sort order is not applied properly");
	  }
	  
//	  @Test
//	  public void testName()
//	  {
//		  homePage.clickShopLink()
//		  			.
//	  }

}
