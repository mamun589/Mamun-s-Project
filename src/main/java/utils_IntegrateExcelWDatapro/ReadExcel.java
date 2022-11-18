package utils_IntegrateExcelWDatapro;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	//public static void main(String[] args) throws IOException {
	//public void readExcel(){
	public String[][] readExcel() throws IOException{
		
		XSSFWorkbook wb = new XSSFWorkbook("./DataTwo/ForDataProvider.xlsx");
		
		//XSSFSheet sheet = wb.getSheet("Sheet1");
		XSSFSheet sheet = wb.getSheetAt(0);
		// we changed to getsheetAt because this method will start the excel sheet from the beginning that means 0
		
					// total row count
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		
					// total column count
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(columnCount);
		// copy this object "String [][] data = new String[3][3];" from ProjectSpecificWrapper under integrateDataProWExcel package
		String [][] data = new String[rowCount][columnCount];
		//instead of [3][3] we used [rowCount][columnCount]
		
					// printing all value using for loop
		for (int i = 1; i <=rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				String cellValue = cell.getStringCellValue();
				System.out.println(cellValue);
				
				//data [0][0] = "TCS";	copy this from ProjectSpecificWrapper just for the format
				//data [i][j] = cellValue; [note: i=1, i-1=1-1=0] then change it i and j and put cellValue which is is the variable				
				data [i-1][j] = cellValue;
				// this cellValue is from "String cellValue = cell.getStringCellValue();" here
				
			}//ends columns for loop
		}//ends rows for loop
		
		return data;
		// add this return type from ProjectSpecificWrapper it will show red then mouse hover on it and click 
		// it will change the return type in the method String[][] instead of void
	}

}

