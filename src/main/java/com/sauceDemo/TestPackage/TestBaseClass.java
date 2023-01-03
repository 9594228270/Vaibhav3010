package com.sauceDemo.TestPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.sauceDemo.POMPackage.POM_ClassLoginPage;
import com.sauceDemo.UtilityPackage.UtilityClass;

public class TestBaseClass 
{   
	static WebDriver driver;
	
	Logger log = Logger.getLogger("sauceDemo1");
	
	@BeforeMethod
	
	public void LoginFunctionality() throws IOException
	{
        System.setProperty("webdriver.chrome.driver","./DriverFolder/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		PropertyConfigurator.configure("log4j.properties");
	
	    log.info("Browser is opened");
		
		driver.manage().window().maximize();
		log.info("Browser is maximized");
		
	
		driver.get("https://www.saucedemo.com/");
		log.info("url is opened");
		
		
        POM_ClassLoginPage lp = new POM_ClassLoginPage(driver);
		
		lp.sendusername();
		log.info("username is entered");
		
		lp.sendpassword();
		log.info("password is entered");
		
		lp.clickloginBtn();
		log.info("Clicked on LoginBtn");
		
		UtilityClass.screenshotMethod(driver,"LoginPage");
	}
	
	
		@AfterMethod
		public void browserclosemtd()
		{
			driver.close();
			log.info("Browser is closed");
			
			log.info("End of Program");
			
		}
		
}


