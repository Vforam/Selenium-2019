package com.edureka.module10;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.edureka.generic.BaseTest;
import com.edureka.generic.ExcelOperations;

public class EdurekaFramework2TestScripts  extends BaseTest
{
	EdurekaFramework2Pompage edrkfrmwrk2 = new EdurekaFramework2Pompage(driver);
@Test
public void testcase_Framework2() {
	try {
		String[][] credentials = ExcelOperations.getData(FILE_PATH, "LoginInfo");
		
		String email = credentials[1][0];
		String password = credentials[1][1];
		EdurekaFramework2Pompage edrkfrmwrk2 = PageFactory.initElements(driver, EdurekaFramework2Pompage.class);
		Thread.sleep(3000);
		edrkfrmwrk2.clickOnLoginLink();
		Thread.sleep(3000);
		edrkfrmwrk2.setEmailID(email);
		Thread.sleep(3000);
		edrkfrmwrk2.setPassword(password);
		Thread.sleep(3000);
		edrkfrmwrk2.clickOnLoginButton();
		Thread.sleep(3000);
		edrkfrmwrk2.clickOnSearchCourseBox();
		edrkfrmwrk2.searchForCourse("DevOps");
		Thread.sleep(3000);
		edrkfrmwrk2.clickOnSelectedCourse();
		Thread.sleep(3000);
		edrkfrmwrk2.clickOnEnrollNow();
		Thread.sleep(3000);
		edrkfrmwrk2.selectWeekendBatch();
		Thread.sleep(3000);
		edrkfrmwrk2.clickOnPaymentButton();
		Thread.sleep(3000);
		edrkfrmwrk2.goToHomePage();
		Thread.sleep(3000);
		edrkfrmwrk2.clickOnProfileButton();
		Thread.sleep(3000);
		edrkfrmwrk2.clickOnLogoutLink();
		
		logger.info(" testcase_Framework2 has been executed successfully");
		} 
	catch (Exception e) {
		logger.error("Test case testcase_Framework2 failed"+e);
		}
	}
}
