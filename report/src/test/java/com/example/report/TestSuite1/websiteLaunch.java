package com.example.report.TestSuite1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.deque.html.axecore.extensions.WebDriverExtensions;
import com.deque.html.axecore.results.Results;
import com.deque.html.axecore.selenium.AxeBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class websiteLaunch {
	 //WebDriver driver;
//	 ExtentReports extent;
//	 ExtentTest test;

//	@BeforeMethod
//	public void setUp() {
//		
//
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\mathankumar.nages\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//		
//		// Create a new instance of the ChromeDriver
//				driver = new ChromeDriver();
//
//				// Initialize ExtentReports
//				//extent = new ExtentReports();
//
//		// Maximize the browser window
//		driver.manage().window().maximize();
//
//	}

	@Test
	public void testSearchFunctionality() {
		try {
			

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathankumar.nages\\Downloads\\chrome-win64\\chrome-win64\\chromedriver.exe");

			
			// Create a new instance of the ChromeDriver
			
					// Initialize ExtentReports
					//extent = new ExtentReports();

			// Maximize the browser window
			WebDriver driver = new ChromeDriver();

	        // Open a website
	        driver.get("https://www.example.com");
			System.out.println(driver.getCurrentUrl());
//			test = extent.createTest("Search Functionality Test", "Verify search functionality");
//
//			// Find the search input element and enter "testNg"
//
//			driver.get("https://www.google.com");
//			Results axeResult = WebDriverExtensions.analyze(driver);
//			// Results axeResult = new AxeBuilder().analyze(driver);
//
//			ObjectWriter writer = new ObjectMapper().writer().withDefaultPrettyPrinter();
//			String jsonReport = writer.writeValueAsString(axeResult);
//			Assert.assertTrue(axeResult.violationFree(), jsonReport);
//			WebElement search = driver.findElement(By.cssSelector("[aria-label='Search']"));
//			search.sendKeys("testNg");
//			test.log(Status.INFO, "Entered 'testNg' in search input");
//
//			// Wait for 10 seconds (Replace with explicit or implicit wait if possible)
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//
//			// Press Enter key
//			search.sendKeys(Keys.ENTER);
//			test.log(Status.INFO, "Pressed Enter key");
//
//			// Find the logo element and assert if it is displayed
//			WebElement logo = driver.findElement(By.cssSelector("[class='logo']"));
//			Assert.assertTrue(logo.isDisplayed(), "Expected image is displayed");
//			test.log(Status.PASS, "Logo is displayed");
//
//			// Close the browser (Make sure to handle this properly)
    		driver.quit();

		} catch (Exception e) {
			e.getMessage();
		}
	}

//	@AfterMethod
//	public void tearDown() {
//		// Flush ExtentReports and close WebDriver
//		//extent.flush();
//		driver.quit();
//	}
}
