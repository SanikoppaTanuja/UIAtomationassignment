package com.Zomato.pageobjects;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {
	
	WebDriver ldriver;
	
	public Loginpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	
	
	@FindBy(xpath="//a[text()='Sign up']")
	WebElement signuplink;
	
	@FindBy(xpath="//section[@label='Full Name']//section//input")
	WebElement name;
	
	@FindBy(xpath="//section[@label='Email']//section//following::input[2]")
	WebElement email;
	
	@FindBy(xpath="//input[@type='checkbox']")
	
	WebElement checkbox;
	
	@FindBy(xpath="//span[text()='Create account']")
	WebElement creataccountbtn;
	
	@FindBy(xpath="//input[contains(@placeholder,'Search for restaurant, cuisine or a dish')]")
	WebElement searchbox;
	
	@FindBy(xpath="//input[contains(@placeholder,'Search for restaurant, cuisine or a dish')]//following::div[2])]")
	WebElement Pizza;
	
	@FindBy (xpath="//a[text()='Log in']")
	WebElement loginbtn;
	
	@FindBy(xpath="//div[@type='number']//input")
	WebElement numberfield;
	
	@FindBy (xpath="//span[text()='Send One Time Password']")
	WebElement sendonetimepasswordbtn;
	
	@FindBy (tagName="a")
	public static List<WebElement> links;
	
	
	public void signup()
	{
		signuplink.click();
		
	}
	
	public void enterfullname(String username)
	{
		name.sendKeys(username);
	}
	
	public void enteremail(String emailid)
	{
		email.sendKeys(emailid);
	}
	
	public void clickcheckbox()
	{
		
		checkbox.click();
	}

	public void createaccount()
	{
		creataccountbtn.click();
	}
	public void searcdishes(String dish)
	{
		searchbox.sendKeys(dish);
		searchbox.sendKeys(Keys.ENTER);
	}
	
	public void clickonpizza()
	{
		Pizza.click();
	}
	
	public  void login()
	{
		loginbtn.click();
	}
	public void Enternumber(String nmber)
	{
		numberfield.sendKeys("number");
	}
	
	public void clickbtn()
	{
		sendonetimepasswordbtn.click();
	}
}
