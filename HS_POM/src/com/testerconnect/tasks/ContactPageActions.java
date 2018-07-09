package com.testerconnect.tasks;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.testerconnect.pages.ContactPage;
import com.testerconnect.tests.TestCaseBase;
import com.testersconnect.common.Utils;

public class ContactPageActions {
	
	ContactPage cp;
public ContactPageActions(){
	cp=PageFactory.initElements(TestCaseBase.driver, ContactPage.class);
}
	public void Contact(String em,String fn,String ln, String jb) {
	Utils.sleep(15000);
	cp.menuContact.click();
	cp.menuItemContact.click();
	Utils.sleep(5000);
	cp.btnCreateContact.click();
	Utils.sleep(5000);
	cp.txtEmail.sendKeys(em);
	Utils.sleep(5000);
	cp.txtFname.sendKeys(fn);
	Utils.sleep(5000);
	cp.txtLastname.sendKeys(ln);
	Utils.sleep(5000);
	cp.txtJobtitle.sendKeys(jb);
	Utils.sleep(5000);
	cp.btnConfirmCreateContact.click();
	Utils.sleep(15000);
	}
	public void verifyCreateContact(String expName) {

		// Utils.sleep(15000);
		// cp.profileContact.click();
		// Utils.sleep(5000);
		cp.backButton.click();
		Utils.sleep(5000);
		boolean rc=cp.profileContact.isDisplayed();
		/*if(rc.equals(true))
		{
			TestCaseBase.test.pass("Contact is created in HubSpot");
		}
		else
		{
			TestCaseBase.test.fail("Contact is not created in HubSpot");
		}*/
		Assert.assertEquals(rc, true);
		}
	public void verifyDeleteContact(String cname) {
		Utils.sleep(15000);
		cp.profileContact.click();
		Utils.sleep(5000);
		cp.btnAction.click();
		Utils.sleep(5000);
		cp.menuitemDelete.click();
		Utils.sleep(5000);
		cp.popupDelete.click();
		Utils.sleep(5000);
		cp.txtContactSearch.sendKeys(cname);
		Utils.sleep(5000);
		
		boolean rc=cp.lblNoContact.isDisplayed();
		Assert.assertEquals(rc, true);
	}
}

