package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	
	XSSFWorkbook wb;
	
	XSSFSheet sheet1;
	
	public ExcelDataConfig() throws Exception {
		
		try {
			File src = new File("C:\\Users\\Jehan Aurangzeb\\Documents\\Selenium\\VimeoFrameWork\\Test Data.xlsx");
			
			FileInputStream fis = new FileInputStream(src);
			
			wb = new XSSFWorkbook(fis);
			
			sheet1= wb.getSheetAt(0);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}



	public String getData(String SheetNumber, int row, int column) {
		
		String data = sheet1.getRow(row).getCell(column).getStringCellValue();
		
		return data;
	}
}








