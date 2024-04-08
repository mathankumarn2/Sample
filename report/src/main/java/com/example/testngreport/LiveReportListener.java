package com.example.testngreport;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class LiveReportListener implements ITestListener {
	@Override
	public void onFinish(ITestContext testContext) {
		System.out.println("PASSED TEST CASES:");
		testContext.getPassedTests().getAllResults().forEach(result -> {
			System.out.println(result.getName());
		});

		System.out.println("\nFAILED TEST CASES:");
		testContext.getFailedTests().getAllResults().forEach(result -> {
			System.out.println(result.getName());
		});

		System.out.println("\nTest completed on: " + testContext.getEndDate());
	}
	// Other overridden methods can be implemented as needed

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
		System.out.println("\nStarting TEST CASES:");

		createFile();
	}

	private void createFile() {
		String html = "C:\\Users\\mathankumar.nages\\Documents\\WorkspaceListener\\Listener\\report\\test-output\\Live\\Startreport.txt";
		String htmlContent = readFileToString(html);
// File path where the HTML file will be created
		String filePath = "C:\\Users\\mathankumar.nages\\Documents\\WorkspaceListener\\Listener\\report\\test-output\\sample.html";

// Create the HTML file
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
			writer.write(htmlContent);
			System.out.println("HTML file created successfully at: " + filePath);
		} catch (IOException e) {
			System.err.println("Error creating HTML file: " + e.getMessage());
		}
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		System.out.println("\nPassed TEST CASES:");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		System.out.println("\nFAILED TEST CASES:");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}
	
	public static String readFileToString(String filePath) {
		StringBuilder content = new StringBuilder();
 
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = br.readLine()) != null) {
				content.append(line).append("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
 
		return content.toString();
	}
}
