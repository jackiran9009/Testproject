package com.qa.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.ActiTestBase;

public class UtilClass1 extends ActiTestBase{

	public UtilClass1()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="(//input[@type='button'])[6]")
	private WebElement scrolldesti;
	public void scrollDown()
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView();",scrolldesti);
	}
	public void screenshot() throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File f=new File("C:\\Users\\kiran\\OneDrive\\Desktop\\screenshot_selenium\\jack"+System.currentTimeMillis()+".png");
	    FileHandler.copy(src, f);
	}
}
