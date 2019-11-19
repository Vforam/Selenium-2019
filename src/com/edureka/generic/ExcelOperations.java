package com.edureka.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperations 
{
	static File objFile = null;
	static Workbook objWorkbook = null;
	static Sheet objsheet = null;
	static FileInputStream objfilestream = null;
	static FileOutputStream outputStream = null;
	public static String[][] getData(String filename, String sheetname) throws IOException
	{
		try {
			objFile = new File(filename);
			objfilestream = new FileInputStream(objFile);
			objWorkbook= new XSSFWorkbook(objfilestream);
			objsheet=objWorkbook.getSheet(sheetname);
			int rows= objsheet.getLastRowNum()+1;
			int cells= objsheet.getRow(0).getLastCellNum();
			String[][] data=new String[rows][cells];
			for(int i=0;i<rows;i++) 
			{
				Row r=objsheet.getRow(i);
				for(int j=0;j<cells;j++) 
				{
					Cell c=r.getCell(j);
					String cellValue=new DataFormatter().formatCellValue(c);
					data[i][j]=cellValue;
				}
			}
			return data;
			} 
			catch (IOException e) {
			System.out.print(e.getMessage());
			return null;
			}
			finally {
			objWorkbook.close();
			objfilestream.close();
			}	
	}
	public static void updateStatus(String filename, String sheetname, String datatoWrite) throws IOException
	{
		try {
			objFile = new File(filename);
			objfilestream = new FileInputStream(objFile);
			
			objWorkbook= new XSSFWorkbook(objfilestream);
			objsheet = objWorkbook.getSheet("TestResult");
			
			//Create a new row and append it at last of sheet
			Row newRow = objsheet.createRow(1);
			
			Cell cell = newRow.createCell(0);
		    cell.setCellValue(datatoWrite);
		     
			//Close input stream
			objfilestream.close();
			
			//Create an object of FileOutputStream class to create write data in excel file
			outputStream = new FileOutputStream(objFile);
			
			 //write data in the excel file
			objWorkbook.write(outputStream);
			
			//close output stream
		    outputStream.close();
						
		} catch (IOException e) {
			System.out.print(e.getMessage());
		}
		finally {
			objWorkbook.close();
			objfilestream.close();
		}
	}
	
}
