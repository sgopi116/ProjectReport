package org.sample;

import java.util.Date;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.test.BaseClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample  extends BaseClass{
	
	@BeforeClass
	private void browserLaunch() {

		loadBrowser();
	}
	@AfterClass
	private void closelauncher() {	

		quitBrowser();
		
	}
	
	@Test(priority = 15,enabled = false)
	private void tc1() {
		
		launchUrl("https://www.facebook.com/");
		maxWindow();
		}
	
	@Test(priority = -17)
	private void tc2() {

		launchUrl("https://www.facebook.com/");
		maxWindow();
	}
	@Test(invocationCount = 5)
	
	private void tc4()  {

		launchUrl("https://www.facebook.com/");
		maxWindow();
	}
	
	}



	
	
	

	




