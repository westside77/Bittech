package com.TestPackages;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import com.frameworkPacage.BrowserFactory;
import com.frameworkPacage.CaptureScreenShot;
import com.uiPackages.BookFlightPage;
import com.uiPackages.FlightConfirmationPage;
import com.uiPackages.FlightFinderPage;
import com.uiPackages.LoginPage;
import com.uiPackages.SelectFlightPage;

public class TestCaseClass extends HelperClass {
	
	public TestCaseClass () {
		
		}
	
	@Test
	public void returnTicket() {
		try {
			System.out.println("inreturnTicket");
			driver.get("https://www.expedia.com/");
			LoginPage loginPage =PageFactory.initElements(driver, LoginPage.class);
			loginPage.loginWordPress("mercury", "mercury");
			FlightFinderPage flightFinderPage = PageFactory.initElements(driver, FlightFinderPage.class);
			flightFinderPage.continueWordPress("1", "NewYork", "July", "12", "London", "September", "15", "BusinesscClass","Unified Airlines" );
			SelectFlightPage selectFlightPage = PageFactory.initElements(driver, SelectFlightPage.class);
			selectFlightPage.departAirlineWordPress("Pangaer Airlines 362");
			selectFlightPage.returnAirlineWordPress("unified Airlines 363");
			selectFlightPage.continu();
			
			BookFlightPage bookFlightPage = PageFactory.initElements(driver, BookFlightPage.class);
			bookFlightPage.purchasePress("Hm", "MD", "Vegitarian", "MasterCard", "1234567890", "12", "2021", "HM", "abdul", "MD");
			FlightConfirmationPage flightConfirmationPage = PageFactory.initElements(driver, FlightConfirmationPage.class);
			String bookingDetailsFile = System.getProperty("user.dir")+ "\\" + "ScreenShots/FlightConfirmationDetails -  "+CaptureScreenShot.getDateTimeStamp()+".png";
			try { CaptureScreenShot.getScreenShot(BrowserFactory.getDriver(), bookingDetailsFile);
				}catch (Exception e) 
			    { e.printStackTrace();
			    }
			
			flightConfirmationPage.logoutPress();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	
	
	

}
