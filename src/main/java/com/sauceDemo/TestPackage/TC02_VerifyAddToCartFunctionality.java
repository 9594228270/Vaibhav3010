package com.sauceDemo.TestPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.POMPackage.POM_ClassHomepage;
import com.sauceDemo.UtilityPackage.UtilityClass;

public class TC02_VerifyAddToCartFunctionality extends TestBaseClass
{
    @Test
	public void allproductmethod() throws IOException
	{
		
		UtilityClass.screenshotMethod(driver,"HomePage");
		
		

		POM_ClassHomepage hp = new POM_ClassHomepage(driver);
	    
		hp.AllProductClick();
		log.info("All prduct selected");
		
		//validations
		String ExpectedProductSelected = "6";
		String ActualProductSelected =hp.getTextFromAddToCartBtn();
		if(ExpectedProductSelected.equals(ActualProductSelected))
		{
			log.info("Bag product TC is pass");
		}
		else
		{
			log.info("Bag product TC is Failed");
		}
		
        
	
		
		
	}

}
