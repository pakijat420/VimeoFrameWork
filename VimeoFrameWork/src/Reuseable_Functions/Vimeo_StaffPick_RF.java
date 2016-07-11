package Reuseable_Functions;

import org.openqa.selenium.WebDriver;

import ObjectRepo.Vimeo_StaffPick_OR;



public class Vimeo_StaffPick_RF extends Vimeo_StaffPick_OR{

	public Vimeo_StaffPick_RF(WebDriver driver) {
		super(driver);

	}

	public void searchtxt(String txt) {
		
		getsearchvideotxt().sendKeys(txt);
	}
}
