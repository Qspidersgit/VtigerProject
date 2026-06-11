package com.crm.GenricLibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

public class Listnerimpleneation extends BaseClass implements ITestListener  {
	ExtentReports report;
	JavaUtility j=new JavaUtility();
	ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		String name = result.getName();
		report.createTest(name);
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	String name = result.getName();
	test.log(Status.PASS, name+" IS sUCCESS");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name = result.getName();
		TakesScreenshot t=(TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		
		String dateandtimestamp = j.getDateAndTime("dd-MM-yyyy  hh-mm-ss");
		File dest = new File("./Screenshots/"+name+" "+dateandtimestamp+".png");
  try {
	Files.copy(src, dest);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		String dateandtimestamp = j.getDateAndTime("dd-MM-yyyy  hh-mm-ss");
		ExtentSparkReporter reporter=new ExtentSparkReporter("./ExtentReports/report"+dateandtimestamp+".html");
		reporter.config().setDocumentTitle("Report for Execution");
		reporter.config().setReportName("Execution Details");
		reporter.config().setTheme(Theme.DARK);
		
		report=new ExtentReports();
		report.attachReporter(reporter);
	report.setSystemInfo("url", "http://localhost:8888/");
	report.setSystemInfo("OS", "Windows");
	report.setSystemInfo("browser", "chrome");
	report.setSystemInfo("TestEngineer", "Chandrakala");
		
	}

	@Override
	public void onFinish(ITestContext context) {
	report.flush();
	}
	
	
	

}
