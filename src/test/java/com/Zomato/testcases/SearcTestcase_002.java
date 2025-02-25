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
		Loginpage loginpage=new Loginpage(driver);
		
		loginpage.searcdishes("Pizza");
		
		Thread.sleep(12000);
		
		asser.assertAll();

		

	}
	
	@Test(groups="smoke")
	public void loginuser()
	{
		driver.get(baseURL);
		logger.info("URL launched");
		Loginpage loginpage=new Loginpage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginpage.login();
		loginpage.Enternumber("08762820400");
		
		
	}
	
	@Test(groups="smoke")
	public void signup()
	{
		driver.get(baseURL);
		Loginpage loginpage=new Loginpage(driver);
		loginpage.signup();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.xpath("//label[text()='Full Name']")).sendKeys("Tanuja");
		loginpage.enterfullname("Tanuja");
		loginpage.enteremail("tanuja.sanikoppa@gmail.com");
		loginpage.clickcheckbox();
		loginpage.createaccount();
	}
	
	@Test(groups="regression")
	public void links()
	{
		driver.get(baseURL);
		logger.info("URL launched");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Loginpage loginpage=new Loginpage(driver);
		System.out.println(Loginpage.links.size());
		
		for(int i=0; i<loginpage.links.size(); i++)
		{
			System.out.println("links on page are" + loginpage.links.get(i).getAttribute("href"));
		}
		
	}
	
	

}
