package com.test1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends PageBase
{
	
	public MyAccountPage(WebDriver driver) 
	{
		super(driver);
	}

	public MyAccountPage loginAs(String username, String password)
	{
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		
		return new MyAccountPage(driver);
	}
	
	public boolean isLoginSuccessful(String username)
	{
		return driver.findElement(By.id("user_info")).getText().contains(username);
	}

}
