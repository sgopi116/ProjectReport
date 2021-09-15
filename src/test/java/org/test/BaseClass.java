package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Actions a;
	public static Alert alert;
	public static TakesScreenshot tk;
	public static Robot r;
	public static JavascriptExecutor js;
	public static Select sel;

	public static void loadBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void openFirefox() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

	}

	public static void msEdge() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}

	public static void quitBrowser() {
		driver.quit();

	}

	public static void closeBrowser() {
		driver.close();

	}

	public static void maxWindow() {
		driver.manage().window().maximize();

	}

	public static void pageTitle() {
		String titleName = driver.getTitle();
		System.out.println(titleName);

	}

	public static void pageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

	public static void launchUrl(String url) {
		driver.get(url);

	}

	public static void fillTextBox(WebElement element, String value) {

		element.sendKeys(value);
	}

	public static void printText(WebElement element) {
		element.getText();
	}

	public static void getAttValue(WebElement element, String value) {
		element.getAttribute(value);
	}

	public static void moveElement(WebElement element) {

		a = new Actions(driver);
		a.moveToElement(element).perform();

	}

	public static void dragDrop(WebElement src, WebElement des) {
		a = new Actions(driver);
		a.dragAndDrop(src, des).perform();
	}

	public static void toAccept() {
		alert = driver.switchTo().alert();
		alert.accept();
	}

	public static void toDismiss() {
		alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public static void btnClick(WebElement ref) {
		ref.click();
	}

	public static void copy() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);

	}

	public static void pgDown(String value, WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript(value, element);

	}

	public static void option(WebElement element) {
		sel = new Select(element);
		sel.getOptions();
	}

	public static void windowHandle() {
		driver.getWindowHandle();
	}

	public static void byVisibleText(WebElement element, String value) {
		sel = new Select(element);
		sel.selectByVisibleText(value);

	}

	public static void byValue(WebElement element, String value) {
		sel = new Select(element);
		sel.selectByValue(value);
	}
	public static void byIndex(WebElement element,int index) {
		sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	

}
