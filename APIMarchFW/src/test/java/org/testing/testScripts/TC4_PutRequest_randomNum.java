

package org.testing.testScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.JsonParsing;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC4_PutRequest_randomNum {

	@Test
	public void testCase4() throws IOException {
		
		Properties p = PropertiesHandle.loadProperties("..//APIMarchFW/URI.properties");
		String requestBody = JsonHandle.readJsonData("..//APIMarchFW/src/test/java/org/testing/resources/updaterequestBody.json"); 
		requestBody = JsonReplacement.assignJsonValue(requestBody, "id", TC1_PostRequest_randomNum.returnIdValue);
		HTTPMethods http = new HTTPMethods(p);
		Response resobj =  http.putMethod(requestBody, "QA_URI", TC1_PostRequest_randomNum.returnIdValue);
	}
}

