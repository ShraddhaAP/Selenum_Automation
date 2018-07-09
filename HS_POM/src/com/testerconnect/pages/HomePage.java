package com.testerconnect.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
@FindBy(linkText="Sign out")
public WebElement lnkSignOut;

@FindBy(xpath="//img[@class=' nav-avatar ']")
public WebElement userAccount;

@FindBy(xpath="//img[@class=' nav-avatar ']")
public WebElement profileimg;

@FindBy(xpath="//div[@class='user-info-email']")
public WebElement profile_Email;

}

