package com.Zomato.testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public String baseURL="https://www.zomato.com/";
	WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		logger=logger.getLogger("Baseclass");
		PropertyConfigurator.configure("C:\\Users\\Tanuja\\OneDrive\\Desktop\\Tanujaprograms\\Zomato\\Properties\\log4j.properties");
		
	}
	
	@AfterClass
	public void teardown()
	
	{
		
		driver.close();
		driver.quit();
		
	}
	

}


