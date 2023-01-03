package com.sauceDemo.POMPackage;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_ClassLoginPage 
{
	WebDriver driver;
	
	Logger log = Logger.getLogger("sauseDemo1");
	
	@FindBy(xpath="//input[@id='user-name']")
	WebElement username;
	
	public void sendusername()
	{
	     username.sendKeys("standard_user");
	}

	
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	public void sendpassword()
	{
	     password.sendKeys("secret_sauce");
	}
	
	
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement loginBtn;
	
	public void clickloginBtn()
	{
	     loginBtn.click();
	}
	
	
	//Constructor Declared
	
	public POM_ClassLoginPage(WebDriver driver) 
	{
		this.driver =driver;
		PageFactory.initElements(driver,this);
		
	}

	

}
