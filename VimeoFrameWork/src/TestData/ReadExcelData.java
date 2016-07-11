package TestData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File src = new File("C:\\Users\\Jehan Aurangzeb\\Documents\\Selenium\\VimeoFrameWork\\Test Data.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1= wb.getSheetAt(0);
		
		String data0 = sheet1.getRow(1).getCell(0).getStringCellValue();
		
		System.out.println("Data from Excel is  " + data0);
		
		String data1 = sheet1.getRow(1).getCell(1).getStringCellValue();
		
		System.out.println("Data from EXCEL is  " + data1);
	}
	

}
