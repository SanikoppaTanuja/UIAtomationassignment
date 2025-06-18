package com.Zomato.testcases;

import org.testng.annotations.Test;

import com.Zomato.pageobjects.Loginpage;

public class Logintestcase_002 extends Baseclass {
	
	@Test
	public void login()
	{
		driver.get(baseURL);
		logger.info("URL launched");
		driver.manage().window().maximize();
		logger.info("window maximized");
		Loginpage loginpage=new Loginpage(driver);
		
		loginpage.login();
		logger.info("login button clocked");
		loginpage.Enternumber(baseURL);
		logger.info("number entered");
		loginpage.clickbtn();
		logger.info("sendoptbtn clicked");
		
		
		
		
	}

}
