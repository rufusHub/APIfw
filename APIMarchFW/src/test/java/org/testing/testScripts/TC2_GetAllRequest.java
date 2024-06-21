package org.testing.testScripts;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.restassured.response.Response;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.reporting.ReportHandling;
import org.testing.responseValidation.validateResponse;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;


public class TC2_GetAllRequest {
	
	@Test
	public void testCase2() throws IOException {
		
		ExtentReports report = ReportHandling.handleReport();
		ExtentTest tc2 = report.startTest("TC2_GetAllRequest");
		
		Properties p = PropertiesHandle.loadProperties("..//APIMarchFW/URI.properties");
		HTTPMethods http = new HTTPMethods(p);
		Response res = http.getAlltMethod("QA_URI");
		Object result = validateResponse.statusCodeVAlidate(200, res, "TC2_GetAllRequest");
		if(result.equals(true)) {
			tc2.log(LogStatus.PASS, "TestCase2 is getting pass");
			report.endTest(tc2);
			report.flush();
		}
		else {
			tc2.log(LogStatus.FAIL, "TestCase2 is getting fail");
			report.endTest(tc2);
			report.flush();
			Assert.assertEquals(result, true, "Assertion failed...");	// Soft assertion - code continue.
		}
	}
}
