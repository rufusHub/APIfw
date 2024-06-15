package org.testing.testScripts;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;

import org.testing.responseValidation.validateResponse;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;

public class TC3_GetParticular_randomNum {

	@Test
	public void testCase3() throws IOException {
		Properties p = PropertiesHandle.loadProperties("..//APIMarchFW/URI.properties");
		HTTPMethods http = new HTTPMethods(p);
		Response res = http.getParticulartMethod("QA_URI", TC1_PostRequest_randomNum.returnIdValue);
		boolean result = validateResponse.dataValidate(TC1_PostRequest_randomNum.returnIdValue, res, "id", "TC3_GetParticular_randomNum");
		Assert.assertTrue(result);
		Assert.assertEquals(result, true,"Assertion failed...");
	}
}