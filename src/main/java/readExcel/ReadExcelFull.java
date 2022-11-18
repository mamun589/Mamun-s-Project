package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFull {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("./dataOne/ReadDataOne.xlsx");
		
		XSSFSheet sheet = wb.getSheet("Sheet1");
					
					// total row count
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		
					// total column count
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(columnCount);
		
					// printing all value using for loop
		for (int i = 1; i <=rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				String cellValue = cell.getStringCellValue();
				System.out.println(cellValue);
			}
		}
		
		// details how to do it is in the note book heading " How to see or print full excel sheet"
		//in line number 27 we put i=1 instead of 0 because we want to ignore heading "Fname and Lname" in the excel sheet

	}

}

