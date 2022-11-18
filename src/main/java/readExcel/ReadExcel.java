package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
	
						// open excel file
			XSSFWorkbook wb = new XSSFWorkbook("./data/ReadData.xlsx");
			// any path we can start with ./
			// data/ReaData is the location where i have the excel file
			// xlsx is the excel file extension
			// after type XSSFW press ctrl+space and select from the first line

						// open sheet1
			XSSFSheet sheet = wb.getSheet("Sheet1");
			// call with the object
			// start type from wb.get and the ctrl+2 L

						// select row
			XSSFRow row = sheet.getRow(2);
			// call with the object
			// start type from sheet.get and the ctrl+2 L
			// number 2 will select row number 3 because java index

						// select cell/ column
			XSSFCell cell = row.getCell(1);
			// call with the object
			// start type from row.get and the ctrl+2 L
			// number 1 will select column number 2

						// select particular item using row and column
			String cellValue = cell.getStringCellValue();
			System.out.println(cellValue);
			// call with the object
			// start type from cell.get and the ctrl+2 L
			// then print out the variable

}



	}

