package com.edureka.module10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.edureka.generic.BasePage;

public class EdurekaFramework2Pompage extends BasePage
{
	@FindBy(xpath = "//*[@class='signin top-signin giTrackElementHeader hidden-xs']")
	private WebElement LNK_login;
	
	@FindBy(xpath = "//*[@id='si_popup_email']")
	private WebElement TXT_emailid;
	
	@FindBy(xpath = "//*[@id='si_popup_passwd']")
	private WebElement TXT_password;
	
	@FindBy(xpath = "//*[@class='clik_btn_log btn-block']")
	private WebElement BTN_login;

	@FindBy(xpath = "//*[@id='search-inp3']")
	private WebElement CLK_HomePageSearchBox;
	
	@FindBy(xpath = "//*[@id='search-inp-overlay-new']")
	private WebElement TXT_InnerSearchBox;
	
	@FindBy(xpath = "//input[@class='new-search-inp']")
	private WebElement TXT_InputSearchText;
	
	@FindBy(xpath = "//*[@class='typeaheadbutton']")
	private WebElement CLK_searchbutton;
	
	@FindBy(xpath = "//*[@id='add-master-courses']//*[@data-gi-action='course click - DevOps Certification Training']")
	private WebElement LNK_DevopsCertificationTraining;
	
	@FindBy(xpath = "//a[text()[contains(.,'ENROLL NOW PAY LATER')]]")
	private WebElement BTN_Enrollnow;
	
	@FindBy(xpath = "//*[@for='batch-14545']")
	private WebElement BTN_WeekendBatch;
	
	@FindBy(xpath = "//*[@class='col-lg-12 col-md-12 col-sm-12 col-xs-12 pymt_box']")
	private WebElement BTN_ProceedToPayment;
	
	@FindBy(xpath = "//*[@class='icon-logo edu-logo-style']")
	private WebElement LNK_Homepage;
	
	@FindBy(xpath = "//*[@class='dropdown userdrop hidden-sm hidden-xs']")
	private WebElement LNK_profilename;
	
	//@FindBy(xpath = "//a[@href='https://www.edureka.co/signout']")
	@FindBy(linkText = "Log Out")
	private WebElement LNK_logout;
	
	
public EdurekaFramework2Pompage(WebDriver driver) {
	super(driver);
	PageFactory.initElements(driver, this);
}
public void clickOnLoginLink(){
	try 		{
		verifyElementPresent(LNK_login);
	   	click(LNK_login);
		log.info("Click successfully on Login Link");
		}
	catch (Exception e){
		log.error("Unable to click on Login Link"+e);
		}
	}
public void setEmailID(String email){
	try		{
		verifyElementPresent(TXT_emailid);	
		TXT_emailid.sendKeys(email);
		log.info("Set successfully on EmailID box");
		}
	catch (Exception e){
		log.error("Unable to set on EmailID box"+e);
		}
	}	
public void setPassword(String password){
	try {
		verifyElementPresent(TXT_password);	
		TXT_password.sendKeys(password);
		log.info("Set successfully on Password box");
		}
	catch (Exception e){
		log.error("Unable to set on Password box"+e);
		}
	}
public boolean clickOnLoginButton(){
	try	{
		verifyElementPresent(BTN_login);
		click(BTN_login);
		return true;
		}
	catch (Exception e)	{
		return false;
		}
	}

public void clickOnSearchCourseBox() {
	try {
		verifyElementPresent(CLK_HomePageSearchBox);
		click(CLK_HomePageSearchBox);
		log.info("Click successfully on SearchCoursebox");
		} 
	catch (Exception e) {
		log.error("Unable to click on SearchCoursebox"+e);
		}
	}

public void searchForCourse(String course) {
	try {
		verifyElementPresent(TXT_InnerSearchBox);
		TXT_InnerSearchBox.sendKeys(course);
		TXT_InputSearchText.submit();
		log.info("Click successfully on InnerSearchbox");
	 	} 
	catch (Exception e) {
		log.error("Unable to click on InnerSearchbox"+e);
		}
	}
public void clickOnSearchButton() {
	try {
		verifyElementPresent(CLK_searchbutton);
		click(CLK_searchbutton);
		log.info("Click successfully on Searchbutton");
		} 
	catch (Exception e) {
		log.error("Unable to click on Searchbutton"+e);
		}
	}

public void clickOnSelectedCourse() {
	try {
		verifyElementPresent(LNK_DevopsCertificationTraining);
		click(LNK_DevopsCertificationTraining);
		log.info("Click successfully on selected course");
		}
	catch (Exception e) {
		log.error("Unable to click on selected course"+e);
		}
	}

public void clickOnEnrollNow() {
	try {
		verifyElementPresent(BTN_Enrollnow);
		click(BTN_Enrollnow);
		log.info("Click successfully on EnrollNow button");
		} 
	catch (Exception e) {
		log.error("Unable to click on EnrollNow button"+e);
		}
	}

public void selectWeekendBatch() {
	try {
		verifyElementPresent(BTN_WeekendBatch);
		click(BTN_WeekendBatch);
		log.info("Select successfully course batch");
		} 
	catch (Exception e) {
		log.info("Unable to select course batch"+e);
		}
	}

public void clickOnPaymentButton() {
	try {
		verifyElementPresent(BTN_ProceedToPayment);
		click(BTN_ProceedToPayment);
		log.info("Click successfully on ProceedtoPayment");
		}
	catch (Exception e) {
		log.error("Unable to click on ProccedtoPayment"+e);
		}
	}

public void goToHomePage() {
	try {
		verifyElementPresent(LNK_Homepage);
		click(LNK_Homepage);
		log.info("Go successfully to homepage");
		} 
	catch (Exception e) {
		log.error("Unable to go to homepage"+e);
		}
	}

public void clickOnProfileButton(){
	try{
		verifyElementPresent(LNK_profilename);
		click(LNK_profilename);
		log.info("click successfully on profile button");
		}
	catch (Exception e){
		log.info("Unable to click on profile button"+e);
		}
	}

public void clickOnLogoutLink(){
	try {
		verifyElementPresent(LNK_logout);
		click(LNK_logout);
		log.info("Click successfully on logout link");
		}
	catch (Exception e){
		log.error("Unable to click on logout link"+e);
		}
	}
}	