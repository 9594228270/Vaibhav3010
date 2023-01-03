package com.sauceDemo.UtilityPackage;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.sauceDemo.TestPackage.TestBaseClass;

public class UtilityClass extends TestBaseClass
{
	public static void screenshotMethod(WebDriver driver, String name) throws IOException 
	{
		Date d = new Date();
		DateFormat date1 = new SimpleDateFormat("MM-DD-YY & HH-MM-SS");
		String date2 = date1.format(d);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		
		File destFile = new File("./ScreenshotFolder/"+name+date2+".jpg");
		FileHandler.copy(srcFile, destFile);
		
	}

}
