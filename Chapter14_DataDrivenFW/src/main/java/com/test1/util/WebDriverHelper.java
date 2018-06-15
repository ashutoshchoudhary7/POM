package com.test1.util;

import java.security.InvalidParameterException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverHelper 
{
	public static WebDriver createDriver(String browser)
	{
		WebDriver driver=null;
		
		
		if(browser.equalsIgnoreCase("FIREFOX"))
		{
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"G:\\SeleniumTraining\\Selenium\\TrainingFiles\\Software\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver",
					"G:\\SeleniumTraining\\Selenium\\TrainingFiles\\Software\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else
		{
			throw new InvalidParameterException(browser + " - is not a valid web browser for web driver.");
		}

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;
	}
	
	public static void quitDriver(WebDriver driver)
	{
		driver.quit();
	}

} 
		
