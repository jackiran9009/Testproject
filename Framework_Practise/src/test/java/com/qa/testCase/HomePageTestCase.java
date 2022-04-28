package com.qa.testCase;

import org.testng.annotations.Test;

import com.qa.testBase.ActiTestBase;

public class HomePageTestCase extends ActiTestBase {

	@Test
	public void verifyDropdown()
	{
		lo.sendkeysUsername();
		lo.sendkeysPassword();
		lo.clickLoginbutton();
		ho.sendkeys_1();
		ut.scrollDown();
	}
	@Test
	public void verifyMonth()
	{
		lo.sendkeysUsername();
		lo.sendkeysPassword();
		lo.clickLoginbutton();
		ho.dropdown();
		ut.scrollDown();
	}
	@Test
	public void verifyDate()
	{
		lo.sendkeysUsername();
		lo.sendkeysPassword();
		lo.clickLoginbutton();
		ho.sendkeys_1();
		ho.dropdown();
		ut.scrollDown();
	}
}
