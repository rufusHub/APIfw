package org.testing.testScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesHandle;


import io.restassured.response.Response;

public class TC4_PutRequest {


	@Test
	public void testCase4() throws IOException {
		
		Properties p = PropertiesHandle.loadProperties("..//APIMarchFW/URI.properties");
		String requestBody = JsonHandle.readJsonData("..//APIMarchFW/src/test/java/org/testing/resources/updaterequestBody.json"); 
		requestBody = JsonReplacement.assignJsonValue(requestBody, "id", TC1_PostRequest.returnIdValue);
		HTTPMethods http = new HTTPMethods(p);
		Response resobj =  http.putMethod(requestBody, "QA_URI", TC1_PostRequest.returnIdValue);
	}
}
