package com.uiPackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SelectFlightPage {
	
WebDriver driver;
	
	public SelectFlightPage (WebDriver driver) {
		this.driver=driver;
		
	}
	@FindBy (how=How.XPATH, using="xpath")
	@CacheLookup
	WebElement BlueSkiesAirlines360_D;
	
	@FindBy (how=How.XPATH, using="xpath")
	@CacheLookup
	WebElement BlueSkiesAirlines361_D;
	
	@FindBy (how=How.XPATH, using="xpath")
	@CacheLookup
	WebElement PangaeaAirlines362_D;

	@FindBy (how=How.XPATH, using="xpath")
	@CacheLookup
	WebElement UnifiedAirlines363_D;
	
	@FindBy (how=How.XPATH, using="xpath")
	@CacheLookup
	WebElement BlueSkiesAirlines360_T;
	
	@FindBy (how=How.XPATH, using="xpath")
	@CacheLookup
	WebElement BlueSkiesAirlines361_T;
	
	@FindBy (how=How.XPATH, using="xpath")
	@CacheLookup
	WebElement PangaeaAirlines362_T;
	
	@FindBy (how=How.XPATH, using="xpath")
	@CacheLookup
	WebElement UnifiedAirlines363_T;
	
	@FindBy (how=How.XPATH, using="xpath")
	@CacheLookup
	WebElement con;
	
	public void departAirlineWordPress(String departAirline) {
		try {
			if(departAirline.equalsIgnoreCase("Blue Skies Airlines 360")) {
				BlueSkiesAirlines360_D.click();
				Thread.sleep(2000);
				
			}
			if (departAirline.equalsIgnoreCase("Blue Skies Airlines 361")) {
				BlueSkiesAirlines361_D.click();
				Thread.sleep(2000);
				
			}
			if (departAirline.equalsIgnoreCase("Pangaea Airlines 362")) {
				PangaeaAirlines362_D.click();
				Thread.sleep(2000);
		    }
			if (departAirline.equalsIgnoreCase("Unified Airlines 363")) {
				UnifiedAirlines363_D.click();
				Thread.sleep(2000);
			}
			
            } catch (InterruptedException e) {
            	e.printStackTrace();
            }
		
	}	
	public void returnAirlineWordPress(String returnAirline) {
		try {
			if(returnAirline.equalsIgnoreCase("Blue Skies Airlines 360") ) {
				BlueSkiesAirlines360_T.click();
				Thread.sleep(2000);
				
			}
			if(returnAirline.equalsIgnoreCase("Blue Skies Airlines 361") ) {
				BlueSkiesAirlines361_T.click();
				Thread.sleep(2000);
			
		    }
			if(returnAirline.equalsIgnoreCase("Pangaea Airlines 362") ) {
				PangaeaAirlines362_T.click();
				Thread.sleep(2000);
			
		    }
			if(returnAirline.equalsIgnoreCase("Unified Airlines 363") ) {
				UnifiedAirlines363_T.click();
				Thread.sleep(2000);
			
		    }
		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}
	
	public void continu () {
		con.click();
		try {
			Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	
	}
