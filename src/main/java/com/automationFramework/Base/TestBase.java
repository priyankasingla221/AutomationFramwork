package com.automationFramework.Base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automationFramework.Logger.WebdriverEvents;
import com.automationFramework.Utils.Utils;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver wd;
	public Properties prop;
	public FileInputStream file;
	public static Logger logger;
	public EventFiringWebDriver e_driver;
	public WebdriverEvents eventListner;
	public static JavascriptExecutor jse;

	
	public TestBase() {
		try {
			prop= new Properties();
		file = new FileInputStream(
					"C:\\Users\\priya\\eclipse-workspace\\AutomationFramework\\src\\main\\java\\com\\automationFramework\\Configration\\Config");

			prop.load(file);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	@BeforeClass
	public void setupLog(){
		logger = Logger.getLogger(TestBase.class);
		PropertyConfigurator.configure("log4j.properties");
		BasicConfigurator.configure();
		logger.setLevel(Level.INFO);
		
	}

	public void initialsation() {

		String browserName = prop.getProperty("browserName");
		// setting up using bonie garcia. right version downloaded to run application.
		//WebDriverManager.chromedriver().setup();
		//wd = new ChromeDriver();

		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			wd = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			wd = new ChromeDriver();
		case "edge":
			WebDriverManager.edgedriver().setup();
			wd = new ChromeDriver();
			break;

		default: {
			System.out.println("INVALID ENTRY");
		}
		}

		
		
		e_driver = new EventFiringWebDriver(wd);
		eventListner = new WebdriverEvents();
		e_driver.register(eventListner);
		wd =e_driver;
		// maximizing window
		wd.manage().window().maximize();

		//wd.manage().timeouts().implicitlyWait(Utils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		wd.manage().timeouts().pageLoadTimeout(Utils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);

		// load the page
		wd.get(prop.getProperty("URL"));
	}

	@AfterMethod
	public void tearDown() {
		wd.quit();
	}



	public void waitForDocumentCompleteState(int timeOutInSeconds) {
		new WebDriverWait(wd, 15).until((ExpectedCondition<Boolean>) v -> {
			logger.info("Verifying page has loaded......");
			jse = (JavascriptExecutor) wd;
			String documentIsReady = jse.executeScript("return document.readyState").toString();
			while (true) {
				if (documentIsReady.equalsIgnoreCase("complete")) {
					logger.info("Page has loaded completely......");
					return true;
				} else {
					return false;
				}
			}
	 });
	 }
	 
 
}