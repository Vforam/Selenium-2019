package com.edureka.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.edureka.generic.BasePage;
	
public class EdurekaFrameworkModule9 extends BasePage
{

	@FindBy(xpath = "//*[@class='signin top-signin giTrackElementHeader hidden-xs']")
	private WebElement LNK_login;
	
	@FindBy(xpath = "//*[@id='si_popup_email']")
	private WebElement TXT_emailid;
	
	@FindBy(xpath = "//*[@id='si_popup_passwd']")
	private WebElement TXT_password;
	
	@FindBy(xpath = "//*[@class='clik_btn_log btn-block']")
	private WebElement BTN_login;
	
	@FindBy(xpath = "//*[@class='dropdown forum_blog hidden-xs']")
	private WebElement LNK_community;
	
	@FindBy(xpath = "//a[text()[contains(.,'Blog')]][1]")
	private WebElement LNK_blog;
	
	@FindBy(xpath = "//a[text()[contains(.,'Selenium tutorial')]]")
	private WebElement LNK_seleniumTutorialBlog;
	
	@FindBy(xpath = "//*[@aria-controls='collapse86401']")
	private WebElement LNK_interviewQuestions;
	
	@FindBy(xpath = "//a[text()[contains(.,'Top Selenium Interview Questions And Answers You Must Prepare In 2019')]]")
	private WebElement LNK_topSeleniumInterviewQue;
	
	@FindBy(xpath = "//html/body/nav/div/ol/li[1]/a")
	private WebElement LNK_Home;
	
	@FindBy(xpath = "//*[@class='dropdown userdrop hidden-sm hidden-xs']")
	private WebElement LNK_profilename;
	
	@FindBy(xpath = "//a[@href='https://www.edureka.co/signout']")
	private WebElement LNK_logout;
	
	public EdurekaFrameworkModule9(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}	
	public void clickOnLoginLink(){
		try 		{
		   verifyElementPresent(LNK_login);
		   click(LNK_login);
			}
		catch (Exception e){
			}
	}
		public void setEmailID(String email){
			try		{
			  verifyElementPresent(TXT_emailid);	
			  TXT_emailid.sendKeys(email);
				}
			catch (Exception e){
				}
		}	
		public void setPassword(String password){
			try {
			verifyElementPresent(TXT_password);	
			TXT_password.sendKeys(password);
				}
			catch (Exception e){
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
		
	public void clickOnCommunityLink(){
		try	{
			verifyElementPresent(LNK_community);
			click(LNK_community);
			}
		catch (Exception e)	{
			}
	}
	public void clickOnBlogLink(){
		try	{
			verifyElementPresent(LNK_blog);
			click(LNK_blog);
			}
		catch (Exception e) {
			}
	}
	public void clickOnSeleniumBlogLink(){
		try	{
			verifyElementPresent(LNK_seleniumTutorialBlog);
			click(LNK_seleniumTutorialBlog);
			}
		catch (Exception e)	{
			}
	}
	public void clickOnInterviewQuestions(){
		try	{
			verifyElementPresent(LNK_interviewQuestions);
			click(LNK_interviewQuestions);
			}
		catch (Exception e) {
			}
	}
	public void clickOnTopInterviewQuestions(){
		try
		{
			verifyElementPresent(LNK_topSeleniumInterviewQue);
			click(LNK_topSeleniumInterviewQue);
			}
		catch (Exception e) {
			}
	}
	public void clickOnLinkHome(){
		try{
			verifyElementPresent(LNK_Home);
			click(LNK_Home);
			}
		catch (Exception e) {
			}
	}

	public void clickOnProfileButton(){
		try{
			verifyElementPresent(LNK_profilename);
			click(LNK_profilename);
			}
		catch (Exception e){
			}
	}
	
	public void clickOnLogoutLink(){
		try {
			verifyElementPresent(LNK_logout);
			click(LNK_logout);
			}
		catch (Exception e){
			}
	}
}
	


	

