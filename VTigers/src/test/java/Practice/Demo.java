package Practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.GenricLibrary.BaseClass;
import com.crm.GenricLibrary.JavaUtility;
import com.crm.GenricLibrary.Listnerimpleneation;
import com.crm.ObjectRepository.Homepage;
import com.crm.ObjectRepository.OrganizationConstruction;
import com.crm.ObjectRepository.OrganizationPage;
@Listeners(Listnerimpleneation.class)
public class Demo extends BaseClass{

	
	@Test
	public void create() throws EncryptedDocumentException, IOException, InterruptedException {
		OrganizationPage hp=new OrganizationPage(driver);
		hp.getOrganizationLink().click();
		hp.getCreate().click();
		//enter org name
		//getting random number
		JavaUtility j=new JavaUtility();
		 int random = j.generateRandom(30);
		String name = f.readDatFromExcel("testdata", 2, 1);
		hp.getAccountname().sendKeys(name+" "+random);
		//enter website
		String website = f.readDatFromExcel("testdata", 1, 2);
		hp.getWebsite().sendKeys(website);
		
		//click on dropdown
		WebElement industrytype = hp.getIndustry();
		sutil.selectByValue(industrytype, "Engineering");
		
	WebElement type = hp.getAccounttype();
	sutil.selectByContainsTest(type, "Partner");
		
	
	
	//get bill address and ship address
	String billaddress = f.readDatFromExcel("testdata", 1, 3);
	String shipaddress = f.readDatFromExcel("testdata", 1, 4);
	//get bill city and ship city
	String billcity = f.readDatFromExcel("testdata", 1, 5);
	String shipcity = f.readDatFromExcel("testdata", 1, 6);
	//get bill state and ship state
	String billstate= f.readDatFromExcel("testdata", 1, 7);
	String shipstate = f.readDatFromExcel("testdata", 1, 8);
	//get bill country and ship country
	String billcountry = f.readDatFromExcel("testdata", 1, 9);
	String shipcountry= f.readDatFromExcel("testdata", 1, 10);
	//get description
	String description = f.readDatFromExcel("testdata", 1, 11);
	
	
	//enter bill address
	hp.getBill().sendKeys(billaddress);
	hp.getShipstreet().sendKeys(shipaddress);
	
	//enter bill state and ship state
	hp.getBillcity().sendKeys(billcity);
	hp.getShipcity().sendKeys(shipcity);
	
	//enter bill state and ship state
	hp.getBillstate().sendKeys(billstate);
	hp.getShipstate().sendKeys(shipstate);
	//enter bill country and ship country
	hp.getBillcountry().sendKeys(billcountry);
	hp.getShipciountry().sendKeys(shipcountry);
	//enter description
	hp.getDescription().sendKeys(description);
	Thread.sleep(5000);
	hp.getSave().click();
	Thread.sleep(5000);
	
	
	String expectedresult = "[ ACC12 ] "+name+" "+random+" - Organization Information";
			
	 String actual = driver.findElement(By.xpath("//span[text()='[ ACC12 ] "+name+" "+random+" -  Organization Information']")).getText();		
	SoftAssert s=new SoftAssert();
	s.assertEquals(actual, expectedresult);
	s.assertAll();
	
	
	}
	@Test
	public void Banking() throws EncryptedDocumentException, IOException, InterruptedException {
	OrganizationConstruction oc=new OrganizationConstruction(driver);
	oc.getOrganizationLink().click();
	oc.getCreate().click();
	//enter org name
	//getting random number
	JavaUtility j1=new JavaUtility();
	 int random = j1.generateRandom(30);
	String name = f.readDatFromExcel("testdata", 2, 1);
	oc.getAccountname().sendKeys(name+" "+random);
	//enter website
	String website = f.readDatFromExcel("testdata", 1, 2);
	oc.getWebsite().sendKeys(website);
	
	//click on dropdown
	WebElement constrction = oc.getIndustry();
	sutil.selectByValue(constrction, "Construction");
	
WebElement type = oc.getAccounttype();
sutil.selectByContainsTest(type, "Partner");
	


//get bill address and ship address
String billaddress = f.readDatFromExcel("testdata", 1, 3);
String shipaddress = f.readDatFromExcel("testdata", 1, 4);
//get bill city and ship city
String billcity = f.readDatFromExcel("testdata", 1, 5);
String shipcity = f.readDatFromExcel("testdata", 1, 6);
//get bill state and ship state
String billstate= f.readDatFromExcel("testdata", 1, 7);
String shipstate = f.readDatFromExcel("testdata", 1, 8);
//get bill country and ship country
String billcountry = f.readDatFromExcel("testdata", 1, 9);
String shipcountry= f.readDatFromExcel("testdata", 1, 10);
//get description
String description = f.readDatFromExcel("testdata", 1, 11);


//enter bill address
oc.getBill().sendKeys(billaddress);
oc.getShipstreet().sendKeys(shipaddress);

//enter bill state and ship state
oc.getBillcity().sendKeys(billcity);
oc.getShipcity().sendKeys(shipcity);

//enter bill state and ship state
oc.getBillstate().sendKeys(billstate);
oc.getShipstate().sendKeys(shipstate);
//enter bill country and ship country
oc.getBillcountry().sendKeys(billcountry);
oc.getShipciountry().sendKeys(shipcountry);
//enter description
oc.getDescription().sendKeys(description);
Thread.sleep(5000);
oc.getSave().click();
Thread.sleep(5000);


String expectedresult = "[ ACC12 ] "+name+" "+random+" - Organization Information";
		
 String actual = driver.findElement(By.xpath("//span[text()='[ ACC12 ] "+name+" "+random+" -  Organization Information']")).getText();		
SoftAssert s=new SoftAssert();
s.assertEquals(actual, expectedresult);
s.assertAll();
	
}
	@Test
	public void Engineering() throws EncryptedDocumentException, IOException, InterruptedException {
	OrganizationConstruction oc=new OrganizationConstruction(driver);
	oc.getOrganizationLink().click();
	oc.getCreate().click();
	//enter org name
	//getting random number
	JavaUtility j1=new JavaUtility();
	 int random = j1.generateRandom(30);
	String name = f.readDatFromExcel("testdata", 2, 1);
	oc.getAccountname().sendKeys(name+" "+random);
	//enter website
	String website = f.readDatFromExcel("testdata", 1, 2);
	oc.getWebsite().sendKeys(website);
	
	//click on dropdown
	WebElement Banking1 = oc.getIndustry();
	sutil.selectByValue(Banking1, "Construction");
	
WebElement type = oc.getAccounttype();
sutil.selectByContainsTest(type, "Partner");
	


//get bill address and ship address
String billaddress = f.readDatFromExcel("testdata", 1, 3);
String shipaddress = f.readDatFromExcel("testdata", 1, 4);
//get bill city and ship city
String billcity = f.readDatFromExcel("testdata", 1, 5);
String shipcity = f.readDatFromExcel("testdata", 1, 6);
//get bill state and ship state
String billstate= f.readDatFromExcel("testdata", 1, 7);
String shipstate = f.readDatFromExcel("testdata", 1, 8);
//get bill country and ship country
String billcountry = f.readDatFromExcel("testdata", 1, 9);
String shipcountry= f.readDatFromExcel("testdata", 1, 10);
//get description
String description = f.readDatFromExcel("testdata", 1, 11);


//enter bill address
oc.getBill().sendKeys(billaddress);
oc.getShipstreet().sendKeys(shipaddress);

//enter bill state and ship state
oc.getBillcity().sendKeys(billcity);
oc.getShipcity().sendKeys(shipcity);

//enter bill state and ship state
oc.getBillstate().sendKeys(billstate);
oc.getShipstate().sendKeys(shipstate);
//enter bill country and ship country
oc.getBillcountry().sendKeys(billcountry);
oc.getShipciountry().sendKeys(shipcountry);
//enter description
oc.getDescription().sendKeys(description);
Thread.sleep(5000);
oc.getSave().click();
Thread.sleep(5000);


String expectedresult = "[ ACC12 ] "+name+" "+random+" - Organization Information";
		
 String actual = driver.findElement(By.xpath("//span[text()='[ ACC12 ] "+name+" "+random+" -  Organization Information']")).getText();		
SoftAssert s=new SoftAssert();
s.assertEquals(actual, expectedresult);
s.assertAll();
	
}
	@Test
	public void construction() throws EncryptedDocumentException, IOException, InterruptedException {
	OrganizationConstruction oc=new OrganizationConstruction(driver);
	oc.getOrganizationLink().click();
	oc.getCreate().click();
	//enter org name
	//getting random number
	JavaUtility j1=new JavaUtility();
	 int random = j1.generateRandom(30);
	String name = f.readDatFromExcel("testdata", 2, 1);
	oc.getAccountname().sendKeys(name+" "+random);
	//enter website
	String website = f.readDatFromExcel("testdata", 1, 2);
	oc.getWebsite().sendKeys(website);
	
	//click on dropdown
	WebElement Engineering4 = oc.getIndustry();
	sutil.selectByValue(Engineering4, "Construction");
	
WebElement type = oc.getAccounttype();
sutil.selectByContainsTest(type, "Partner");
	


//get bill address and ship address
String billaddress = f.readDatFromExcel("testdata", 1, 3);
String shipaddress = f.readDatFromExcel("testdata", 1, 4);
//get bill city and ship city
String billcity = f.readDatFromExcel("testdata", 1, 5);
String shipcity = f.readDatFromExcel("testdata", 1, 6);
//get bill state and ship state
String billstate= f.readDatFromExcel("testdata", 1, 7);
String shipstate = f.readDatFromExcel("testdata", 1, 8);
//get bill country and ship country
String billcountry = f.readDatFromExcel("testdata", 1, 9);
String shipcountry= f.readDatFromExcel("testdata", 1, 10);
//get description
String description = f.readDatFromExcel("testdata", 1, 11);


//enter bill address
oc.getBill().sendKeys(billaddress);
oc.getShipstreet().sendKeys(shipaddress);

//enter bill state and ship state
oc.getBillcity().sendKeys(billcity);
oc.getShipcity().sendKeys(shipcity);

//enter bill state and ship state
oc.getBillstate().sendKeys(billstate);
oc.getShipstate().sendKeys(shipstate);
//enter bill country and ship country
oc.getBillcountry().sendKeys(billcountry);
oc.getShipciountry().sendKeys(shipcountry);
//enter description
oc.getDescription().sendKeys(description);
Thread.sleep(5000);
oc.getSave().click();
Thread.sleep(5000);


String expectedresult = "[ ACC12 ] "+name+" "+random+" - Organization Information";
		
 String actual = driver.findElement(By.xpath("//span[text()='[ ACC12 ] "+name+" "+random+" -  Organization Information']")).getText();		
SoftAssert s=new SoftAssert();
s.assertEquals(actual, expectedresult);
s.assertAll();
	
}
}
