package Test_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import Reuseable_Functions.Vimeo_Homepage_Functions;
import Reuseable_Functions.Vimeo_StaffPick_RF;
import Utilities.Base;
import Utilities.ConfigReader;
import Utilities.ExcelDataConfig;

public class Testbase {
	
	Base b = new Base();
	
	WebDriver driver = b.getdriver();
	
	Vimeo_Homepage_Functions hm= PageFactory.initElements(driver, Vimeo_Homepage_Functions.class);
	
	ConfigReader config = new ConfigReader();
	
	ExcelDataConfig exceldata= PageFactory.initElements(driver, ExcelDataConfig.class);
	
	Vimeo_StaffPick_RF Vmsp= PageFactory.initElements(driver, Vimeo_StaffPick_RF.class);
	
	String url = "https://vimeo.com/channels/staffpicks";
	
	
	@BeforeSuite
	public void setup()  {
		
		driver.get(url);
		
		
	
	}
	
	
	@AfterSuite
	public void teardown() {
		
	}
	

	}




