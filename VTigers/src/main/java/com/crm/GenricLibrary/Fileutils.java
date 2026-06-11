package com.crm.GenricLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class Fileutils {
	public String Readdatafrompropertyfile(String Key) throws IOException {
		FileInputStream fis=new FileInputStream(Ipathconstants.propertypath);
		Properties p=new Properties();
		p.load(fis);
		String URL=p.getProperty(Key);
		return URL;
		
		
	}
	
	public String  readDatFromExcel(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(Ipathconstants.excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	

}
