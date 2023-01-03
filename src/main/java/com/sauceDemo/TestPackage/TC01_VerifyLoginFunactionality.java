package com.sauceDemo.TestPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01_VerifyLoginFunactionality extends TestBaseClass 
{
	@Test
	public void validationsloginTest()
	{
		//validations
		
		String GivenTitle = "Swag Labs";
        String ActualTitle = driver.getTitle();
        
        Assert.assertEquals(GivenTitle,ActualTitle);
        
//        if(GivenTitle.equals(ActualTitle))
//        {
//        	log.info("Login test is pass");
//        }
//        else
//        {
//        	log.info("Login test is Fail");
//        }
		
		
		
	}
	

}
