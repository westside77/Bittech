package com.TestPackages;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import com.frameworkPacage.BrowserFactory;

public class HelperClass {
	
	public @interface AfterSuite {

	}

	public @interface AfterMethod {

	}

	public @interface BeforeMethod {

	}

	public @interface BeforeSuite {

	}

	public static WebDriver driver;
	BrowserFactory obj1;
	
	public HelperClass() {
	}
	
	@BeforeSuite
	public void beforeSuite() {
		
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("in @BeforeClass");
	}
	
	@BeforeMethod
	public void beforeMethodClass() {
		System.out.println("in @beforeMethod");
		HelperClass.driver = BrowserFactory.getDriver("chrome");
		
	}
	
	@AfterMethod
	public void close() {
		
	}
	
	@AfterClass
	public void afterClass() {
		
	}
	
	@AfterSuite
	public void afterSuite() throws IOException {
		System.out.println("its worked");
		
		driver.quit();
	}
	

	
	
	 
}


