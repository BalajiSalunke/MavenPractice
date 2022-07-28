package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet {
	public static String readData(int r,int c) throws IOException {
	//step-1 get the path	
	String path=System.getProperty("C:\\Users\\Admin\\eclipse-workspace\\Maven-Practice\\src\\test\\resources\\TestData.xlsx");	
	
	//step-2 use file class
	File file = new File(path);
	
	//step-3 read file
	FileInputStream fis = new FileInputStream(file);
	
	//step-4 handling excel workbook
	XSSFWorkbook wb = new XSSFWorkbook(fis); 
	
	//step-5 locate sheet inside workbook
	XSSFSheet sheet= wb.getSheet("Sheet1");
	
	//step-6 get row and column
	XSSFRow row=sheet.getRow(r);
	XSSFCell cell=row.getCell(c);
	
	//step-7 get value from cell
	String value= cell.getStringCellValue();
	
	//step-8 close workbook
	wb.close();
	
	return value;
	}

}
