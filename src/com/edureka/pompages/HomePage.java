package com.edureka.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.edureka.generic.BasePage;

public class HomePage extends BasePage
{
	@FindBy(xpath = "//input[@type='email']")
	private WebElement TXT_email;
	
	@FindBy(xpath = "//div[@class='ZFr60d CeoRYc']")
	private WebElement BTN_next1;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement TXT_password;
	
	@FindBy(xpath = "//span[text()='Next']")
	private WebElement BTN_next2;
	
	@FindBy(xpath = "//div[@id=':wo']//div[@role='button']")
	private WebElement BTN_compose;
	
	@FindBy(xpath = "//div[@id=':yv']")
	private WebElement TXT_To;
	
	@FindBy(xpath = "//input[@placeholder='Subject']")
	private WebElement TXT_subject;
	
	@FindBy(xpath = "//div[@role='textbox']")
	private WebElement BOX_txtbox;
	
	@FindBy(xpath = "//div[@class='dC']")
	private WebElement BTN_send;
	
	@FindBy(xpath = "//a[@class='gb_B gb_Da gb_g']")
	private WebElement LNK_signout;
	
	@FindBy(id="gb_71")
	private WebElement BTN_signout;	
	
	
	public HomePage(WebDriver browser) 
	{
		super(browser);
		PageFactory.initElements(driver, this);
	}
	public boolean clickOnEmail()
	
		{
		try 
		{
	verifyElementPresent(TXT_email);
		click(TXT_email);
		TXT_email.sendKeys("email id");
		return true;
		}
		catch(Exception e) 
		{
		return false;
		}	
		}


public void click(WebElement tXT_email2) {
	}

public boolean clickOnNext1()
		{
		try 
		{
		verifyElementPresent(BTN_next1);
		click(BTN_next1);	
		return true;
		}
		catch(Exception e) 
		{
		return false;
		}
		}
	public boolean enterPassword()
		{
		try 
		{
		verifyElementPresent(TXT_password);
		click(TXT_password);
		TXT_password.sendKeys("123456");
		return true;
		}
		catch(Exception e)
		{
		return false;
		}
		}

	public boolean clickOnNext2()
		{
		try 
		{
		verifyElementPresent(BTN_next2);
		click(BTN_next2);	
		return true;
		}
		catch(Exception e)
		{
		return false;
		}
		}
	public boolean clickOnCompose()
		{
		try 
		{
		verifyElementPresent(BTN_compose);
		click(BTN_compose);	
		return true;
		}
		catch(Exception e)
		{
		return false;
		}
		}
	public boolean clickOnRecipients()
		{
		try 
		{
		verifyElementPresent(TXT_To);
		click(TXT_To);	
		TXT_To.sendKeys("abcd@gmail.com");
		return true;
		}
		catch(Exception e)
		{
		return false;
		}
		}
	public boolean clickOnSubject()
		{
		try 
		{
		verifyElementPresent(TXT_subject);
		click(TXT_subject);
		TXT_subject.sendKeys("Selenium Class 2019");
		return true;
		}
		catch(Exception e)
		{
		return false;
		}
		}
	public boolean enterTextMessage()
		{
		try 
		{
		verifyElementPresent(BOX_txtbox);
		click(BOX_txtbox);
		BOX_txtbox.sendKeys("Please find the attached file");
		return true;
		}
		catch(Exception e)
		{
		return false;
		}
		}
	public boolean clickOnSend()
		{
		try 
		{
		verifyElementPresent(BTN_send);
		click(BTN_send);	
		return true;
		}
		catch(Exception e)
		{
		return false;
		}
		}
	public boolean clickOnSignoutLink()
		{
		try 
		{
		verifyElementPresent(LNK_signout);
		click(LNK_signout);	
		return true;
		}
		catch(Exception e)
		{
		return false;
		}
		}
	

	public boolean clickOnSignout()
		{
		try 
		{
		verifyElementPresent(BTN_signout);
		click(BTN_signout);	
		return true;
		}
		catch(Exception e)
		{
		return false;
		}
		}

}



