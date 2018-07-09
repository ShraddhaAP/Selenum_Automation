package com.testerconnect.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestCaseBase {

	String HS_URL = "https://app.hubspot.com/login";
	public static WebDriver driver;
	ExtentReports extent;
	

	@BeforeTest
	public void init() {
		// initialize the HtmlReporter
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("SmokeTestReport.html");

		// initialize ExtentReports and attach the HtmlReporter
		 extent= new ExtentReports();
		 
		// attach only HtmlReporter
		extent.attachReporter(htmlReporter);
		htmlReporter.loadXMLConfig(System.getProperty("user.dir")+"\\Extent-Config.xml");
		System.setProperty("webdriver.chrome.driver", "D:\\ws\\HS_POM\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(HS_URL);
		driver.manage().window().maximize();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterTest
	public void cleanup() {
		
		// driver.quit();
		extent.flush();
	}

}
