package com.Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	private static void readData() throws IOException {
		
		File fpath =new File("C:\\Users\\Deva\\eclipse-workspace\\MavenProjectTest\\ExcelData\\Data.xlsx");
		FileInputStream fis = new FileInputStream(fpath);
		
		Workbook WB = new XSSFWorkbook(fis);
		Sheet sheets = WB.getSheetAt(0);
		Row row = sheets.getRow(1);
		Cell cell = row.getCell(1);
		
		CellType cellType = cell.getCellType();
		
		if (cellType.equals(cellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		}
		else if (cellType.equals(cellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int data = (int)numericCellValue;
			System.out.println(data);
		}
		WB.close();	
			
		}
	
		public static void main(String[] args) throws IOException{
			
			readData();
			
			
		}
		
	}


