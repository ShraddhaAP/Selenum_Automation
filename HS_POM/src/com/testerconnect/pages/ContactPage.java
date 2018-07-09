package com.testerconnect.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage {
@FindBy(xpath="//a[@id='nav-primary-contacts-branch']")
	public WebElement menuContact;
	
@FindBy(xpath="//a[@id='nav-secondary-contacts']")
	public WebElement menuItemContact;

@FindBy(xpath="//span/span[.='Create contact']")
public WebElement btnCreateContact;

@FindBy(xpath="//input[@data-field='email']")
public WebElement txtEmail;

@FindBy(xpath="//input[@data-field='firstname']")
public WebElement txtFname ;

@FindBy(xpath="//input[@data-field='lastname']")
public WebElement txtLastname;

@FindBy(xpath="//input[@data-field='jobtitle']")
public WebElement txtJobtitle;

@FindBy(xpath="//button[@data-selenium-test='base-dialog-confirm-btn']")
public WebElement btnConfirmCreateContact;

@FindBy(xpath="//a[.='Shra Ashley']")
public WebElement profileContact;

@FindBy(xpath="//span[@class='private-icon private-icon__low private-breadcrumbs__arrow private-breadcrumbs__arrow--back']")
public WebElement backButton;

@FindBy(xpath="//button[@data-selenium-test='profile-settings-actions-btn']")
public WebElement btnAction;

@FindBy(xpath="//i18n-string[text()='Delete']")
public WebElement menuitemDelete;

@FindBy(xpath="//button[@data-selenium-test='delete-dialog-confirm-button']")
public WebElement popupDelete;

@FindBy(xpath="//input[@type='search']")
public WebElement txtContactSearch;

@FindBy(xpath="//h2[text()='No contacts match the current filters.']")
public WebElement lblNoContact;

}

