package com.qa.testLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import com.qa.testBase.TestBase;

public class ExcelDataProvider extends TestBase{
	       
	       @DataProvider(name ="Data")
	       
	       public static String[][] getData()throws IOException
	       {
	    	   File excelfile = new File("C:\\Users\\bhama\\OneDrive\\Desktop\\DemoRepo\\DalalStreetRepo\\MavenProject\\TestData\\TestData.xlsx");
	    	   FileInputStream fis = new FileInputStream(excelfile); 
	    	   XSSFWorkbook wb = new XSSFWorkbook(fis);
	    	   XSSFSheet sheet = wb.getSheet("Sheet3");
	    	   int noOfRows = sheet.getPhysicalNumberOfRows();  //3
	    	   int noOfColumns = sheet.getRow(0).getLastCellNum(); //2
	    	   System.out.println(noOfRows);
	    	   System.out.println(noOfColumns);
	    	   String[][] data = new String[noOfRows-1][noOfColumns];
	    	   for(int i=0; i<noOfRows-1;i++)
	    	   {
	    		   for(int j=0; j<noOfColumns;j++)
	    		   {
	    			   DataFormatter df = new DataFormatter();
	    			   data [i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
	    			  // System.out.println(s);
	    		   }
	    	   }
	    	   wb.close();
	    	   fis.close();
	    	   return data;
	       }

}
