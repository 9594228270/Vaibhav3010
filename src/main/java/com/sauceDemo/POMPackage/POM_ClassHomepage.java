package com.sauceDemo.POMPackage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_ClassHomepage 
{
	
	
	@FindBy(xpath="//button[text()='Add to cart']")
	List<WebElement>product;
	
	public void AllProductClick()
	{
		for(WebElement vgs:product)
		{
			vgs.click();
		}
	}
	
	
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	WebElement addToCartBtn;
	
	public String getTextFromAddToCartBtn()
	{
        String totalProductSelected = addToCartBtn.getText();
	    return totalProductSelected;

	}
	
	//pomclass Logout Functionality
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	WebElement settingBtn;
	
	public void settingBtnMethod()
	{
		settingBtn.click();
		System.out.println("Clicked on setting button");
	}
	
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	WebElement logoutBtn;
	private WebDriver driver;
	
    public void logoutBtnMethod()
    {
    	logoutBtn.click();
    	System.out.println("Clicked on LOgout Btn");
    }
	
	
	
	//Constructor declared
	public POM_ClassHomepage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	

}
