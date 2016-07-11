package Reuseable_Functions;

import org.openqa.selenium.WebDriver;

import ObjectRepo.Vimeo_HomePage_OR;

public class Vimeo_Homepage_Functions extends Vimeo_HomePage_OR {

	public Vimeo_Homepage_Functions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clickonjointab() {
		getjointab().click();
	}
	
	public void clickonlogintab() {
		getlogintab().click();
	}
	
	public void clickoncreatetab() {
		
		getcreatetab().click();
	}
	
	public void clickonwatchtab() {
		
		getwatchtab().click();
	}
	
	public void clickonOndemandtab() {
		
		getondemandtab().click();
	}
	
	public void clickonserachbox() {
		getsearchbox().click();
	}

	public void clickonsearchbtn() {
		getsearchbttn().click();
	}
}
