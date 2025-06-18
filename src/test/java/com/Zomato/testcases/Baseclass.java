package com.Zomato.testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public String baseURL="https://www.zomato.com/";
	WebDriver driver;
	public static Logger logger;
	


	
	
	
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		if(br.equals("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		
		else if(br.equals("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		
		else if(br.equals("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
			driver.get("https://www.zomato.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		logger=logger.getLogger("Baseclass");
		PropertyConfigurator.configure("C:\\Users\\Tanuja\\OneDrive\\Desktop\\Tanujaprograms\\reliance\\Properties\\log4j.properties");
		
	}
	
	public void captureScreenShot(WebDriver driver,String testName) throws IOException
	{
		//step1: convert webdriver object to TakesScreenshot interface
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		
		//step2: call getScreenshotAs method to create image file
		
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		
		File dest = new File(System.getProperty("user.dir") + "//Screenshots//" + testName + ".png");
	
		//step3: copy image file to destination
		FileUtils.copyFile(src, dest);
	}
	
	@AfterClass
	public void teardown() throws Exception
	
	{
		
		driver.close();
		driver.quit();
		
	}
	
	

}
	




