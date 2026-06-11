package com.crm.GenricLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import com.crm.ObjectRepository.Homepage;
import com.crm.ObjectRepository.LoginPage;

public class BaseClass {
	
	public static WebDriver driver;
	public Fileutils f=new Fileutils();
	public SeleniumUtility sutil=new SeleniumUtility();
	

	@BeforeSuite
	public void DataBaseconnect() {
		Reporter.log("data base connected", true);
	}
	
	@BeforeTest
	public void launchbrowser( @Optional ("safari") String BROWSER) throws IOException {
		 if (BROWSER.equals("chrome")) {
			driver=new ChromeDriver();
		} 
		 
		 else if (BROWSER.equals("firefox")) {
			driver=new FirefoxDriver();
			
		}else if (BROWSER.equals("edge")) {
			driver=new EdgeDriver();
			
		}
		else{
          driver=new ChromeDriver();
		}
		sutil.maximizebrowser(driver);
		sutil.implicitWait(driver);
		String url=f.Readdatafrompropertyfile("url");
		sutil.navToApp(driver, url);
		
		Reporter.log("Browser launched succesfully",true);
		
	}
	
@BeforeMethod
public void login() throws IOException {
	
	String un=f.Readdatafrompropertyfile("uname");
	LoginPage lp=new LoginPage(driver);
	String pw=f.Readdatafrompropertyfile("password");
	lp.loginToVtiger(un, pw);
	
	Reporter.log("loggedin succesfully", true);
		
		
//	String un=f.Readdatafrompropertyfile("uname");
//	driver.findElement(By.name("user_name")).sendKeys(un);
//	
//
//	String pw=f.Readdatafrompropertyfile("password");
//	driver.findElement(By.name("user_password")).sendKeys(pw);
//	driver.findElement(By.id("submitButton")).click();
//	Reporter.log("Loggin lunched sucefuly",true);
//}
	}

@AfterMethod
public void logout() {
	 Homepage hm=new Homepage(driver);
WebElement element=hm.getProfile();
	sutil.mouseHover(driver, element);
	hm.getSingout().click();
			Reporter.log("loggedout succefully", true);
}
@AfterTest

public void closebrowser() {
	sutil.closeBrowser(driver);
	Reporter.log("closed bowser succefully", true);
}
@AfterSuite
public void disconncetdatabase() {
	Reporter.log("data base disconnected succefully", true);
	
}
}
