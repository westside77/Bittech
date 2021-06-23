package com.uiPackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FlightFinderPage {
	
WebDriver driver;
	
	public FlightFinderPage (WebDriver driver) {
		this.driver=driver;
		
	}
	@FindBy (how=How.XPATH, using="xpath")
	@CacheLookup
	WebElement roundTrip;
	
	@FindBy (how=How.XPATH, using="xpath")
	@CacheLookup
	WebElement oneWayTrip;
	
	@FindBy (how=How.NAME, using="passCount")
	@CacheLookup
	WebElement passCount;
	
	@FindBy (how=How.NAME, using="fromPort")
	@CacheLookup
	WebElement fromPort;
	
	@FindBy (how=How.NAME, using="fromMonth")
	@CacheLookup
	WebElement fromMonth;
	
	@FindBy (how=How.NAME, using="fromDay")
	@CacheLookup
	WebElement fromDay;
	
	@FindBy (how=How.NAME, using="toPort")
	@CacheLookup
	WebElement toPort;
	
	@FindBy (how=How.NAME, using="toMonth")
	@CacheLookup
	WebElement toMonth;
	
	@FindBy (how=How.NAME, using="toDay")
	@CacheLookup
	WebElement toDay;
	
	@FindBy (how=How.NAME, using="airLine")
	@CacheLookup
	WebElement airLine;
	
	@FindBy (how=How.NAME, using="findFlights")
	@CacheLookup
	WebElement findFlights;
	
	@FindBy (how=How.XPATH, using="business value")
	@CacheLookup
	WebElement serviceClass;
	
	
	public void continueWordPress(String pCount, String fPort, String fMonth, String fDay, String tPort, String tMonth, String tDay, String sClass,  String aLine) {
		try {
			Thread.sleep(2000);
			roundTrip.click();
			Thread.sleep(2000);
			passCount.sendKeys(pCount);
			Thread.sleep(2000);
			fromPort.sendKeys(fPort);
			Thread.sleep(2000);
			fromMonth.sendKeys(fMonth);
			Thread.sleep(2000);
			fromDay.sendKeys(fDay);
			Thread.sleep(2000);
			toPort.sendKeys(tPort);
			Thread.sleep(2000);
			toMonth.sendKeys(tMonth);
			Thread.sleep(2000);
			toDay.sendKeys(tDay);
			Thread.sleep(2000);
			serviceClass.sendKeys(sClass);
			Thread.sleep(2000);
			airLine.sendKeys(aLine);
			Thread.sleep(2000);
			findFlights.click();
			Thread.sleep(2000);
			
		}catch (InterruptedException e) {
			e.printStackTrace();
			
		}
	}
	
	


}
