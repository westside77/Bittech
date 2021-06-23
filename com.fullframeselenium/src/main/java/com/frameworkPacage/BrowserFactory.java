package com.frameworkPacage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	public static WebDriver driver;
	
	public BrowserFactory() {
		
	}
	
	public static WebDriver getDriver () {
		if (driver == null) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notification");
			options.setPageLoadStrategy(PageLoadStrategy.NONE);
			System.setProperty("webdriver.chrome.driver", "/Users/goldenlifestyle/Desktop/Bittech BTC201201/drivers/chromedriver");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(45,TimeUnit.SECONDS);

		}
		return driver;
	}

	public static WebDriver getDriver (String browserName) {
		if (driver == null) {
			if(browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "/Users/goldenlifestyle/Desktop/Bittech BTC201201/drivers/geckodriver");
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(45,TimeUnit.SECONDS);
			}
			else if(browserName.equalsIgnoreCase("chrome")) {
				System.out.println("in Chrome");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(45,TimeUnit.SECONDS);
				
				
			}
		}
		return driver;
	}
	
	
}

