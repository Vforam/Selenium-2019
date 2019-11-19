package com.edureka.generic;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage{
	public static final FluentWait<WebDriver> wait = null;
	public WebDriver driver = null;		
	public Actions action = null;
	public Logger log = Logger.getLogger(BasePage.class);
	public BasePage(WebDriver browser)
	{
		driver = browser;
	}
	public void verifyTitle(String expectedTitle){
		WebDriverWait wait=new WebDriverWait(driver, 20);
		try 
		{
		wait.until(ExpectedConditions.titleContains(expectedTitle));
		String title=driver.getTitle();
		Assert.assertEquals(title, expectedTitle);
		}
		catch (Exception e) 
		{
		}
	}
	
	public void verifyElementPresent(WebElement ele){
		WebDriverWait wait = new WebDriverWait(driver, 20);
		try 
		{
		 wait.until(ExpectedConditions.visibilityOf(ele));
		}
		catch (Exception e) 
		{
		}
	}
	
	public void mouseHover(WebElement ele){
	try {
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		}
	catch (Exception e) 
		{
		}
	}
	public void click(WebElement ele) throws InterruptedException{
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		try 
		{
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			ele.click();
		}
		catch (Exception e) 
		{
			System.out.print(e);
		}
	}
	
	public void goToPopupWindow (String container) throws InterruptedException{
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(container));
	}
	public void openInNewTab(WebElement ele){
		try 
		{
			Actions action=new Actions(driver);
			action.contextClick(ele).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		}
		catch (Exception e) 
		{
		}
	}
	
	public void switchBackToScreen(String ActualURL){
		WebDriverWait wait=new WebDriverWait(driver,20);
		try 
		{
			ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
			wait.until(ExpectedConditions.urlToBe(ActualURL));
			driver.switchTo().window(tabs.get(0));        
		    driver.get(ActualURL);
		}
		catch (Exception e) 
		{
		
		}
	}
	public void navigateBack(String Exp_URL){
		WebDriverWait wait=new WebDriverWait(driver,20);
		try 
		{
			wait.until(ExpectedConditions.urlToBe(Exp_URL));
			driver.navigate().back();
		}
		catch (Exception e)
		{
		}
	}
}