package com.Zomato.testcases;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.Zomato.pageobjects.Loginpage;
import com.Zomato.utils.Readxceldata;
import com.Zomato.utils.XLUtils;
import com.aventstack.extentreports.util.Assert;


public class LoginTestcase_001 extends Baseclass{
	
	
	@Test
	
	public void signup(String name, String emailid) throws Exception
	{
		driver.get(baseURL);
		
		logger.info("url launched");
		logger.info("window maximized");
		Loginpage login=new Loginpage(driver);
		login.signup();
		logger.info("clicked on signup link");
		Thread.sleep(3000);
		login.enterfullname(name);
		logger.info("full name entered");
		Thread.sleep(2000);
		login.enteremail(emailid);
		logger.info("email entered");
		Thread.sleep(2000);
		login.clickcheckbox();
		Thread.sleep(2000);
		logger.info("checkbox clicked");
		Thread.sleep(2000);
		login.createaccount();
		Thread.sleep(2000);
		
		
	
		
		
		
	}


	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
	{
		String path="C:\\Users\\Tanuja\\OneDrive\\Desktop\\Tanujaprograms\\Zomato\\src\\test\\resources\\testdata\\Zomatosheet.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Signup");
		int colcount=XLUtils.getCellCount(path,"Signup",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Signup", i,j);//1 0
			}
				
		}
	return logindata;
	}
	


	
	
	
}








































