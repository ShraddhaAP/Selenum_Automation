package com.testerconnect.tasks;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.testerconnect.pages.LoginPage;
import com.testerconnect.tests.TestCaseBase;
import com.testersconnect.common.Utils;

public class LoginpageActions {
	
	LoginPage lp;
	public LoginpageActions() {
		//lp is PageObject,PageFactory is class 
		 lp=PageFactory.initElements(TestCaseBase.driver,LoginPage.class); 
		
	}
	public void login(String un,String pwd) {
		lp.txtUserName.sendKeys(un);
		lp.txtPassword.sendKeys(pwd);
		lp.btnLogin.click();
		Utils.sleep(5000);
	}
public void verifySignOut() {
	boolean rc =lp.btnLogin.isDisplayed();
	Assert.assertEquals(rc, true);
}
}
