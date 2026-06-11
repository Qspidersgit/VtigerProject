package com.crm.GenricLibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumUtility {
	
	public void maximizebrowser(WebDriver driver) {
	driver.manage().window().maximize();
	}
	
	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	public void navToApp(WebDriver driver,String URL) {
		driver.get(URL);
	}
	
	public void mouseHover(WebDriver driver,WebElement address) {
		Actions a=new Actions(driver);
		a.moveToElement(address).perform();
	}
	
	public void closeBrowser(WebDriver driver) {
		driver.quit();
		
	}
	
	public void chromebrowser(WebDriver driver) {
		driver=new ChromeDriver();
	}
	
	public void selectByValue(WebElement addresss,String value) {
		Select s=new Select(addresss);
		s.selectByValue(value);
	}
	public void selectByValueconstruction(WebElement addresss,String value) {
		Select s=new Select(addresss);
		s.selectByValue(value);
	}
	public void selectByValueBanking(WebElement addresss,String value) {
		Select s=new Select(addresss);
		s.selectByValue(value);
	}
	public void selectByValueEngineering(WebElement addresss,String value) {
		Select s=new Select(addresss);
		s.selectByValue(value);
	}
	
	public void selectByContainsTest(WebElement addresss,String value) {
		Select s=new Select(addresss);
		s.selectByContainsVisibleText(value);
	}
}
