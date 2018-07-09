package com.testerconnect.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
@FindBy(id="username")
public WebElement txtUserName;

@FindBy(id="password")
public WebElement txtPassword;

@FindBy(id="loginBtn")
public WebElement btnLogin;
}
