package com.nav;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class dataexcelfile {

	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		//Excel file --> Workbook --> Sheets--> rows --> cells
		
		//FileInputStream - reading
		//FileOutputStream - writing
		//XSSFWorkbook -- workbook
		//XSSFSheet -- sheet
		//XSSFRow -- row
		//XSSFCell -- cell
		
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet =workbook.getSheet("Data");
		int totalRows = sheet.getLastRowNum();
		int totalcells = sheet.getRow(1).getLastCellNum();
		
		for(int i=0; i<totalRows; i++) {
			XSSFRow curRow = sheet.getRow(i);
			for (int j=1; j < totalcells; j++) {
				XSSFCell curCol = curRow.getCell(j);
				if (curCol != null) {
				    System.out.println(curCol.toString());
				} else {
				    System.out.println("Cell is empty or missing at row " + i + ", column " + j);
				}

			}
			
}
		
	}

}
