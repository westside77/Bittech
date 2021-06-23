package com.uiPackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FlightConfirmationPage {
	
	
WebDriver driver;
	
	public FlightConfirmationPage (WebDriver driver) {
		this.driver=driver;
		
	}
	@FindBy (how=How.XPATH, using="xpath")
	@CacheLookup
	WebElement logout;
	
	
	public void logoutPress() {
		logout.click();
	}
	

}
