//package com.example.report.TestSuite1;
//
//import com.deque.html.axecore.extensions.WebDriverExtensions;
//import com.deque.html.axecore.results.Results;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.ObjectWriter;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class Axe_Deque {
//	public void AccessibilityTest() {
//	try {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.pivotaltracker.com/");
//		Results axeResult = WebDriverExtensions.analyze(driver);
//		// Results axeResult = new AxeBuilder().analyze(driver);
//
//		ObjectWriter writer = new ObjectMapper().writer()
//				.withDefaultPrettyPrinter();
//		String jsonReport = writer.writeValueAsString(axeResult);
//		Assertions.assertTrue(axeResult.violationFree(), jsonReport);
//		System.out.print(false);
//		driver.quit();
//	} catch (Exception e) {
//		System.out.print(e.getStackTrace());
//	}
//}
//
