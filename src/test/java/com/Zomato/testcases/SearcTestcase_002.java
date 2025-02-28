package com.Zomato.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Zomato.pageobjects.Loginpage;

public class SearcTestcase_002 extends Baseclass {
	@Test(groups="regression")
	public void serchritems() throws InterruptedException
	{	driver.get(baseURL);
		logger.info("URL launched");
		SoftAssert asser=new SoftAssert();
		String actualtitle=driver.getTitle();
		String expectedtile="Zomato";
		asser.assertEquals(actualtitle, expectedtile);
		
		driver.manage().window().maximize();
		logger.info("window maximized");
		Loginpage loginpage=new Loginpage(driver);
		
		loginpage.searcdishes("Pizza");
		logger.info("keyword pizza entered in searchfield");
		
		Thread.sleep(12000);
		
		asser.assertAll();

		

	}
	
	@Test(groups="smoke")
	public void loginuser()
	{
		driver.get(baseURL);
		logger.info("URL launched");
		driver.manage().window().maximize();
		logger.info("window maximized");
		Loginpage loginpage=new Loginpage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginpage.login();
		loginpage.Enternumber("08762820400");
		logger.info("phone number entered");
		
		
	}
	
	@Test(groups="smoke")
	public void signup()
	{
		driver.get(baseURL);
		Loginpage loginpage=new Loginpage(driver);
		driver.manage().window().maximize();
		logger.info("window maximized");
		loginpage.signup();
		logger.info(" signup button clicked");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.xpath("//label[text()='Full Name']")).sendKeys("Tanuja");
		loginpage.enterfullname("Tanuja");
		logger.info("fullname entered");
		loginpage.enteremail("tanuja.sanikoppa@gmail.com");
		logger.info("email entered");
		loginpage.clickcheckbox();
		logger.info("checkbox clicked");
		loginpage.createaccount();
		logger.info("create account button clicked");
		
	}
	
	@Test(groups="regression")
	public void links()
	{
		driver.get(baseURL);
		logger.info("URL launched");
		
		driver.manage().window().maximize();
		logger.info("window maximized");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Loginpage loginpage=new Loginpage(driver);
		System.out.println(Loginpage.links.size());
		logger.info("total number of links printed on console");
		System.out.println("links on page are " );
		for(int i=0; i<loginpage.links.size(); i++)
		{
			System.out.println(loginpage.links.get(i).getAttribute("href"));
		}
		logger.info("all the links are printed on console");
	}
	
	

}
