package com.edureka.generic;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import com.edureka.generic.ExcelOperations;


public class BaseTest implements AutoConst{
	protected Logger logger = Logger.getLogger(BaseTest.class);
	public static WebDriver driver = null;					
	public static WebDriverWait wait = null;

	@Parameters("browser")
	@BeforeMethod
	public void launchBrowser(String browser){
		if(browser.equalsIgnoreCase("CHROME")){	
			System.setProperty(CHROME_KEY,CHROME_VALUE);
			driver = new ChromeDriver();
		}
		else
		{
		  Reporter.log("Invalid browser selection");
		}
		wait = new WebDriverWait(driver,20);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(APP_URL);
		logger.info("open browser successfully");
	}
		
	@AfterMethod
	public void writeResult(ITestResult result){
	    try {
	    	System.out.println(result.getName());
	        if(result.getStatus() == ITestResult.SUCCESS){
	        //log.info("@AfterMethod: Method- has Passed");
	        System.out.println("Log Message:: @AfterMethod: Method- has Passed");
	        ExcelOperations.updateStatus(FILE_PATH, "TestResult", "Pass");
	        }
	        else if(result.getStatus() == ITestResult.FAILURE){
	        		System.out.println("Log Message:: @AfterMethod: Method- has Failed");
	        		ExcelOperations.updateStatus(FILE_PATH, "TestResult", "Fail");
	        }
	        else if(result.getStatus() == ITestResult.SKIP){
	            	System.out.println("Log Message::@AfterMethod: Method-- has Skipped");
	        }
	    }
	    catch(Exception e){
	        log.info(e.getMessage());
	        e.printStackTrace();
	        }
	}
	
	@AfterMethod
	public void closeBrowser(){
		log.info("closing browser");
		driver.quit();
	}
}
