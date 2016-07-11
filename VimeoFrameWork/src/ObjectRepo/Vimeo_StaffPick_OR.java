package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Vimeo_StaffPick_OR {
	
	
	public WebDriver driver;
	
	 public Vimeo_StaffPick_OR(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public By searchvideotxtfield = By.xpath(".//*[@id='topnav_desktop']/div/div/form/input");
	
	public WebElement getsearchvideotxt() {
		
		return 
				
				driver.findElement(searchvideotxtfield);
		
	}
	
	public By Jointab = By.xpath(".//*[@id='topnav_desktop']/div/nav/ul/li[1]/a");
	
	public WebElement getjointab() {
		
		return
				driver.findElement(Jointab);
	}

}
