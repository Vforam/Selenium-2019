package com.edureka.testscripts;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import com.edureka.generic.BaseTest;
import com.edureka.generic.ExcelOperations;
import com.edureka.pompages.EdurekaFrameworkModule9;


public class EdurekaFrameworkModule9TestScripts extends BaseTest
{
	EdurekaFrameworkModule9 edrklgn = new EdurekaFrameworkModule9(driver);
	
@Test
public void testcase_login(){
	try{
		String[][] credentials = ExcelOperations.getData(FILE_PATH, "LoginInfo");
		
		String email = credentials[1][0];
		String password = credentials[1][1];
		EdurekaFrameworkModule9 edrklgn = PageFactory.initElements(driver, EdurekaFrameworkModule9.class);
		Thread.sleep(2000);
		edrklgn.clickOnLoginLink();
		Thread.sleep(5000);
		edrklgn.setEmailID(email);	
		Thread.sleep(5000);
		edrklgn.setPassword(password);
		edrklgn.clickOnLoginButton();
		Thread.sleep(3000);
		edrklgn.clickOnCommunityLink();
		Thread.sleep(3000);
		edrklgn.clickOnBlogLink();
		edrklgn.clickOnSeleniumBlogLink();
		edrklgn.clickOnInterviewQuestions();
		edrklgn.clickOnTopInterviewQuestions();
		Thread.sleep(3000);
		edrklgn.clickOnLinkHome();
		Thread.sleep(3000);
		edrklgn.clickOnProfileButton();
		edrklgn.clickOnLogoutLink();
		edrklgn.verifyTitle("edureka");
		logger.info("testcase_login has been executed successfully");
		
		}
		catch(Exception e)
		{
		 logger.info("Test case testcase_login failed"+e);
		}
	}
}

