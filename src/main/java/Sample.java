import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.test.BaseClass;

public class Sample extends BaseClass {

	@BeforeClass
	public static void browserLaunch() {

		loadBrowser();
		launchUrl("https://www.facebook.com/");
		maxWindow();
	}
	@AfterClass
	public static void browserClose() {

		closeBrowser();
	}
	
	@Before
	public void startTime() {

		Date d = new Date();
		System.out.println(d);
	}
	
	@After
	public void endTime() {

		Date d = new Date();
		System.out.println(d);
	}
	@Test
	public void tc1() throws InterruptedException {

		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("greens");
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("189794");
		WebElement btnLogin = driver.findElement(By.xpath("//button[@name='login']"));
		btnLogin.click();
		Thread.sleep(2000);
	}
	
	@Test
	public void tc2() throws InterruptedException {
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("greens.@$%");
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("189794");
		WebElement btnLogin = driver.findElement(By.xpath("//button[@name='login']"));
		btnLogin.click();
		Thread.sleep(2000);

	}
	public void tc3() {
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("greens");
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("189.7.94");
		WebElement btnLogin = driver.findElement(By.xpath("//button[@name='login']"));
		btnLogin.click();

	}
	
	
	
	
	
	
	

}
