package org.testing.reporting;

import com.relevantcodes.extentreports.ExtentReports;

public class ReportHandling {

	public static ExtentReports handleReport() {
		
		ExtentReports rep = new ExtentReports("/home/rufo/logs/rep1.html", false);
		return rep;
	}
}
