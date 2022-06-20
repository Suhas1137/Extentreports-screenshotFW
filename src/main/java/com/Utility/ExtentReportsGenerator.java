package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsGenerator {
public static ExtentReports extent;
	
public static ExtentReports getReports() {
		String path="C:\\Users\\DELL\\eclipse-workspace\\ExtentReportGenScreenshots\\Reports\\index.html";
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Automation Testing");
		reporter.config().setReportName("OrangeHRM");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("System Name", "OrangeHRM Login Verification");
		extent.setSystemInfo("Module Name", "Login verification");
		extent.setSystemInfo("QA", "Suhas");
		extent.setSystemInfo("O.S", "Windows");
		return extent;
	}
}
