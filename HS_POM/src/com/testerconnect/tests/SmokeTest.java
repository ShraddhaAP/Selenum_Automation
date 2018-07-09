package com.testerconnect.tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.testerconnect.tasks.ContactPageActions;
import com.testerconnect.tasks.HomePageActions;
import com.testerconnect.tasks.LoginpageActions;

public class SmokeTest extends TestCaseBase {
	public String HS_UserName;
	public String HS_Password;
	public ExtentTest test;

	@Test(priority = 1, description = "Veify Login page")
	public void verify_HS_Login() {
		test = extent.createTest("VerifyHubSpotLogin");

		// Arrange
		LoginpageActions lpa = new LoginpageActions();
		HomePageActions hpa = new HomePageActions();
		// Act
		lpa.login("potdarshraddha@gmail.com", "Ashley@1377");
		// Assert
		hpa.verifyHSLogin("potdarshraddha@gmail.com");

	}

	@Test(priority = 2, description = "Create Contact")
	public void CreateContact() {
		test = extent.createTest("Verify Create Contact");
		ContactPageActions cpa = new ContactPageActions();
		cpa.Contact("shraddhaashwath@gmail.com", "Shra", "Ashley", "Test Manager");
		cpa.verifyCreateContact("Shra Ashley");
	}

	@Test(priority = 3, description = "Delete Contact")
	public void DeleteContact() {
		test = extent.createTest("Verify Delete Contact");
		ContactPageActions dpa = new ContactPageActions();
		dpa.verifyDeleteContact("Shra Ashley");
	}

	@Test(priority = 4, description = "Verify SignOut functionality in HubSpot")
	public void signOut() {

		test=extent.createTest("Verify HubSpot Signout");
		HomePageActions hp = new HomePageActions();
		hp.signout();

	}

//	@Test(priority = 5, description = "Verify HubSpot is loggedout Successfully")
//
//	public void verifySignout() {
//
//		test=extent.createTest("verifySignout");
//
//		LoginpageActions lpa = new LoginpageActions();
//		lpa.verifySignOut();
//
//	}

}
