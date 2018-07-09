package com.testerconnect.tasks;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.testerconnect.pages.HomePage;
import com.testerconnect.tests.TestCaseBase;
import com.testersconnect.common.Utils;

public class HomePageActions {
HomePage hp;

	public HomePageActions() {
	hp=PageFactory.initElements(TestCaseBase.driver,HomePage.class);
	}
	public void verifyHSLogin(String expEmail) {
		
		
		Utils.sleep(15000);
		hp.profileimg.click();
		String email=hp.profile_Email.getText();
		Assert.assertEquals(email, expEmail);
	}

	public void signout() {
		hp.userAccount.click();
		hp.lnkSignOut.click();
	}
}
