package org.testing.testScripts;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.Assert;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.reporting.ReportHandling;
import org.testing.responseValidation.validateResponse;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.JsonParsing;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesHandle;

import io.restassured.response.Response;

public class TC1_PostRequest_randomNum {
	
	public static String returnIdValue;
	@Test
	public void testCase1() throws IOException {
		
		ExtentReports report = ReportHandling.handleReport();
		ExtentTest tc1 = report.startTest("TC1_PostRequest_randomNum");
		
		System.out.println("TC1_PostRequest_randomNum");
		Properties p = PropertiesHandle.loadProperties("..//APIMarchFW/URI.properties");
		String requestBody = JsonHandle.readJsonData("..//APIMarchFW/src/test/java/org/testing/resources/requestBody.json"); 
		Random r = new Random();
		Integer idValue = r.nextInt();
		
		requestBody = JsonReplacement.assignJsonValue(requestBody, "id", idValue.toString());
		HTTPMethods http = new HTTPMethods(p);
		Response resobj =  http.postMethod(requestBody, "QA_URI");
//		boolean result = validateResponse.statusCodeVAlidate(201, resobj, "TC1_PostRequest_randomNum" );
		Object result = validateResponse.statusCodeVAlidate(201, resobj, "TC1_PostRequest_randomNum" );
		if(result.equals(true)) {
			tc1.log(LogStatus.PASS, "TestCase1 is getting pass");
			report.endTest(tc1);
			report.flush();
		}
		else {
			tc1.log(LogStatus.FAIL, "TestCase1 is getting fail");
			report.endTest(tc1);
			report.flush();
			Assert.assertEquals(result, true, "Assertion failed...");	// Soft assertion - code continue.
		}
		
		
//		Assert.assertTrue(result); //Hard assertion - stops the code (change Object -> Boolean in line above.)
//		Assert.assertEquals(result, true, "Assertion failed...");	// Soft assertion - code continue.
		returnIdValue = JsonParsing.doParsing(resobj, "id");
	}
}