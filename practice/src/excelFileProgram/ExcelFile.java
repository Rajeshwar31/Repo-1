package excelFileProgram;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFile {

	public static void main(String[] args) throws IOException, FileNotFoundException
	{

String address="\\D:\\Excel Lib\\New Microsoft Excel Worksheet.xlsx";
		
		FileInputStream file=new FileInputStream(address);
			
		XSSFWorkbook workbook1  = new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook1.getSheet("Sheet1");
		
//				XSSFRow row=sheet.getRow(0);
//				
//				XSSFCell cell=row.getCell(1);
//				
//				String cellData=cell.getStringCellValue();
//				
//				System.out.println(cellData);
				for(int i=0;i<=3;i++)
				{
					for(int j=0;j<=1;j++)
					{
						XSSFRow row=sheet.getRow(i);
						
						XSSFCell cell=row.getCell(j);
						
						String cellData = cell.getStringCellValue();
						
						System.out.println(cellData);
					}
				}
			
			
			
			
		
		
		
		
		
		
	
	}

}
