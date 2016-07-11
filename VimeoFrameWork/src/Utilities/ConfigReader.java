package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	Properties prop;
	
	public ConfigReader()  {
		
		try {
			File src = new File("C:\\Users\\Jehan Aurangzeb\\Documents\\Selenium\\VimeoFrameWork\\Configration\\config.property");
			
			FileInputStream fis = new FileInputStream(src);
			
			prop = new Properties();
			
			prop.load(fis);
		} 
		catch (Exception e) {
			
			System.out.println("Exception is ==" + e.getMessage());
		}
			
		}
	
	public String getvimeourl()  {
		
		String text= prop.getProperty("VimeoURL");
		return text;
	}
	
	public String getyturl()  {
		
		String text= prop.getProperty("YoutubeURL");
		return text;
	}
	
}


