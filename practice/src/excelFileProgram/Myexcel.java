package excelFileProgram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Myexcel {
	public static void main(String[] args) throws IOException {
		
		
		//file location
		String address = "\\D:\\Excel Lib\\New Microsoft Excel Worksheet.xlsx";
		//opening the file & reading it
		FileInputStream file = new FileInputStream(address);
		//workbook opening & reading
		XSSFWorkbook excelbook = new XSSFWorkbook(file);
		//sheet opening & reading
		XSSFSheet sheet = excelbook.getSheet("Rupesh");
		//now row
		XSSFRow row = sheet.getRow(0);
		//column/cell
		XSSFCell cell = row.getCell(0);
		
		String username = cell.getStringCellValue();
		System.out.println(username);
		
		
		XSSFRow row1 =sheet.getRow(1);
		XSSFCell cell1 = row1.getCell(0);
		String password= cell1.getStringCellValue();
		System.out.println(password);


		//With --->methodChaining
		String username1=excelbook.getSheet("Rupesh").getRow(0).getCell(0).getStringCellValue();
		System.out.println(username1);
		
		
	}

}
