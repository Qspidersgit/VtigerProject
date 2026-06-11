package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenricLibrary.BaseClass;

public class OrganizationConstruction extends BaseClass{
		@FindBy(linkText = "Organizations") private WebElement organizationLink;
		@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']") private WebElement create;
		@FindBy(name="accountname") private WebElement accountname;
		@FindBy(name="website") private WebElement website;
		@FindBy(name="industry") private WebElement industry;
		@FindBy(name="accounttype") private WebElement accounttype;
		@FindBy(name="bill_street") private WebElement Bill;
		@FindBy(name="bill_city") private WebElement Billcity;
		@FindBy(name="description") private WebElement description;
		@FindBy(xpath ="//input[@class='crmbutton small save'][1]") private WebElement save;
		@FindBy(name = "ship_street") private WebElement shipstreet;
		@FindBy(name = "ship_city") private WebElement shipcity;
		@FindBy (name = "bill_state")private WebElement  billstate;
		@FindBy(name = "ship_state") private WebElement shipstate;
		@FindBy (name = "bill_country")private WebElement  billcountry;
		@FindBy(name = "ship_country") private WebElement shipciountry;
		@FindBy(name = "button") private WebElement cancelbtn;
		
		public OrganizationConstruction(WebDriver driver) {
			PageFactory.initElements(driver, this);	}

		public WebElement getOrganizationLink() {
			return organizationLink;
		}

		public WebElement getCreate() {
			return create;
		}

		public WebElement getAccountname() {
			return accountname;
		}

		public WebElement getWebsite() {
			return website;
		}

		public WebElement getIndustry() {
			return industry;
		}

		public WebElement getAccounttype() {
			return accounttype;
		}

		public WebElement getBill() {
			return Bill;
		}

		public WebElement getBillcity() {
			return Billcity;
		}

		public WebElement getDescription() {
			return description;
		}

		public WebElement getSave() {
			return save;
		}

		public WebElement getShipstreet() {
			return shipstreet;
		}

		public WebElement getShipcity() {
			return shipcity;
		}

		public WebElement getBillstate() {
			return billstate;
		}

		public WebElement getShipstate() {
			return shipstate;
		}

		public WebElement getBillcountry() {
			return billcountry;
		}

		public WebElement getShipciountry() {
			return shipciountry;
		}

		public WebElement getCancelbtn() {
			return cancelbtn;
		}
		
		
	}


