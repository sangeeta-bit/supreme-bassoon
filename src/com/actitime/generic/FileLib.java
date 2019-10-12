package com.actitime.generic;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class FileLib {
	
	public String getExceldata(String excelpath, String sheet, int r, int c) throws Throwable{
	FileInputStream fis = new FileInputStream(excelpath);
	Workbook wb = WorkbookFactory.create(fis);
	String value = wb.getSheet(sheet).getRow(r).getCell(c).toString();
	return value;
	}

	public int getRowCount(String excelpath, String sheet) throws Throwable{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		int rowvalue = wb.getSheet(sheet).getLastRowNum();
		return rowvalue;	
	}
	
	public String getPropValue(String Prop_path, String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream(Prop_path);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key, "Key Not Found");
		
		return value;	
	}
	
	
	
}
