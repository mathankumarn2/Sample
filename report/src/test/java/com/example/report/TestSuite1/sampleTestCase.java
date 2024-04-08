package com.example.report.TestSuite1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

public class sampleTestCase {

	@Test
    public static void main() {
        // Set the path to chromedriver.exe in your system
  
        
        WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
				
        
        // Open Google
        driver.get("https://www.google.com");
        
        // Find the search box element and enter the search query
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium testing");
        searchBox.sendKeys(Keys.RETURN);
        
        // Verify if the search results page contains the search query in the title
        String pageTitle = driver.getTitle();
        if (pageTitle.contains("Selenium testing")) {
            System.out.println("Search successful!");
        } else {
            System.out.println("Search unsuccessful!");
        }
        
        // Close the browser
        driver.quit();
    }
}
