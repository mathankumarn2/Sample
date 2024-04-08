/*
 * package com.example.testngreport; import org.testng.ISuite; import
 * org.testng.ISuiteResult; import org.testng.ITestContext;
 * 
 * public class ExtentReporterNG implements IReporter { private ExtentReports
 * extent;
 * 
 * @Override public void generateReport(List<XmlSuite> xmlSuites, List<ISuite>
 * suites, String outputDirectory) { extent = new ExtentReports(outputDirectory
 * + File.separator + "ExtentReportTestNG.html", true); for (ISuite suite :
 * suites) { Map<String, ISuiteResult> result = suite.getResults(); for
 * (ISuiteResult r : result.values()) { ITestContext context =
 * r.getTestContext(); buildTestNodes(context.getPassedTests(), LogStatus.PASS);
 * buildTestNodes(context.getFailedTests(), LogStatus.FAIL);
 * buildTestNodes(context.getSkippedTests(), LogStatus.SKIP); } }
 * extent.flush(); extent.close(); }
 * 
 * private void buildTestNodes(IResultMap tests, LogStatus status) { if
 * (tests.size() > 0) { for (ITestResult result : tests.getAllResults()) {
 * ExtentTest test = extent.startTest(result.getMethod().getMethodName());
 * test.getTest().startedTime = getTime(result.getStartMillis());
 * test.getTest().endedTime = getTime(result.getEndMillis()); // Assign
 * categories, log messages, etc. extent.endTest(test); } } }
 * 
 * private Date getTime(long millis) { Calendar calendar =
 * Calendar.getInstance(); calendar.setTimeInMillis(millis); return
 * calendar.getTime(); } }
 */