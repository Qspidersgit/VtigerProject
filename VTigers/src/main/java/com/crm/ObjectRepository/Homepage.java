package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenricLibrary.BaseClass;

public class Homepage extends BaseClass {
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']") private WebElement profile;
	@FindBy(linkText ="Sign Out") private WebElement Singout;
	
	
	
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);	}

	
	
	




	
	public WebElement getProfile() {
		return profile;
	}

	public WebElement getSingout() {
		return Singout;
	}
	
}
