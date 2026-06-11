package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenricLibrary.BaseClass;

public class LoginPage extends BaseClass {
	
	//decalration
	@FindBy(name="user_name") private WebElement usname;
	@FindBy(name="user_password") private WebElement pawrd;
	@FindBy(id="submitButton") private WebElement logbt;

	
	//Intitialzattion
	
	 public LoginPage( WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		

}


	public WebElement getUsname() {
		return usname;
	}


	public WebElement getPawrd() {
		return pawrd;
	}


	public WebElement getLogbt() {
		return logbt;
	}
	
	
	//bussiness logic /generic method
	public void loginToVtiger(String username,String password) {
		LoginPage lp=new LoginPage(driver);
		lp.getUsname().sendKeys(username);
		lp.getPawrd().sendKeys(password);
		lp.getLogbt().click();
	}
	
	
}