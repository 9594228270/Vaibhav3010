package com.sauceDemo.TestPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.POMPackage.POM_ClassHomepage;

public class TC03_VerifyLogoutFunctionality extends TestBaseClass 
{
	
	@Test
	public void logoutmethod()
	{
		
		POM_ClassHomepage hp = new POM_ClassHomepage(driver);
		hp.settingBtnMethod();
		log.info("Clicked on logout btn");
		
		hp.logoutBtnMethod();
		log.info("Clicked on logoutBtn");
		
	}
				
}


