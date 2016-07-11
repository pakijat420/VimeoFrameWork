package Test_Scripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Vimeotest extends Testbase{
	
	@Test(dataProvider = "vimeosearch")
	public void searchvideo (String txt) {
		
		hm.getsearchbox().clear();
		hm.getsearchbox().sendKeys(txt);
		hm.getsearchbttn().click();
	}
	
//	@Test
//	public void gotojoinpage() {
//		
//		hm.getjointab();
//		
//		
//	}
	
	@DataProvider(name= "vimeosearch")
	public Object [][] passData()  {

		Object[][] data = new Object[3][1];
		
		data[0][0] = "salam";

		data[1][0] = "QA";

		data[2][0] = "TEST";

		return data;
	}

}
