package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.Base;

public class Vimeo_HomePage_OR extends Base{
	
	public WebDriver driver;
	public Vimeo_HomePage_OR(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public By Jointab = By.xpath(".//*[@id='topnav_desktop']/div/nav/ul/li[1]/a");
	public WebElement getjointab() {
		return 
				driver.findElement(Jointab);
	}
	
	public By Logintab = By.xpath(".//*[@id='topnav_desktop']/div/nav/ul/li[2]/a");
	public WebElement getlogintab() {
		return 
				driver.findElement(Logintab);
	}
			
	public By Createtab = By.xpath(".//*[@id='topnav_desktop']/div/nav/ul/li[3]/a");
	public WebElement getcreatetab() {
		return 
				driver.findElement(Createtab);
	}
	
	public By Watchtab = By.xpath(".//*[@id='topnav_desktop']/div/nav/ul/li[4]/a");
	public WebElement getwatchtab() {
		return 
				driver.findElement(Watchtab);
	}
	
	public By OnDemandtab = By.xpath(".//*[@id='topnav_desktop']/div/nav/ul/li[5]/a");
	public WebElement getondemandtab() {
		return 
				driver.findElement(OnDemandtab);
	}
	
	public By Searchbox = By.xpath(".//*[@id='topnav_desktop']/div/div/form/input");
	public WebElement getsearchbox() {
		return 
				driver.findElement(Searchbox);
	}
	
	public By Searchbttn = By.xpath(".//*[@id='topnav_desktop']/div/div/form/button");
	public WebElement getsearchbttn() {
		return 
				driver.findElement(Searchbttn);
	}
	
	public By UserFullName = By.id("name");
	public WebElement getuserfullname() {
		return 
				driver.findElement(UserFullName);
	
	}
	
	public By UserEmail = By.id("signup_email");
	public WebElement getuseremail() {
		return 
				driver.findElement(UserEmail);
	}
	
	public By UserPassword = By.id("signup_password");
	public WebElement getuserPassword() {
		return 
				driver.findElement(UserPassword);
	}
	
}
