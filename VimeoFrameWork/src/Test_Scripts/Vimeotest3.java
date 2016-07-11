package Test_Scripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utilities.ExcelDataConfig;

public class Vimeotest3 extends Testbase{
	
//	@Test()
//	public void searchvideo () {
//		
//		hm.getsearchbox().clear();
//		try {
//			hm.getsearchbox().sendKeys(exceldata.getData("Sheet1", 1,0));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		hm.getsearchbttn().click();
//	}
//	
	@Test
	public void GotoJoinPage() {
		
	
		hm.getuserfullname().sendKeys(exceldata.getData("Sheet1", 1, 0));
		hm.getuseremail().sendKeys(exceldata.getData("Sheet1", 2, 0));
		hm.getuserPassword().sendKeys(exceldata.getData("Sheet1", 3, 0));
	}
	
//	@Test
//	public void gotojoinpage() {
//		
//		hm.getjointab();
//		
//		
//	}
	
//	@DataProvider(name= "vimeosearch")
//	public Object [][] passData()  {
//
//		Object[][] data = new Object[3][1];
//		
//		data[0][0] = "salam";
//
//		data[1][0] = "QA";
//
//		data[2][0] = "TEST";
//
//		return data;
//	}

}
