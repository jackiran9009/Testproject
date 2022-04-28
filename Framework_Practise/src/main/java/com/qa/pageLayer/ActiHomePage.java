package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.ActiTestBase;

public class ActiHomePage extends ActiTestBase {

	public ActiHomePage()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="ActiHomePage")
	private WebElement sendk;
	@FindBy(xpath="//img[@id='ext-gen7']")
	private WebElement drop;
	public void sendkeys_1()
	{
		sendk.sendKeys("kiran");
	}
	public void dropdown()
	{
		drop.click();
	}
	
}
