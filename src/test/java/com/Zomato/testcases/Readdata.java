package com.Zomato.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Readdata {
	@Test
	public void readdata() throws IOException
	{
		File src=new File("C:\\Users\\Tanuja\\OneDrive\\Desktop\\Tanujaprograms\\Zomato\\src\\test\\resources\\testdata\\Zomatosheet.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Signup");
		String entry1=sheet.getRow(2).getCell(1).getStringCellValue();
		System.out.println(entry1);
		
	}

}
